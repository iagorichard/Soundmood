/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author biancamoreira
 */

//Singleton
public class ControleDeUsuario {
    
    private static ControleDeUsuario instance = null;
    
    public static ControleDeUsuario getInstance(){
        
        if(instance == null){
            instance = new ControleDeUsuario();
        }
        
        return instance;
    }
    
}
