package ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexao {

    public static void criarTabela() {

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
            );
        """;

            Statement st = conn.createStatement();

            st.execute(sql);

            System.out.println("Tabela criada!");

        } catch(Exception e) {

            e.printStackTrace();
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
