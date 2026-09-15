package dao;

import java.sql.*;
import model.Disciplina;

public class DisciplinaDAO {

    public DisciplinaDAO() {
    }
    
    public void inserir(Disciplina disciplina){
        String sql = "INSERT INTO disciplina (nome_disciplina, professor_titular, quantidade_estudantes, periodo_ocorre) VALUES(?, ?, ?, ?)";
        
        try(Connection conexao = Conexao.getConnection();
            PreparedStatement pstmt = conexao.prepareStatement(sql)){
            
            pstmt.setString(1, disciplina.getNomeDisciplina());
            pstmt.setString(2, disciplina.getProfessor_titular());
            pstmt.setInt(3, disciplina.getQuantidade_estudantes());
            pstmt.setInt(4, disciplina.getPeriodo_ocorre());
            
            pstmt.executeUpdate();
            
            try(ResultSet rs = pstmt.getGeneratedKeys()){
                if(rs.next()){
                    disciplina.setId(rs.getInt(1));
                }
            }
            
            System.out.println("Disciplina adicionada com sucesso!!");
            
        } catch(SQLException e){
            System.out.println("Erro ao adicionar ao banco de dados: " + e.getMessage());
        }
    }
    
    
    public Disciplina buscarPorNome(String nome){
        String sql = "SELECT * FROM disciplina WHERE LOWER(nome_disciplina) = LOWER(?)";
        try(Connection conexao = Conexao.getConnection();
                PreparedStatement pstmt = conexao.prepareStatement(sql)){
            
            pstmt.setString(1, nome.trim());

            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                Disciplina disciplina = new Disciplina(
                        rs.getInt("id"),
                        rs.getString("nome_disciplina"), 
                        rs.getString("professor_titular"),
                        rs.getInt("quantidade_estudantes"), 
                        rs.getInt("periodo_ocorre")
                );
                return disciplina;
            }
        } catch(SQLException e){
            System.out.println("Erro ao buscar disciplina: " + e.getMessage());
        }
        return null;
    }
    
    
    
    public void excluirDisciplina(Disciplina disciplina) throws SQLException{
        String sql = "DELETE FROM disciplina WHERE id = ?";
        
        try(Connection conexao = Conexao.getConnection();
                PreparedStatement pstmt = conexao.prepareStatement(sql)){
            pstmt.setInt(1, disciplina.getId());
            
            pstmt.executeUpdate();
        } catch(SQLException e){
            System.out.println("Erro ao excluir disciplina: " + e.getMessage());
        }
    }
    
}
