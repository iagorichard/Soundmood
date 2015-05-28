package controller;

import java.util.List;
import model.ConnectionBD;
import model.Musica;
import model.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Classe responsável pelo controle principal e onde será instanciada a classe
 * de controle de informação da seção atual.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */
public class ControllerMain {
    
    /**
     * Classe principal do sistema.
     * @param args Parâmetros passados na execução do programa.
     */
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
