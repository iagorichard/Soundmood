package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.BancoDeDadosConection;

public class Login {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String checarLogin() throws SQLException {

        try{
            int auxiliarParaSaberSeExisteAlgumResultadoNaConsulta = 0;

            Connection conn = null;
            BancoDeDadosConection dataBase = new BancoDeDadosConection();
            conn = dataBase.abrirConexao(conn);
            String sql = "SELECT * FROM USUARIO WHERE USER_NAME = ? AND SENHA = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet resultadoDaConsulta = stmt.executeQuery();

            while (resultadoDaConsulta.next()){
                auxiliarParaSaberSeExisteAlgumResultadoNaConsulta++;
            }

            resultadoDaConsulta.close();
            stmt.close();
            
            if(auxiliarParaSaberSeExisteAlgumResultadoNaConsulta>0){
                return "Logado com sucesso";
            }
            else{
                return "Username e/ou senha digitada(s) inválido(s)!";
            }
            
        } catch (Exception e){
            return "Erro " + e;
        }

        
    }

}
