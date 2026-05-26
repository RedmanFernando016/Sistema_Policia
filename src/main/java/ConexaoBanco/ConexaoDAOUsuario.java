package ConexaoBanco;

import SistemasConta.NivelAcesso;
import SistemasConta.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class ConexaoDAOUsuario {

    public static boolean cadastroDAO(String cpf, String nome, String sexo, LocalDate dataNascimento, String senha, NivelAcesso nivelAcesso) {

        try {
            Connection conn = Conexao.conectar();

            String sql = "INSERT INTO usuario (cpf, nome, sexo, dataNascimento, senha, nivelAcesso) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, cpf);
            ps.setString(2, nome);
            ps.setString(3, sexo);
            ps.setDate(4, java.sql.Date.valueOf(dataNascimento));
            ps.setString(5, senha);
            ps.setString(6, String.valueOf(nivelAcesso));

            ps.executeUpdate();

            System.out.println("Dados Cadastrados!");
            return true;

        } catch(Exception e) {

            e.printStackTrace();

            System.out.println("Erro ao cadastrar usuario!");
            return false;
        }
    }

    public static User loginDAO(String cpf, String senha) {

        try {
            Connection conn = Conexao.conectar();

            String sql = "SELECT * FROM usuario WHERE cpf = ? AND senha = ?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, cpf);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                User usuario = new User();

                usuario.setCpf(rs.getString("cpf"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSexo(rs.getString("sexo"));
                usuario.setDataNascimento(rs.getDate("dataNascimento").toLocalDate()
                );

                return usuario;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
