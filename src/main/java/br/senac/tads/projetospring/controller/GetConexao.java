package br.senac.tads.projetospring.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Valter lafuente Junior
 */
public class GetConexao {

    private Connection getConexao() throws ClassNotFoundException, SQLException {
        Connection con = null;

        //Registrar driver JDBC
        Class.forName("com.mysql.jbbc.Driver");

        //Obter conexão
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/usuariodb",
                "root", "");

        return con;

    }

}
