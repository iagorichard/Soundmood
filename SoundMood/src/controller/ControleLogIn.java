/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.ConnectionBD;
import model.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author biancamoreira
 */
public class ControleLogIn {
    
    public boolean checaLogin(String username, String password){
        ConnectionBD connect = new ConnectionBD();
        Session session = connect.abrirConexao();
        
        session.beginTransaction();
        Query query = session.createQuery("from Usuario where username= :username");
        query.setParameter("username",username);
        
        List<Usuario> users = query.list();
       
        
        for(Usuario user : users){
            if(password.equals(user.getSenha())){
                return true;
            }
           
        }
        
        return false;
    }
    
}
