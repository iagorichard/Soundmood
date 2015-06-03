package controller;

import java.util.List;
import model.ConnectionBD;
import model.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Classe responsável pelo controle de <b>login</b> da seção atual de um
 * determinado usuário.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */
public class ControleLogIn {

    /**
     * Construtor simples para a referida classe.
     */
    public ControleLogIn() {

    }

    /**
     * Método responsável para a validação de um login, o usuário só poderá
     * logar no sistema se o username e password existir e for corresponderem a
     * um mesmo usuário e senha que estiverem cadastrados na mesma tupla do
     * banco de dados do sistema.
     *
     * @param username Nome de usuário a ser validado.
     * @param password Senha a ser validada.
     * @return boolean: se o username e password tiverem sido validados,
     * significa que o login foi efetuado com sucesso, fazendo com que o método
     * retorne
     * <b>true</b>, se não for realizado com sucesso retornará a <b>false</b>.
     */
    public boolean checaLogin(String username, String password) {
        ConnectionBD connect = new ConnectionBD();
        Session session = connect.abrirConexao();

        session.beginTransaction();
        Query query = session.createQuery("from Usuario where username= :username");
        query.setParameter("username", username);

        List<Usuario> users = query.list();

        for (Usuario user : users) {
            if (password.equals(user.getSenha())) {
                return true;
            }

        }

        return false;
    }

}
