package SistemasConta;

import ConexaoBanco.ConexaoDAO;
import SistemaPolicia.AdaptadorTempo.Data;
import SistemasConta.User;

import java.time.LocalDate;
import java.util.Scanner;

public class SistemaCadastro {

    public static void cadastro() {
        Scanner sc = new Scanner(System.in);

        int escolha;

        int id;
        String nome;
        String cpf;
        String sexo;
        String senha;
        LocalDate dataNascimento;


        System.out.println("_____CADASTRO_____\n");

        do {
            System.out.println("Digite seu CPF: \n");
            cpf = sc.nextLine();
            System.out.println("Sigite seu nome: \n");
            nome = sc.nextLine();
            System.out.println("Digite seu sexo: \n");
            sexo = sc.nextLine();
            System.out.println("Digite sua data de nascimento no formato de YYYY/MM/DD. ex: 2005/12/26\n");
            dataNascimento = LocalDate.parse(sc.nextLine());
            System.out.println("Digite uma senha de acesso: \n");
            senha = sc.nextLine();

            int idade = Data.calcularIdade(dataNascimento);

            System.out.println("Confirme seus dados. \nCPF: " + cpf + "\nNOME: " + nome + "\nSEXO: " + sexo + "\nIDADE: " + idade + " anos" + "\nSENHA: " + senha);
            System.out.println("Confirma os dados?\n 1 - SIM\n2 - NÃO");
            escolha = sc.nextInt();
            sc.nextLine();

            if(escolha != 1 && escolha != 2) {
                System.out.println("Escolha inválida, operação cancelada!");
                return;
            }

        } while(escolha != 1);

        ConexaoDAO.cadastroDAO(cpf, nome, sexo, dataNascimento, senha);

        System.out.println("Informações cadastradas e perfil gerado!\n\n");
    }
}
