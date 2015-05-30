package controller;

import java.util.List;
import java.util.Random;
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
public class ControleInformacao {

    /** Declaração da instância de ControleInformacao. */
    private static ControleInformacao INSTANCE;
    /** Propriedade para humor. */
    private String humor = null;
    /** Propriedade para status. */
    private String status = null;

    /**
     * Construtor simples para a classe.
     */
    private ControleInformacao() {
    }

    /**
     * A classe será uma Singleton Class, onde poderá ser instanciada em
     * qualquer parte do código.
     *
     * @return INTANCE instância da Singleton Class.
     */
    public static ControleInformacao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ControleInformacao();
        }
        return INSTANCE;
    }

    /**
     * Getter para humor usuário na seção atual.
     *
     * @param humor Humor do usuário.
     */
    public void getHumor(String humor) {
        this.humor = humor;
    }

    /**
     * Getter para status do usuário na seção atual.
     *
     * @param status Status do usuário.
     */
    public void getStatus(String status) {
        this.status = status;
    }

    /**
     * Método para a realização dos cálculos das músicas das playlists a sererem 
     * geradas.
     */
    public void calculaMusicas() {

        String statusCalcula;
        String humorCalcula;

        if (this.humor == null) {
            //tratamento de erro
        } else if (this.status == null) {
            //tratamento de erro
        } else {
            
            Musica musica = new Musica();

            humorCalcula = this.humor;
            statusCalcula = this.status;

            Random rand = new Random();
            int randomNumMusicaStatus = rand.nextInt((10) + 1);
            int randomNumMusicaHumor = rand.nextInt((10) + 1);

            //fazer query e pegar id
            ConnectionBD connect = new ConnectionBD();
            Session session = connect.abrirConexao();

            int musicaid = 0;
            session.beginTransaction();
            Query query = session.createQuery("from Musica where id = :musicaid");
            musica = (Musica) query.uniqueResult();

            System.out.println(musica.getNome());

            System.out.println(randomNumMusicaStatus);
            System.out.println(randomNumMusicaHumor);
        }

    }

    //public String[] retornoMusicas(){
    //}
}
