package modelo;

/**
 *Classe responsável pelo tipo de usuário Premium
 * @author Leylane
 */
public class PremiumUser extends User{
    /**Construtor para a classe Premium.
     * @author IagoRichard
     */
    public PremiumUser(long id, String name, String userName, String password, String email, String passwordTip){
       
        setId(id);
        setName(name);
        setUserName(userName);
        setPassword(password);
        setEmail(email);
        setPasswordTip(passwordTip);
        
    }
}
