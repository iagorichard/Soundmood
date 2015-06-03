/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import java.util.List;
import model.ConnectionBD;
import model.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Classe responsável pelo controle de cadastro de um novo <b>usuário</b> do
 * sistema, aqui estarão todos os métodos para a validação desse novo usuário.
 *
 * @version 1.0
 * @author biancamoreira
 * @author Iago Rodrigues
 * @author Leylane Ferreira
 * @author Washington Filipe
 */
public class ControleCadastro {
    
    /**
     * Construtor simples para a classe.
     */
    public ControleCadastro(){
        
    }
    
 /**
     * Método que recebe as informações do novo usuário a ser cadastrado, e
     * verifica se realmente poderá ser criado este usuário com as informações
     * passadas como parâmetro; será realizada uma busca no banco de dados
     * para saber se existe um usuário com o username e email que foi passado
     * como parâmetro.
     * 
     * @param username Username do suposto novo usuário.
     * @param email E-mail do suposto novo usuário.
     * @return String: se o cadastro for aprovado, retorna uma mensagem 
     * <b>"Disponivel"</b>, se não, retorna outro valor. 
     */
      
    public String receberInformacao(String username, String email){
         try{
                
                if(this.verificarUsuario(username)==true){
                /**
                 * Verifica se já existe um username de um usuario
                 * igual o valor do parâmetro username no sistema;
                 * Se retornar a true, entende-se que o username ja existe;
                 * o método retorna um valor para ser mostrada uma mensagem na 
                 * tela.
                 */
                    return "usuario";
                }else if(this.verificarEmail(email)==true){    
                 /**
                 * Verifica se já existe um usuário com nome de usuário
                 * igual o valor do parâmetro username no sistema;
                 * Se retornar a true,entende-se que o e-mail ja foi cadastrado
                 * o método retorna um valor para ser mostrada uma mensagem na 
                 * tela.
                 */
                    return "email";
                }else{
                 /**
                 * Se nenhuma das condições anteriores forem satisfeitas,
                 * significa que o cadastro pode ser realizado com sucesso.
                 */
                    return "disponivel";
                }
         }catch(Exception e){
             
         }
         return "disponivel";
    }
    
    /**
     * Método que recebe as informações do usuário e as grava no banco de dados.
     * @param username Username do novo usuário.
     * @param password Senha do novo usuário.
     * @param nomeCompleto Nome completo do novo usuário.
     * @param email E-mail do novo usuário.
     * @param tipoConta Tipo de conta do novo usuário.
     * @param passwordTip Lembrete de senha do novo usuário.
     * @return boolean: para verificar se a trasação foi realizada com sucesso.
     */
    
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
    
    /**
     * Método que verifica se está tentando cadastrar um novo usuário com um
     * username já utilizado por algum usuário no sistema.
     * @param username Username do suposto novo usuário.
     * @return boolean: se username está sendo utilizado retorna <b>true</b>, 
     * se não retorna a <b>false</b>.
     */
    
    
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
    /**
     * Método que verifica se está tentando cadastrar um novo usuário com um
     * email já utilizado por algum usuário no sistema.
     * @param email E-mail do suposto novo usuário.
     * @return boolean: se email está sendo utilizado retorna <b>true</b>, se não 
     * retorna a <b>false</b>.
     */
    
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
