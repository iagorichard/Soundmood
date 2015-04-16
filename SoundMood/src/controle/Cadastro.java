package controle;

import modelo.FreeUser;
import modelo.PremiumUser;

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
        public int receberInformacao(long id, String username, String password, String nomeCompleto, String email, int tipoConta, String passwordTip){
            
            //Verificar o usuario -- verificar se existe
            if(this.verificarUsuario(username)==true){
                /** Se retornar a true, quer dizer que o usuário com esse username já existe
                 * o método retorna um valor para ser mostrada uma mensagem
                 */
                return 1;
            }
            //Se retornou a false, vai verificar email
            else{    
                
                if(this.verificarEmail(email)==true){
                    /** Se retornar a true, quer dizer que o usuário com esse username já existe
                    * o método retorna um valor para ser mostrada uma mensagem
                    */
                    return 2;
                }
                
                //Se retornou a false, vai verificar o tipo de conta, e isntanciar uma classe de acordo com o tipo
                else{
                    
                    this.tipo = tipoConta;
                    
                    /** Se retornar a true, quer dizer que o usuário é do tipo premium, se retornar a false é do tipo free.
                    */
                    if(verificarTipo()==true){
                        PremiumUser  usuarioPremium = new PremiumUser(id, nomeCompleto, username, password, email, passwordTip);
                    }
                    else{
                        FreeUser usuarioFree = new FreeUser(id, nomeCompleto, username, password, email, passwordTip);
                    }
                    
                    return 0;
            
                }
            }
            
        }
        
        /**Método verificarUsuario - verifica se tem algum usuário cadastro com o nome de usuário solicitado
         * @param username
         * @return boolean - se retornar a true quer dizer que já existe; se retornar a false quer dizer que não existe.
         */
	private boolean verificarUsuario(String username) {
		return false;
	}
        
        /**Método verificarEmail - verifica se tem algum usuário cadastro com o email solicitado
        * @param email
        * @return boolean - se retornar a true quer dizer que já existe; se retornar a false quer dizer que não existe.
        */
	private boolean verificarEmail(String email) {
		return false;
	}

        /**Método verificarUsuario - verifica se tem algum usuário cadastro com o nome de usuário solicitado
        * @return boolean - se retornar a true quer dizer que o usuário será premium; se retornar a false quer dizer que o usuário será free.
        */
        private boolean verificarTipo() {
            
            if(this.tipo==1)
                return true;
            else
                return false;
            
        }

}
