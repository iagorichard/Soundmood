package modelo;

/**
 *Classe responsável pelo tipo de usuário Premium
 * @author Leylane
 */
public final class PremiumUser extends User{
    /**Construtor para a classe Premium.
     * @author IagoRichard
     */
    
    private long id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String passwordTip;
    
   //como fazer essa parte? 
   // public PremiumUser(long id, String name, String username, String password, String email, String passwordTip){
   //     GravaPremiumUser(id, name, username, password, email, passwordTip);
   // }
    
    public PremiumUser(long id, String name, String username, String password, String email, String passwordTip){
    
        setId(id);
        setName(name);
        setUserName(username);
        setPassword(password);
        setEmail(email);
        setPasswordTip(passwordTip);
    }
    
    
    @Override
    public String GravaUser(){
       
        try{
            //INSERT INTO DATABASE
            
             return "Sucesso";
        }catch(Exception e){
            return "Exception" + e;
        }
        
       
        
    }

    /**
     * @return the id
     *
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     * 
     */
    @Override
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     * 
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     * 
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     * 
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     * 
     */
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the passwordTip
     */
    public String getPasswordTip() {
        return passwordTip;
    }

    /**
     * @param passwordTip the passwordTip to set
     * 
     */
    @Override
    public void setPasswordTip(String passwordTip) {
        this.passwordTip = passwordTip;
    }
    
    
}
