package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.FreeUser;
import modelo.PremiumUser;
import modelo.User;

/**
 * Classe onde fica os comandos SQL.
 *
 * @author biancamoreira
 */
public class BancoDeDadosConection {

    Connection conn;

    public void abrirConexao() throws SQLException {
        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "projeto", "123");
    }

    public void fecharConexao() throws SQLException {
        conn.close();
    }

    public boolean verificaCampo(String campo, String valor) throws SQLException {

        int i = 0;
        String sql = "SELECT " + campo + " FROM USUARIO WHERE " + campo + " = '" + valor + "'";
        Statement stmt = conn.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);

        while (resultado.next()) {
            //conta quantas ocorrências de usuários com email especificado
            i++;
        }

        conn.close();

        if (i > 0) {
            return true;
        } else {
            return false;
        }

    }

    public String gravarUsuario(String username, String tipo, String name, String email,
            String password, String passwordTip) throws SQLException {
        
        int proxId = 0; //inicializando id
        
        String sqlSaberUltimoId = "SELECT SEQ_ID_USER.NEXTVAL FROM DUAL"; //select para saber qual a ultima id, vai retonar o ultimo valor da sequencia criada
        PreparedStatement pst = conn.prepareStatement(sqlSaberUltimoId);
        ResultSet resultadoId = pst.executeQuery(); //Executar Query
        
        if (resultadoId.next()) {
            proxId = resultadoId.getInt(1); // pega o resultado do select e joga na variável criada
        }//o select só vai ter um resultado, por isso foi usado if ao invés de while

        String sql = "INSERT INTO USUARIO "
                + "(ID,USER_NAME,TIPO,NOME,EMAIL,SENHA,DICA_SENHA,ID_TAGMOOD,ID_TAGSTATUS) "
                + "VALUES (?,?,?,?,?,?,?,?,?)"; //insert na tabela de usuário
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, proxId);
        stmt.setString(2, username);
        stmt.setString(3, tipo);
        stmt.setString(4, name);
        stmt.setString(5, email);
        stmt.setString(6, password);
        stmt.setString(7, passwordTip);
        stmt.setInt(8, 1);
        stmt.setInt(9, 1);
            //Setando todos os valores necessários em cada campo da tabela ex:.(numerodocampo, valorasetgravado)

        stmt.execute(); //executando a query de insert na tabela de usuário
        
        return "Sucesso";
        
    }

}
