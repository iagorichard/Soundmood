package modelo;

//Realizando o import das classes a serem usadas no código
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
        
        
        /**Método para cadastrar um usuário no sistema
        * @author IagoRichard
        * @return String - Se o processo foi executado com sucesso, retorna a "Sucesso" se não, retorna a uma exceção
        */
        public String gravaUser(){
            return "User";
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
