package controle;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class ControlePlaylist {

    FileInputStream FIS;
    BufferedInputStream BIS;
    
    public Player player;
    
   
    public void Stop(){
         //Checa se a musica esta tocando ou nao
        if (player != null) {
            player.close();
            
        }
    } 
    
    public void Play(String path){
        try{
            
            FIS = new FileInputStream(path);
            BIS = new BufferedInputStream(FIS);
            
            player = new Player(BIS);
            
        }
        catch(FileNotFoundException | JavaLayerException ex){
        }
        
        new Thread(){
            
            @Override
            public void run(){
                try {
                    player.play();
                } catch (JavaLayerException ex) {
                    //Logger.getLogger(ControlePlaylist.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }


    
}
