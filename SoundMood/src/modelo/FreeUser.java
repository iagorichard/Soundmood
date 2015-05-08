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
     * @throws java.sql.SQLException
     */
    @Override
    public String gravaUser() throws SQLException {
       
        try{
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "projeto", "123");
            
            //BancoDeDadosConection dataBase = new BancoDeDadosConection(conn);
            //dataBase.abrirConexao();
            int proxId = 0; //inicializando id
        
            String sqlSaberUltimoId = "SELECT SEQ_ID_USER.NEXTVAL FROM DUAL"; //select para saber qual a ultima id, vai retonar o ultimo valor da sequencia criada
            PreparedStatement pst = conn.prepareStatement(sqlSaberUltimoId);
            ResultSet resultadoId = pst.executeQuery(); //Executar Query

            if (resultadoId.next()) {
                proxId = resultadoId.getInt(1); // pega o resultado do select e joga na variável criada
            }//o select só vai ter um resultado, por isso foi usado if ao invés de while

            String sql = "INSERT INTO USUARIO "
                    + "(ID,USER_NAME,TIPO,NOME,EMAIL,SENHA,DICA_SENHA,ID_TAGMOOD,ID_TAGSTATUS) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)"; //insert na tabela de usuário
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, proxId);
            stmt.setString(2, username);
            stmt.setString(3, "FREE");
            stmt.setString(4, name);
            stmt.setString(5, email);
            stmt.setString(6, password);
            stmt.setString(7, passwordTip);
            stmt.setInt(8, 1);
            stmt.setInt(9, 1);
                //Setando todos os valores necessários em cada campo da tabela ex:.(numerodocampo, valorasetgravado)
            stmt.execute(); //executando a query de insert na tabela de usuário

            conn.close();
            //dataBase.fecharConexao();
            
            return "Sucesso";
            
        } catch (Exception e){
            return "Erro " + e;
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
