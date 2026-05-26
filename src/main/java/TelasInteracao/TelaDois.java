package TelasInteracao;

import java.util.Scanner;

public class TelaDois {

    public void TelaUsuario(String nome) {
        Scanner sc = new Scanner(System.in);

        int escolha;

        System.out.println("Bem vindo " + nome + "\n");

        do {
            System.out.println("1 - Multas Pendentes\n");
            System.out.println("2 - Realizar Boletim de ocorrencia\n");
            System.out.println("3 - Solicitar apoio policial\n");
            System.out.println("4 - veiculo\n");
            System.out.println("5 - Cadastrar novo documento");
            System.out.println("4 - Sair da conta");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1: {

                    break;
                }

                case 2: {

                    break;
                }

                case 3: {

                    break;
                }

                case 4: {

                }

                case 6: {

                }

                case 7: {
                    System.out.println("Saindo da conta...");
                    return;
                }

                default: {
                    return;
                }

            }
        } while (escolha != 4);
    }

    public void TelaPolicial() {


    }

    public void TelaAdm() {


    }
}
