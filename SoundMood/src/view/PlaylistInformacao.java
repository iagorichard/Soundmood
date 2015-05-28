package view;

import controller.ControlePlaylist;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe responsável pelo controle do fluxo de informação da playlist.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */
public class PlaylistInformacao extends Thread {
    
    private JFrame MP3Gui;
    private JLabel jlabel1, jlabel2;
    ControlePlaylist CP = ControlePlaylist.getInstance();
    
    String nomeMusica;
    String nomeArtista;
    
    /**
     * Método para setar as informações da playlist.
     * @param MP3Gui
     * @param jlabel1
     * @param jlabel2 
     */
    public PlaylistInformacao(JFrame MP3Gui, JLabel jlabel1, JLabel jlabel2){
        
        this.MP3Gui = MP3Gui;
        this.jlabel1 = jlabel1;
        this.jlabel2 = jlabel2;
        
    }
    
    /**
     * Rodando e atualizando as informações da playlist de acordo com a música 
     * atual através de uma thread.
     */
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
