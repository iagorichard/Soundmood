package model;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Classe responsável pela realização da conexão com o banco de dados.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */

public class ConnectionBD {
    
    /**
     * Método de abertura da conexão.
     * @return Session: sessão da conexão com o banco de dados.
     */
    public Session abrirConexao(){
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        return session;
    }
    
    /**
     * Método do fechamento da conexão.
     * @param session Sessão a ser fechada.
     */
    public void fecharConexao(Session session){
        session.close();
    }
    
    public static void main(String args[]) {
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        sf.close();
    }
    
}
