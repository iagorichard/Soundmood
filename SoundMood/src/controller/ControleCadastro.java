package controller;

import java.util.List;
import model.ConnectionBD;
import model.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Classe responsável pelo controle de cadastro de um novo usuário do sistema, 
 * aqui estarão todos os métodos para a validação desse novo usuário.
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */

public class ControleCadastro {

    
    public String receberInformacao(String username, String email){
         try{
                //Verificar o usuario -- verificar se existe
                if(this.verificarUsuario(username)==true){
                    /** Se retornar a true, quer dizer que o usuário com esse username já existe
                     * o método retorna um valor para ser mostrada uma mensagem
                     */
                    return "usuario";
                }else if(this.verificarEmail(email)==true){    
                    /** Se retornar a true, quer dizer que o usuário com esse username já existe
                     * o método retorna um valor para ser mostrada uma mensagem
                     */
                    return "email";
                }else{
                    return "disponivel";
                }
         }catch(Exception e){
         }
         return "disponivel";
    }
    
    public boolean gravarInformacao(String username, String password, String nomeCompleto, String email, int tipoConta, String passwordTip){
        
        try{
        ConnectionBD connect = new ConnectionBD();
        Session session = connect.abrirConexao();
        
        
        
        Usuario user = new Usuario();
        
        user.setUsername(username);
        //user.setTipo(tipoConta);
        user.setNome(nomeCompleto);
        user.setSenha(password);
        user.setSenhadica(passwordTip);
        user.setEmail(email);
       
        
        System.out.println(nomeCompleto);
        session.beginTransaction();
        
        //Save the employee in database
        session.saveOrUpdate(user);
        
        session.getTransaction().commit();
        
 
        //Commit the transaction
        //session.getTransaction().commit();
        
        //session.close();
        
        return true;
        
        }catch(Exception e){
            return false;
        }
        
    }
    
    
    private boolean verificarUsuario(String username) {
        ConnectionBD connect = new ConnectionBD();
        Session session = connect.abrirConexao();
        
        session.beginTransaction();
        Query query = session.createQuery("from Usuario");
        
        List<Usuario> users = query.list();
       
        
        for(Usuario user : users){
            
            if(username.equals(user.getUsername())){
                return true;
            }
        }
        
        return false;
        
    }
    
    private boolean verificarEmail(String email) {
        ConnectionBD connect = new ConnectionBD();
        Session session = connect.abrirConexao();
        
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Usuario");
        
        List<Usuario> users = query.list();
       
        
        for(Usuario user : users){
            
            if(email.equals(user.getEmail())){
                return true;
            }
        }
        
        return false;
        
    }
}
