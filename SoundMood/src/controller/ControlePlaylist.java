package controller;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import model.ConnectionBD;
import model.Musica;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Classe responsável pelo controle de todas as ações a serem realizadas pelo
 * usuário na <b>playlst</b> que foi gerada na seção atual.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */
public class ControlePlaylist {

    FileInputStream FIS;
    BufferedInputStream BIS;
    
    //Playlist pl = new Playlist();
    
    /**
     * Atributos referentes ao controle da playlist.
     */
    
    private Musica musicaAtual = new Musica();
    
    public Player player;
    
    public long pauseLocation;
    public long songTotalLength;
    
    public String fileLocation;
    
    private static ControlePlaylist INSTANCE;
    
    int temp = 0;
  
    /** Construtor simples para a classe. */
    private ControlePlaylist(){
    }
    
    /**
     * A classe será uma Singleton Class, podendo ser instanciada em
     * qualquer parte do código.
     *
     * @return INTANCE instância da Singleton Class.
     */
    public static ControlePlaylist getInstance(){
        if(INSTANCE==null){
            INSTANCE = new ControlePlaylist();
        }
        return INSTANCE;
    }
    
    /**
     * Método responsável para parar a música que está tocando atualmente na
     * playlist.
     */
    public void Stop(){
         //Checa se a musica esta tocando ou nao
        if (player != null) {
            player.close();
            
            pauseLocation = 0;
            songTotalLength = 0;
            
        }
    } 
    
    /**
     * Método responsável para pausar a música que está tocando atualmente na
     * playlist.
     */
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
    
    /**
     * Método que seta a música atual da playlist.
     * @param musica Musica que será setada para ser a nova música atual da 
     * playlist.
     */
    public void setMusicaInformacao(Musica musica){
        this.musicaAtual = musica;
    }
    
    /**
     * Método que pega o nome da música atual da playlist.
     * @return String: nome da música atual da playlist.
     */
    public String getMusicaNome(){
        return musicaAtual.getNome();
    }
    
    /**
     * Método que pega o nome do artista da música atual da playlist.
     * @return String: nome do artista da música atual da playlist.
     */
    public String getMusicaArtista(){
        return musicaAtual.getArtista();
    }
    
    /**
     * Método que chama a playlist.
     */
    public void chamarPlay(){
            String path;
            
            //e aqui a gente faz um for 
            ConnectionBD connect = new ConnectionBD();
            Session session = connect.abrirConexao();
            session.beginTransaction();
            
           // Query query = session.createQuery("from Musica where id= :id");
            
          // for(int temp=0; temp>3;temp++){
                Query query = session.createQuery("from Musica where id= :id");
                
                
                query.setParameter("id",temp);
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
    /**
     * Método responsável para tocar a playlist.
     * @param path Diretório da música a ser executada.
     */
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
    
    //adicionar o "resume method" no nosso diagrama de classes
    
    /**
     * Método que faz tocar a musica de onde ela parou se o botao pause 
     * tiver sido clicado.
     */
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
