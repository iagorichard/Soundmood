package modelo;

import controle.Login;

/**
 *
 * @author IagoRichard
 */
public abstract class User {

	private long id;

	private String name;

	private String userName;

	private String password;

	private String email;

	private String passwordTip;

	public boolean cadastrar() {
		return true;
	}

	public boolean login(Login login) {
		return true;
	}

	public boolean logout() {
		return true;
	}

	public boolean esqueceuSenha() {
		return true;
	}

	public boolean mudarCadastro() {
		return true;
	}

}
