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

    /** Tela que ficará a execução da playlist. */
    private JFrame MP3Gui;
    /** Texto1 da playlist. */
    private JLabel jlabel1;
    /** Texto2 da playlist. */
    private JLabel jlabel2;
    /** Controle da playlist. */
    ControlePlaylist CP = ControlePlaylist.getInstance();

    /** Nome da música atual da playlist. */
    String nomeMusica;
    /** Nome do artista da música atual da playlist. */
    String nomeArtista;

    /**
     * Construtor que seta as informações da playlist.
     * @param MP3Gui Frame da interface gráfica da playlist.
     * @param jlabel1 Texto1 da playlist.
     * @param jlabel2 Texto2 da playlist.
     */
    public PlaylistInformacao(JFrame MP3Gui, JLabel jlabel1, JLabel jlabel2) {

        this.MP3Gui = MP3Gui;
        this.jlabel1 = jlabel1;
        this.jlabel2 = jlabel2;

    }

    /**
     * Rodando e atualizando as informações da playlist de acordo com a música
     * atual através de uma thread.
     */
    @Override
    public void run() {

        while (true) {

            //System.out.println("funfando");
            nomeMusica = CP.getMusicaNome();
            nomeArtista = CP.getMusicaArtista();

            jlabel1.setText(nomeMusica);
            jlabel2.setText(nomeArtista);
        }

    }

}
