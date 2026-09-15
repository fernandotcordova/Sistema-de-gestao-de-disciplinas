package model;

public class Disciplina {

    private int id;
    private String nomeDisciplina;
    private String professor_titular;
    private int quantidade_estudantes;
    private int periodo_ocorre;

    public Disciplina(int id, String nomeDisciplina, String professor_titular, int quantidade_estudantes, int periodo_ocorre) {
        this.id = id;
        this.nomeDisciplina = nomeDisciplina;
        this.professor_titular = professor_titular;
        this.quantidade_estudantes = quantidade_estudantes;
        this.periodo_ocorre = periodo_ocorre;
    }

    public Disciplina(String nomeDisciplina, String professor_titular, int quantidade_estudantes, int periodo_ocorre) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor_titular = professor_titular;
        this.quantidade_estudantes = quantidade_estudantes;
        this.periodo_ocorre = periodo_ocorre;
    }

    public Disciplina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getProfessor_titular() {
        return professor_titular;
    }

    public void setProfessor_titular(String professor_titular) {
        this.professor_titular = professor_titular;
    }

    public int getQuantidade_estudantes() {
        return quantidade_estudantes;
    }

    public void setQuantidade_estudantes(int quantidade_estudantes) {
        this.quantidade_estudantes = quantidade_estudantes;
    }

    public int getPeriodo_ocorre() {
        return periodo_ocorre;
    }

    public void setPeriodo_ocorre(int periodo_ocorre) {
        this.periodo_ocorre = periodo_ocorre;
    }

    @Override
    public String toString() {
        java.net.URL urlImagem = getClass().getResource("/imagens/livro.png");

        String tagImagem = "";
        if (urlImagem != null) {
            tagImagem = "<img src='" + urlImagem + "' width='40' height='40' style='border-radius: 4px;'>";
        } else {
            tagImagem = "<span style='font-size: 24px;'>📚</span>";
        }

        return "<html>"
                + "  <div style='"
                + "    width: 280px;"
                + "    padding: 12px;"
                + "    margin: 4px 2px;"
                + "    background-color: #ffffff;"
                + "    border: 1px solid #e2e8f0;"
                + "    border-radius: 8px;"
                + "  '>"
                + "    <table border='0' cellpadding='0' cellspacing='0' width='100%'>"
                + "      <tr>"
                + "        <!-- Coluna da Imagem/Ícone -->"
                + "        <td valign='top' width='50' style='padding-right: 12px;'>"
                + "          " + tagImagem + "" 
                + "        </td>"
                + "        <!-- Coluna dos Dados -->"
                + "        <td valign='top'>"
                + "          <b style='font-size: 13px; color: #1e293b; font-family: sans-serif;'>" + this.nomeDisciplina + "</b> "
                + "          <span style='color: #94a3b8; font-size: 10px; font-family: sans-serif;'>(# " + this.id + ")</span><br>"
                + "          "
                + "          <div style='margin-top: 4px; font-size: 11px; color: #475569; font-family: sans-serif;'>"
                + "            <b>👨‍🏫 Prof:</b> " + this.professor_titular + "<br>"
                + "            <b>👥 Alunos:</b> " + this.quantidade_estudantes + " | <b>📅 Semestre:</b> " + this.periodo_ocorre + "º"
                + "          </div>"
                + "        </td>"
                + "      </tr>"
                + "    </table>"
                + "  </div>"
                + "</html>";
    }

}
