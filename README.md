# 🏫 Sistema Ensino

<div>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java image" />
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL image" />
</div>

> Sistema de gerenciamento acadêmico desenvolvido em Java Swing para cadastro, busca e exclusão de disciplinas e alunos.

---

## 💻 Sobre o Projeto

O **Sistema Ensino** é uma aplicação desktop desenvolvida para facilitar o controle de disciplinas e alunos em uma instituição de ensino. O projeto utiliza o padrão de arquitetura de software para organizar as responsabilidades entre banco de dados (DAO), lógica de negócio (Model) e telas (Views).

### ⚙️ Funcionalidades Principais
* **Busca Avançada:** Localização de disciplinas pelo nome com tratamento de caixa alta/baixa (Case Insensitive).
* **Interface Fluida (Cards):** Visualização de dados no `JList` utilizando formatação HTML/CSS para uma experiência de usuário moderna.
* **Gerenciamento Completo:** Telas dedicadas para adicionar alunos, buscar disciplinas e excluir registros com confirmação de segurança.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 26)
* **Interface Gráfica:** Java Swing / AWT
* **Banco de Dados:** PostgreSQL
* **Persistência:** JDBC (Java Database Connectivity)
* **IDE:** Apache NetBeans

---

## 📁 Estrutura de Pacotes

O código está organizado da seguinte forma dentro do pacote `src`:

```text
sistema.ensino
│
├── dao                  # Comunicação com o banco de dados (Acesso aos Dados)
│   ├── Conexao.java          # Gerenciador de conexão com o PostgreSQL
│   └── DisciplinaDAO.java    # Queries SQL (Buscar, Inserir, Deletar)
│
├── model                # Classes de Entidade (Regras de Negócio)
│   ├── Disciplina.java       # Entidade Disciplina com métodos getters/setters e toString customizado
│   └── CriarTabela.java      # Script auxiliar de inicialização
│
└── views                # Telas da Interface Gráfica (Swing)
    ├── TelaInicial.java      # Menu principal do sistema
    ├── BuscarDisciplina.java # Tela de listagem e pesquisa dinâmica
    ├── AdicionarAluno.java   # Formulário de cadastro de estudantes
    └── ExcluirAluno.java     # Tela de remoção e gerenciamento
```

---

## 🗄️ Banco de Dados

Para rodar o projeto localmente, crie um banco de dados no seu PostgreSQL chamado `sistema_ensino` e execute o script SQL abaixo para gerar a estrutura correta:

```sql
-- Criação da tabela de disciplinas
CREATE TABLE disciplina (
    id SERIAL PRIMARY KEY,
    nome_disciplina VARCHAR(150) NOT NULL,
    professor_titular VARCHAR(150) NOT NULL,
    quantidade_estudantes INTEGER DEFAULT 0,
    periodo_ocorre INTEGER NOT NULL
);

-- Registros de teste (Opcional)
INSERT INTO disciplina (nome_disciplina, professor_titular, quantidade_estudantes, periodo_ocorre) 
VALUES ('Programação Orientada a Objetos', 'Dr. Carlos Silva', 35, 3);
```

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com
   ```
2. **Configure o Banco de Dados:**
   * Certifique-se de que o PostgreSQL está rodando.
   * Altere as credenciais (usuário e senha) no arquivo `Conexao.java` se necessário.
3. **Abra no NetBeans:**
   * Vá em `File > Open Project` e selecione a pasta clonada.
4. **Adicione o Driver:**
   * Caso a IDE acuse falta do driver do banco, adicione o arquivo `.jar` contido na pasta `lib` do projeto em suas propriedades de *Libraries*.
5. **Execute a aplicação:**
   * Clique com o botão direito em `TelaInicial.java` e selecione **Run File**.

---

## 📝 Licença

Este projeto é protegido por uma licença proprietária. O uso é **estritamente vetado para fins acadêmicos** e **não pode ser utilizado para fins comerciais**. Consulte o arquivo [LICENSE](LICENSE.md) para mais detalhes.

---
Desenvolvido por **Seu Nome** 👋
