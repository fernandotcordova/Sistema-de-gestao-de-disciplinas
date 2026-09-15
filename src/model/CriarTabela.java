package model;

import dao.Conexao;
import java.sql.*;

public class CriarTabela {

    public CriarTabela() {
        criarTabela();
    }

    public void criarTabela() {
        String sql = """
            CREATE TABLE IF NOT EXISTS disciplina (
                id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY UNIQUE,
                nome_disciplina VARCHAR(255),
                professor_titular VARCHAR(255),
                quantidade_estudantes INT,
                periodo_ocorre INT
            );
        """;

        try (Connection connection = Conexao.getConnection(); 
             Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

}
