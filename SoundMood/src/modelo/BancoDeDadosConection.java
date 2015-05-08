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
    
    public BancoDeDadosConection(Connection conn){
        this.conn = conn;
    }

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

}
