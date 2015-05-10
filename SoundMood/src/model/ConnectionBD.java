/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author biancamoreira
 */
public class ConnectionBD {
    
    public Session abrirConexao(){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        return session;
        
    }
    
    public void fecharConexao(Session session){
        session.close();
    }
    
    // public static void main(String args[]) {
    //    SessionFactory sf = HibernateUtil.getSessionFactory();
    //    Session session = sf.openSession();
        
        
        
        
    //    sf.close();
    //}
    
}
