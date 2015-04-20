package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    
    
    /**
     * Método para cadastrar um usuário no sistema
     * @return String - Saber se foi inserido com sucesso
     */
    public String gravaUser(){
       
        try{
            
            Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "projeto", "123");
            int proxId = 0; //inicializando id
            
            String sqlSaberUltimoId = "SELECT SEQ_ID_USER.NEXTVAL from dual"; //select para saber qual a ultima id, vai retonar o ultimo valor da sequencia criada
            PreparedStatement pst = conn.prepareStatement(sqlSaberUltimoId);
            ResultSet resultadoId = pst.executeQuery(); //Executar Query
            if(resultadoId.next()){
                 proxId = resultadoId.getInt(1); // pega o resultado do select e joga na variável criada
            }//o select só vai ter um resultado, por isso foi usado if ao invés de while
            
            String sql = "INSERT INTO USUARIO " 
                    + "(ID,USER_NAME,TIPO,NOME,EMAIL,SENHA,DICA_SENHA,ID_TAGMOOD,ID_TAGSTATUS) " 
                    + "VALUES (?,?,?,?,?,?,?,?,?)"; //insert na tabela de usuário
            PreparedStatement stmt = conn.prepareStatement(sql); 
            
            stmt.setInt(1, proxId);
            stmt.setString(2, this.username);
            stmt.setString(3, "Premium");
            stmt.setString(4, this.name);
            stmt.setString(5, this.email);
            stmt.setString(6, this.password);
            stmt.setString(7, this.passwordTip);
            stmt.setInt(8, 1);
            stmt.setInt(9, 1);
            //Setando todos os valores necessários em cada campo da tabela ex:.(numerodocampo, valorasetgravado)
            
            stmt.execute(); //executando a query de insert na tabela de usuário
            conn.close(); //fecha conexão
            
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
