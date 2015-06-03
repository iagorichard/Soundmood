package controller;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import model.ConnectionBD;
import model.Musica;
import org.hibernate.Query;
import org.hibernate.Session;

public class ControlePlaylist {

    FileInputStream FIS;
    BufferedInputStream BIS;
    
    //Playlist pl = new Playlist();
   
    private Musica musicaAtual = new Musica();
    
    public Player player;
    
    public long pauseLocation;
    public long songTotalLength;
    
    public String fileLocation;
    
    private static ControlePlaylist INSTANCE;
    
    int temp = 0;
    
    int[] pegaMusicasId;
    
    
    private ControlePlaylist(){
    }
    
    public static ControlePlaylist getInstance(){
        if(INSTANCE==null){
            INSTANCE = new ControlePlaylist();
        }
        return INSTANCE;
    }
    
   
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
    
    public void setMusicaInformacao(Musica musica){
        
        this.musicaAtual = musica;
        
       // System.out.println(this.musicaAtual.getArtista());
    }
    
    public String getMusicaNome(){
        return musicaAtual.getNome();
    }
    
    public String getMusicaArtista(){
        return musicaAtual.getArtista();
    }
    
    
    public void pegaMusicasId(){
        ControleInformacao CI = ControleInformacao.getInstance();
        int[] musicasId = new int[5];
        
        //CI.getHumor(0);
        //CI.getStatus(0);
        musicasId = CI.calculaMusicas();
        System.out.println(Arrays.toString(musicasId));
        this.pegaMusicasId = musicasId;
        
    }
    
    public void chamarPlay(){
            String path;
            
            //e aqui a gente faz um for 
            ConnectionBD connect = new ConnectionBD();
            Session session = connect.abrirConexao();
            session.beginTransaction();
            
             
              
           // Query query = session.createQuery("from Musica where id= :id");
            
          // for(int temp=0; temp>3;temp++){
                Query query = session.createQuery("from Musica where id= :id");
                
                System.out.println(pegaMusicasId[temp]);
                query.setParameter("id",pegaMusicasId[temp]);
                Musica retorno = new Musica();
                retorno = (Musica) query.uniqueResult();
                //System.out.println(retorno.getNome());
                path = retorno.getPathurl();
                
                this.setMusicaInformacao(retorno);
                this.Play(path);
                
                temp++;
          // }
           // query.setParameter("id",0);
            
         //   Musica retorno = new Musica();
          //  retorno = (Musica) query.uniqueResult();
            
         //   path = retorno.getPathurl();
        
    }
    //mudar esse string path pra um array de strings
    public void Play(String path){
        try{
            
            //String path;
            
            //e aqui a gente faz um for 
            //ConnectionBD connect = new ConnectionBD();
            //Session session = connect.abrirConexao();
            //session.beginTransaction();
            
            //Query query = session.createQuery("from Musica where id= :id");
            
           // for(int temp=0; temp>3;temp++){
           //     query.setParameter("id",0);
           // }
            //query.setParameter("id",0);
            
            //Musica retorno = new Musica();
            //retorno = (Musica) query.uniqueResult();
            
            //path = retorno.getPathurl();
            
           // this.setMusicaInformacao(retorno);
            
            //path = "/Users/biancamoreira/Downloads/Taking Back Sunday - A Decade Under The Influence (Video).mp3";
            
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
            
            ControlePlaylist ci = ControlePlaylist.getInstance();
            @Override
            public void run(){
                try {
                    player.play();
                    if(player.isComplete() == true){
                        ci.chamarPlay();
                    }
                    
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
