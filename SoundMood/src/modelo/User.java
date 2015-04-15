package modelo;

import controle.Login;

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
        * @return boolean - Verificar se o processo foi executado com sucesso ou não
        */
	public boolean cadastrar() {
		return true;
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
