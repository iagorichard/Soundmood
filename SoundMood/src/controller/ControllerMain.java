/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.ConnectionBD;
import model.Musica;
import model.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author biancamoreira
 */
public class ControllerMain {
    public static void main(String args[]) {
       
        ControleInformacao ci = ControleInformacao.getInstance();
        
        ci.getHumor("feliz");
        ci.getStatus("trabalhando");
        
        //ci.calculaMusicas();
        
        
        
        ConnectionBD connect = new ConnectionBD();
        Session session = connect.abrirConexao();
        
        //session.beginTransaction();
        //Query query = session.createQuery("from Musica");
        
        //List<Musica> musicas = query.list();
       
        
        //for(Musica musica : musicas){
            
        //    System.out.println(musica.getArtista());
        //}
    
    }
    
}
