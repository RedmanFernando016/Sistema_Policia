package TelasInteracao;

import java.util.Scanner;

public class TelaUm {

    public void telaCadastro() {
        Scanner sc = new Scanner(System.in);

        int escolha;
        System.out.println("--------------------");
        System.out.println("  SISTEMA POLICIAL  ");
        System.out.println("--------------------");

        do {
            String cpf;
            String senha;

            System.out.println(" 1 - Login \n");
            System.out.println(" 2 - Registrar \n");
            System.out.println(" 3 - Sair\n");
            escolha = sc.nextInt();
            sc.nextLine();

            switch(escolha) {

                case 1: {
                    SistemasConta.SistemaLogin.Login();
                    break;
                }

                case 2: {
                    SistemasConta.SistemaCadastro.cadastro();
                    break;
                }

                case 3: {

                    break;
                }

                default: {
                    return;
                }
            }

        } while(escolha != 1 && escolha != 2);
    }
}
