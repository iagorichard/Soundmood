package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    
    /**
     * Método para cadastrar um usuário no sistema
     * @return String - Saber se foi inserido com sucesso
     */
    @Override
    public String gravaUser() throws SQLException {
       
        String resultado;
        BancoDeDadosConection dataBase = new BancoDeDadosConection();
        
        dataBase.abrirConexao();
        
        try{
            resultado = dataBase.gravarUsuario(username, "FREE", name, email, password, passwordTip);
        } catch (Exception e){
            resultado = "Erro " + e;
        }
        
        dataBase.fecharConexao();
        
        return resultado;
        
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
