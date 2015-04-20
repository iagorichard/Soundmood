package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import modelo.FreeUser;
import modelo.PremiumUser;
import modelo.User;

/**Classe para objetos do tipo Cadastro, onde serão realizadas operações em relação à criação de um novo usuário
 * @author IagoRichard
 * @version 0.1
 */

public class Cadastro {
        
        // tipo: 1 - Usuário Premium; 2 - Usuário Free
	private int tipo;
        
        /** Método receberInfomação - vai receber como parâmetros de entrada, valores para a possível criação de um novo usuário, a ser aprovada dependendo das retições de email e username
         * @author IagoRichard
         * @param id - id do usuário
         * @param username - username do usuário
         * @param password - senha do usuário
         * @param nomeCompleto - nome completo do usuário
         * @param email - email do usuário
         * @param tipoConta - tipo de conta do usuário
         * @param passwordTip - lembra senha do usuário
         * @return int - o retorno será em inteiro, pois haverá várias possibilidades de erro: 1 - já haver um usuário cadastrado com o username solicitado; 2 - já haver um usuário cadastrado com o email solicitado; 0 - processo realizado com sucesso.
         */
        
        public String receberInformacao(long id, String username, String password, String nomeCompleto, String email, int tipoConta, String passwordTip){
            
            try{
                //Verificar o usuario -- verificar se existe
                if(this.verificarUsuario(username)==true){
                    /** Se retornar a true, quer dizer que o usuário com esse username já existe
                     * o método retorna um valor para ser mostrada uma mensagem
                     */
                    return "Nome de Usuario ja cadastrado";
                }
                //Se o usuário informado é válido, vai verificar email
                if(this.verificarEmail(email)==true){    
                    /** Se retornar a true, quer dizer que o usuário com esse username já existe
                     * o método retorna um valor para ser mostrada uma mensagem
                     */
                    return "Email ja cadastrado";
                }
                //Se email é válido, vai verificar o tipo de conta, e isntanciar uma classe de acordo com o tipo
                this.tipo = tipoConta;

                /** Se retornar a true, quer dizer que o usuário é do tipo premium, se retornar a false é do tipo free.
                  */
                if("premium".equals(verificarTipo())){
                    PremiumUser  usuarioPremium = new PremiumUser(id, email, username, password, email, passwordTip);
                            //cadastra usuario e checa se foi obtido sucesso
                    if ("Sucesso".equals(usuarioPremium.gravaUser())){
                        return "Sucesso";
                    }
                }
                else{
                    FreeUser usuarioFree = new FreeUser(id, nomeCompleto, username, password, email, passwordTip);
                    if ("Sucesso".equals(usuarioFree.gravaUser())){
                        return "Sucesso";
                    }
                }
            
            }catch(Exception e){
                return "Excessao" + e; //mudar isso, colocar algum numero que remete a excessao 
            }
            return null; //conferir isso
            
        }
        
        /**Método verificarUsuario - verifica se tem algum usuário cadastro com o nome de usuário solicitado
         * @param username
         * @return boolean - se retornar a true quer dizer que já existe; se retornar a false quer dizer que não existe.
         */
	private boolean verificarUsuario(String username) {
            
            try{

                int i = 0; //contador de username

                Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "projeto", "123");
                String sql = "select user_name from usuario where user_name = '"+username+"'";
                Statement stmt = conn.createStatement();
                ResultSet resultado = stmt.executeQuery(sql);

                while (resultado.next()) {  
                    //conta quantas ocorrências de usuários com username especificado
                    i++;
                }  
                
                conn.close();

                if(i>0){
                    return true;
                }
                else{
                    return false;
                }

            }catch(Exception e){
                return false;
            }
	}
        
        /**Método verificarEmail - verifica se tem algum usuário cadastro com o email solicitado
        * @param email
        * @return boolean - se retornar a true quer dizer que já existe; se retornar a false quer dizer que não existe.
        */
	private boolean verificarEmail(String email) {
            
            try{

                int i = 0; //contador de email

                Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "projeto", "123");
                String sql = "select email from usuario where email = '"+email+"'";
                Statement stmt = conn.createStatement();
                ResultSet resultado = stmt.executeQuery(sql);

                while (resultado.next()) {  
                    //conta quantas ocorrências de usuários com email especificado
                    i++;
                }  
                
                conn.close();

                if(i>0){
                    return true;
                }
                else{
                    return false;
                }

            }catch(Exception e){
                return false;
            }
	}

        /**Método verificarTipo - verifica se tem algum usuário cadastro com o nome de usuário solicitado
        * @return boolean - se retornar a true quer dizer que o usuário será premium; se retornar a false quer dizer que o usuário será free.
        */
        private String verificarTipo() {
            try{
            if(this.tipo!=1)
                return "free"; //tipo false free
            else
                return "premium"; //tipo true premium
            }catch(Exception e){
                return "Excpection" + e;
            }
        }

}
