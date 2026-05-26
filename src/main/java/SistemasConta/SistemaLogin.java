package SistemasConta;

import ConexaoBanco.ConexaoDAOUsuario;

import java.util.Scanner;

public class SistemaLogin {
    public static void Login() {
        Scanner sc = new Scanner(System.in);


        System.out.println("_____LOGIN_____\n\n");
        System.out.println("Digite seu CPF: \n");
        String cpf = sc.nextLine();
        System.out.println("Digite sua senha: \n");
        String senha = sc.nextLine();
        ConexaoDAOUsuario.loginDAO(cpf, senha);

    }
}
