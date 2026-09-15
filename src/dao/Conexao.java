package dao;

import java.sql.*;

public class Conexao {
    private static final String URL = "jdbc:postgresql://localhost:5432/sistema_ensino";
    private static final String USUARIO = "seu_usuário";
    private static final String SENHA = "sua_senha";

    // Método de conexão
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
    
}
