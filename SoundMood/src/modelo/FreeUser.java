package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

/**Classe para objetos do FreeUser, usuários do tipo free, a classe herdará da classe 'User'.
 * @author IagoRichard
 * @version 0.0
 */

public final class FreeUser extends User {
    
    /**Construtor para a classe FreeUser.
     * @author IagoRichard
     */
    
    private long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String passwordTip;
    
    public FreeUser(long id, String name, String username, String password, String email, String passwordTip){
    
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
            Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "projeto", "123");
 
            String sql = "insert into usuario " 
                    + "(id,user_name,tipo,nome,email,senha,dica_senha,id_tagmood,id_tagstatus) " 
                    + "values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, 1);
            stmt.setString(2, this.username);
            stmt.setString(3, "free");
            stmt.setString(4, this.name);
            stmt.setString(5, this.email);
            stmt.setString(6, this.password);
            stmt.setString(7, this.passwordTip);
            stmt.setInt(8, 1);
            stmt.setInt(9, 1);
            
            stmt.execute();
            conn.close();
            
            return "Sucesso";
            
        }catch(Exception e){
            return "Exception" + e;
        }
    }
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(long id) {
        this.id = id;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name) {
        this.name = name;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }

    /**
     * @return the username
     */
    public String getUserName() {
        return username;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }

    /**
     * @param username the username to set
     */
    @Override
    public void setUserName(String username) {
        this.username = username;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }

    /**
     * @param password the password to set
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }

    /**
     * @param email the email to set
     */
    @Override
    public void setEmail(String email) {
        this.email = email;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }

    /**
     * @return the passwordTip
     */
    public String getPasswordTip() {
        return passwordTip;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }

    /**
     * @param passwordTip the passwordTip to set
     */
    @Override
    public void setPasswordTip(String passwordTip) {
        this.passwordTip = passwordTip;
        //aqui coloca no banco de dados 
        //INSERT INTO DATABASE ID
    }
    
    
    
}
