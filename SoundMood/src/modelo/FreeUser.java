package modelo;


/**Classe para objetos do FreeUser, usuários do tipo free, a classe herdará da classe 'User'.
 * @author IagoRichard
 * @version 0.0
 */

public class FreeUser extends User {
    
    /**Construtor para a classe FreeUser.
     * @author IagoRichard
     */
    FreeUser(long id, String name, String userName, String password, String email, String passwordTip){
       
        setId(id);
        setName(name);
        setUserName(userName);
        setPassword(password);
        setEmail(email);
        setPasswordTip(passwordTip);
        
    }
    
}
