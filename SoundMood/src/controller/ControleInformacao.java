/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Random;
import model.Musica;

/**
 *
 * @author biancamoreira
 */

//singleton
public class ControleInformacao {
    
    private static ControleInformacao INSTANCE;
    private String humor = null;
    private String status = null;
    
    private ControleInformacao(){
    }
    
    public static ControleInformacao getInstance(){
        if(INSTANCE==null){
            INSTANCE = new ControleInformacao();
        }
        return INSTANCE;
    }
    
    
    public void getHumor(String humor){
        this.humor = humor;
    }
    
    public void getStatus(String status){
        this.status = status;
    }
    
    public void calculaMusicas(){
        
        String statusCalcula;
        String humorCalcula;
        
        if(this.humor == null){
            //tratamento de erro
        }else if(this.status == null){
            //tratamento de erro
            
        }else{
            Musica musica = new Musica();
            
            humorCalcula = this.humor;
            statusCalcula = this.status;
            
            Random rand = new Random();
            int randomNumMusicaStatus = rand.nextInt((10) + 1);
            int randomNumMusicaHumor = rand.nextInt((10) + 1);
            
            //fazer query e pegar id
            
            System.out.println(randomNumMusicaStatus);
            System.out.println(randomNumMusicaHumor);
        }
        
        
    }
    
    //public String[] retornoMusicas(){
        
    //}
    
}
