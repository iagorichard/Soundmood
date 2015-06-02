package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 * Classe referente a uma barra de progresso.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */
public class ProgressBar extends Thread {

    /** Tela que ficará a barra de progresso.. */
    private JFrame frame;
    /** Instância da barra de progresso. */
    private JProgressBar progressBar;

    /**
     * Construtor da barra de progresso.
     * @param frame Formulário que está contida a barra.
     * @param progressBar Barra de progresso.
     */
    public ProgressBar(JFrame frame, JProgressBar progressBar) {
        this.frame = frame;
        this.progressBar = progressBar;
    }

    /**
     * Execução da barra de progresso como uma Thread.
     */
    @Override
    public void run() {
        for (int temp = 0; temp < 101; temp++) {
            progressBar.setValue(temp);
        }
    }

}
