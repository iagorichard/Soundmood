package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *Classe responsável pelo tipo de usuário Premium
 * @author Leylane
 */
public final class PremiumUser extends User{
    /**Construtor para a classe Premium.
     * @author IagoRichard
     */
    
    private long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String passwordTip;
    
   //como fazer essa parte? 
   // public PremiumUser(long id, String name, String username, String password, String email, String passwordTip){
   //     GravaPremiumUser(id, name, username, password, email, passwordTip);
   // }
    
    public PremiumUser(long id, String name, String username, String password, String email, String passwordTip){
    
        setId(id);
        setName(name);
        setUserName(username);
        setPassword(password);
        setEmail(email);
        setPasswordTip(passwordTip);
    }
    
    
    @Override
    public String gravaUser(){
       
        try{
            //INSERT INTO DATABASE
            Connection conne =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "iagorrs", "iago2014");
 
            String sql = "insert into usuario " 
                    + "(id,user_name,tipo,nome,email,senha,dica_senha,id_tagmood,id_tagstatus) " 
                    + "values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conne.prepareStatement(sql);
            
            stmt.setInt(1, 1);
            stmt.setString(2, this.username);
            stmt.setString(3, "premium");
            stmt.setString(4, this.name);
            stmt.setString(5, this.email);
            stmt.setString(6, this.password);
            stmt.setString(7, this.passwordTip);
            stmt.setInt(8, 1);
            stmt.setInt(9, 1);
            
            stmt.execute();
            
            return "Sucesso";
            
        }catch(Exception e){
            return "Exception" + e;
        }
        
       
        
    }

    /**
     * @return the id
     *
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     * 
     */
    @Override
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     * 
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     * 
     */
    public void setUserName(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     * 
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     * 
     */
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the passwordTip
     */
    public String getPasswordTip() {
        return passwordTip;
    }

    /**
     * @param passwordTip the passwordTip to set
     * 
     */
    @Override
    public void setPasswordTip(String passwordTip) {
        this.passwordTip = passwordTip;
    }
    
    
}
