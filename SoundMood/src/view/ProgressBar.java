/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author biancamoreira
 */
public class ProgressBar extends Thread{
    private JFrame frame;
    private JProgressBar progressBar;
    
    public ProgressBar(JFrame frame, JProgressBar progressBar){
        this.frame = frame;
        this.progressBar = progressBar;
    }
    
    @Override
    public void run(){
        for(int temp=0; temp<101; temp++){
            progressBar.setValue(temp);
            
        }
    }
    
    
}
