package ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexao {

    public static void criarTabelaUsuario() {

        try {

            Connection conn = Conexao.conectar();

            String sql = """
            CREATE TABLE IF NOT EXISTS usuario (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                cpf TEXT NOT NULL UNIQUE,
                nome TEXT NOT NULL,
                senha TEXT NOT NULL,
                sexo TEXT NOT NULL,
                dataNascimento DATE NOT NULL
                nivelAcesso TEXT NOT NULL;
            );
        """;

            Statement st = conn.createStatement();

            st.execute(sql);

            System.out.println("Tabela usuario criada!");

        } catch(Exception e) {

            e.printStackTrace();
            System.out.println("Erro ao criar a table: Usuario");
        }
    }

    public static void criarTabelaMulta() {

        try {

            Connection conn = Conexao.conectar();

            String sql = """
                CREATE TABLE IF NOT EXISTS multa (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    
                    usuario_id INTEGER NOT NULL,
                    policial_id INTEGER NOT NULL,
                    veiculo_id INTEGER,
                    
                    nomeMulta TEXT NOT NULL,
                    descricaoMulta TEXT,
                    valorMulta REAL,
                    dataMulta DATE,
                    prazoPagamento DATE,
                             
                    FOREIGN KEY (usuario_id)
                    REFERENCES usuarios(id)
                    
                    FOREIGN KEY (policial_id)
                    REFERENCES agente(id)
                    
                    FOREIGN KEY veiculos_id
                    REFERENCES veiculo(id)
                );
            """;

            Statement st = conn.createStatement();

            st.execute(sql);

            System.out.println("Tabela multas criada");

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("Erro ao criar a tabela: Multa");
        }
    }

    public static void criarTabelaVeiculo() {

        try {
            Connection conn = Conexao.conectar();
            String sql = """
               CREATE TABLE IF NOT EXISTS veiculo(
                    id INTEGER PRIMARY KEY AUTOINCREMENT, 
                    
                    usuario_id INTEGER NOT NULL,
                    
                    nomeCarro TEXT NOT NULL,
                    marcaCarro TEXT NOT NULL,
                    modeloCarro TEXT NOT NULL,
                    ano DATE,
                    corCarro TEXT NOT NULL,
                    placaCarro TEXT NOT NULL,
                    
                    FOREIGN KEY (usuario_id)
                    REFERENCES usuarios(id)
               );
            """;

            Statement st = conn.createStatement();

            st.execute(sql);

            System.out.println("Tabela Veiculos criada!");

        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Erro na criação da tabela: veiculo");
        }
    }


    public static void criartabelaAgente() {
        try {

            Connection conn = Conexao.conectar();

            String sql = """
                CREATE TABLE IF NOT EXISTS agente(
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    
                    usuario_id INTEGER NOT NULL,
                    
                    nomeSoldado TEXT NOT NULL,
                    patenteSoldado TEXT NOT NULL,
                    batalhaoSoldado INTEGER NOT NULL,
                    anoAtuacao DATE,
                );
            """;
            Statement st = conn.createStatement();

            st.execute(sql);

            System.out.println("Tabela agente criada com sucesso!");

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("Erro ao criar a tabela: agente");
        }
    }

    public static Connection conectar() {
        String url = "jdbc:sqlite:banco.db";

        try {
            Connection conn = DriverManager.getConnection(url);

            System.out.println("Conectado ao banco");

            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
