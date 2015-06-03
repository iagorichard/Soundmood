/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import java.util.Random;
import model.Calcula;
import model.ConnectionBD;
import model.Musica;
import model.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author biancamoreira
 */

//singleton
public class ControleInformacao {
    
    private static ControleInformacao INSTANCE;
    private int humor;
    private int status;
    
    private ControleInformacao(){
    }
    
    public static ControleInformacao getInstance(){
        if(INSTANCE==null){
            INSTANCE = new ControleInformacao();
        }
        return INSTANCE;
    }
    
    
    public void getHumor(int humor){
        System.out.println(humor);
        
        this.humor = humor;
    }
    
    public void getStatus(int status){
        System.out.println(humor);
        this.status = status;
    }
    
    
    public int[] calculaMusicas(){
        
       // String statusCalcula;
      //  String humorCalcula;
        
       // if(this.humor == null){
            //tratamento de erro
      //  }else if(this.status == null){
            //tratamento de erro
            
       // }else{
            //Musica musica = new Musica();
            
            //humorCalcula = this.humor;
            //statusCalcula = this.status;
            
            
            
            //Random rand = new Random();
            //int randomNumMusicaStatus = rand.nextInt((10) + 1);
            //int randomNumMusicaHumor = rand.nextInt((10) + 1);
            
            //fazer query e pegar id
            
            ConnectionBD connect = new ConnectionBD();
            Session session = connect.abrirConexao();
        
            //int tagmoodid = 1;
            int statustagid = 2;
            
            session.beginTransaction();
            Query query = session.createQuery("from Calcula where tagmoodid = :tagmoodid and statustagid = :statustagid");
            query.setParameter("tagmoodid", humor);
            query.setParameter("statustagid", status);
            List<Calcula> calcula = query.list();
            int[] listaMusicasId = new int[5];
            
            int temp = 0;
            
            for(Calcula calculas : calcula){
                listaMusicasId[temp] = calculas.getIdmusica();
                System.out.println(listaMusicasId[temp]);
                temp++;
                
            }
            return listaMusicasId;
          
            
            //System.out.println(randomNumMusicaStatus);
            //System.out.println(randomNumMusicaHumor);
      // }
        
        
    }
    
    //public String[] retornoMusicas(){
        
    //}
    
}
