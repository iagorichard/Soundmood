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
 * Classe responsável pelo controle de <b>humor</b> e <b>status</b>.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */

//singleton
public class ControleInformacao {
    
    /** Declaração da instância de ControleInformacão. */
    private static ControleInformacao INSTANCE;
    /** Propriedade para humor. */
    private int humor;
     /** Propriedade para status. */
    private int status;
    
    /**
     * Construtor simples para a classe.
     */
    private ControleInformacao(){
    }
    
     /**
     * A classe será uma Singleton Class, onde poderá ser instanciada em
     * qualquer parte do código.
     *
     * @return INTANCE instância da Singleton Class.
     */
    
    public static ControleInformacao getInstance(){
        if(INSTANCE==null){
            INSTANCE = new ControleInformacao();
        }
        return INSTANCE;
    }
    
    /**
     * Getter para humor usuário na seção atual.
     *
     * @param humor Humor do usuário.
     */
    
    
    public void getHumor(int humor){
        System.out.println(humor);
        
        this.humor = humor;
    }
    
     /**
     * Getter para status do usuário na seção atual.
     *
     * @param status Status do usuário.
     */
    
    public void getStatus(int status){
        System.out.println(humor);
        this.status = status;
    }
    
    /**
     * Método para a realização dos cálculos das músicas das playlists a sererem 
     * geradas.
     */
    
    
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
