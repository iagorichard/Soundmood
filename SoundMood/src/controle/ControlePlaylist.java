package controle;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import modelo.Playlist;

public class ControlePlaylist {

    FileInputStream FIS;
    BufferedInputStream BIS;
    
    Playlist pl = new Playlist();
    
    public Player player;
    
    public long pauseLocation;
    public long songTotalLength;
    
    public String fileLocation;
    
    
   
    public void Stop(){
         //Checa se a musica esta tocando ou nao
        if (player != null) {
            player.close();
            
            pauseLocation = 0;
            songTotalLength = 0;
            
        }
    } 
    
    public void Pause(){
         //Checa se a musica esta tocando ou nao
        if (player != null) {
            
            try {
                //pega o local onde a musica pausou
                pauseLocation = FIS.available();
                //para de tocar a musica
                player.close();
            } catch (IOException ex) {
                //Logger.getLogger(ControlePlaylist.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    } 
    
    //mudar esse string path pra um array de strings
    public void Play(String path){
        try{
            
            //e aqui a gente faz um for 
            path = "/Users/biancamoreira/Downloads/Taking Back Sunday - A Decade Under The Influence (Video).mp3";
            
            FIS = new FileInputStream(path);
            BIS = new BufferedInputStream(FIS);
            
            player = new Player(BIS);
            
            //o tamanho total da musica
            songTotalLength = FIS.available();
            
            fileLocation = path + "";
            
        }
        catch(FileNotFoundException | JavaLayerException ex){
        } 
        catch (IOException ex) {
            Logger.getLogger(ControlePlaylist.class.getName()).log(Level.SEVERE, null, ex);
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
    
    //adicionar o resume method no nosso diagrama de classes
    
    //toca a musica de onde ela parou se o botao pause foi clicado
    public void Resume(){
        try{
            //this.Play("/Users/biancamoreira/Downloads/Taking Back Sunday - A Decade Under The Influence (Video).mp3");
           //fileLocation = "/Users/biancamoreira/Downloads/Taking Back Sunday - A Decade Under The Influence (Video).mp3";
            //vai receber o path ja existente
            FIS = new FileInputStream(fileLocation);
            BIS = new BufferedInputStream(FIS);
            
            player = new Player(BIS);
            
            FIS.skip(songTotalLength - pauseLocation);
            
            
        }
        catch(FileNotFoundException | JavaLayerException ex){
        } 
        catch (IOException ex) {
            Logger.getLogger(ControlePlaylist.class.getName()).log(Level.SEVERE, null, ex);
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
