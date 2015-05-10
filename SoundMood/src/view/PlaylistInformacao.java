/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControlePlaylist;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author biancamoreira
 */
public class PlaylistInformacao extends Thread {
    
    private JFrame MP3Gui;
    private JLabel jlabel1, jlabel2;
    ControlePlaylist CP = ControlePlaylist.getInstance();
    String nomeMusica;
    String nomeArtista;
    
    public PlaylistInformacao(JFrame MP3Gui, JLabel jlabel1, JLabel jlabel2){
        this.MP3Gui = MP3Gui;
        this.jlabel1 = jlabel1;
        this.jlabel2 = jlabel2;
        
        
    }
    
    @Override
    public void run(){
        
         while(true){ 
             
             //System.out.println("funfando");
           nomeMusica = CP.getMusicaNome();
           nomeArtista = CP.getMusicaArtista();
            
           jlabel1.setText(nomeMusica);
           jlabel2.setText(nomeArtista);
         }
        
    }
    
    
    
}
