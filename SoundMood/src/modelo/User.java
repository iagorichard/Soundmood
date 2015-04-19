package modelo;

import controle.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**Classe para objetos do tipo user (ou usuário), onde estarão contidos todos os dados de um usuário do sistema
 * @author IagoRichard
 * @version 0.0
 */

public abstract class User {

	private long id;
        private String name;
        private String userName;
        private String password;
        private String email;
        private String passwordTip;
        
        
        /**
        * Método para verificar se email solicitado no formulário já está cadastrado no sistema
        * @param email - email a ser verificado se existe no banco de dados
        * @return int - se retornar a 1 existe, se retornar a 0 não existe; e se houver erro, retorna a 2;
        */
        public int verificaEmail(String email){

            try{

                int i = 0; //contador de email

                Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "iagorrs", "iago2014");
                String sql = "select * from usuario where email = '"+email+"';";
                Statement stmt = conn.createStatement();
                ResultSet resultado = stmt.executeQuery(sql);

                while (resultado.next()) {  
                    i++;
                }  

                if(i>0){
                    return 1;
                }
                else{
                    return 0;
                }

            }catch(Exception e){
                return 2;
            }
        }
        
        
        /**
        * Método para verificar se usuário solicitado no formulário já está cadastrado no sistema
        * @param user - email a ser verificado se existe no banco de dados
        * @return int - se retornar a 1 existe, se retornar a 0 não existe; e se houver erro, retorna a 2;
        */
        public int verificaUser(String user){

            try{

                int i = 0; //contador de email

                Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "iagorrs", "iago2014");
                String sql = "select * from usuario where email = '"+user+"';";
                Statement stmt = conn.createStatement();
                ResultSet resultado = stmt.executeQuery(sql);

                while (resultado.next()) {  
                    i++;
                }  

                if(i>0){
                    return 1;
                }
                else{
                    return 0;
                }

            }catch(Exception e){
                return 2;
            }
        }
        
        
        /**Método para cadastrar um usuário no sistema
        * @author IagoRichard
        * @return String - Verificar se o processo foi executado com sucesso ou não
        */
        public String gravaUser(){
            return "User";
        }
        
        public String verificaEmail(){
            return "Email";
        }
        
        /**Todos os set's da clase User, logo abaixo:
        * @author Washington Filipe
        */
        
        public void setId(long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPasswordTip(String passwordTip) {
            this.passwordTip = passwordTip;
        }

        /**Método para logar um usuário no sistema
        * @author IagoRichard
        * @return boolean - Verificar se o processo foi executado com sucesso ou não
        */
	public boolean login(Login login) {
		return true;
	}
        
        /**Método para deslogar um usuário no sistema
        * @author IagoRichard
        * @return boolean - Verificar se o processo foi executado com sucesso ou não
        */
	public boolean logout() {
		return true;
	}
        
        /**Método para recuperar senha de um usuário no sistema
        * @author IagoRichard
        * @return boolean - Verificar se o processo foi executado com sucesso ou não
        */
	public boolean esqueceuSenha() {
		return true;
	}
        
        /**Método para alterar dados de um usuário no sistema
        * @author IagoRichard
        * @return boolean - Verificar se o processo foi executado com sucesso ou não
        */
	public boolean mudarCadastro() {
		return true;
	}

}
