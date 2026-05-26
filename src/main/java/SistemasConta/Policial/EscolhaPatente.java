package SistemasConta.Policial;

import java.util.Scanner;
import SistemasConta.Policial.PatentePolicial;

public class EscolhaPatente {

    public class escolhaPatente(PatentePolicial nivelPatente) {
        Scanner sc = new Scanner(System.in);

        PatentePolicial Patente;
        String escolha;

        do {
            System.out.println("Qual é a sua patente atual? \n");
            System.out.println("1 - Recruta\n");
            System.out.println("2 - Cabo\n");
            System.out.println("3 - Agente\n");
            System.out.println("4 - Tenente\n");
            System.out.println("5 - Choque\n");
            System.out.println("6 - Investigativo\n");
            System.out.println("7 - Militar\n");
            System.out.println("8 - Rocam");
            System.out.println("9 - Perito");
            escolha = sc.nextLine();

            switch (escolha) {
                case 1: {
                    Patente = RECRUTA;
                    break;
                }

                case 2: {
                    Patente =
                    break;
                }

                case 3: {
                    Patente =
                    break;
                }

                case 4: {
                    Patente =
                    break;
                }

                case 5: {
                    Patente =
                    break;
                }

                case 6: {
                    Patente =
                    break;
                }

                case 7: {
                    Patente =
                    break;
                }

                case 8: {
                    Patente =
                    break;
                }

                case 9: {
                    Patente =
                    break;
                }

                default: {
                    System.out.println("Escolha inválida!");
                }
            }
        } while(escolha >9 || escolha< 1);
    }

