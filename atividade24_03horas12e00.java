package sla;
import java.util.Scanner;

public class atividade24_03horas12e00 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("MENU");
            System.out.println("1 - Exercicio 01 (Senha)");
            System.out.println("2 - Exercicio 02 (Quadrantes)");
            System.out.println("3 - Exercicio 03 (Combustivel)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    // EXERCÍCIO 01
                    int senha;
                    do {
                    	
                        senha = sc.nextInt();

                        switch (senha) {
                            case 2002:
                                System.out.println("Acesso Permitido");
                                break;
                            default:
                                System.out.println("Senha Invalida");
                        }

                    } while (senha != 2002);
                    break;

                case 2:
                    // EXERCÍCIO 02
                    int x, y;
                    while (true) {
                        x = sc.nextInt();
                        y = sc.nextInt();

                        if (x == 0 || y == 0) {
                            break;
                        }

                        int quadrante = 0;

                        if (x > 0 && y > 0) quadrante = 1;
                        else if (x < 0 && y > 0) quadrante = 2;
                        else if (x < 0 && y < 0) quadrante = 3;
                        else if (x > 0 && y < 0) quadrante = 4;

                        switch (quadrante) {
                            case 1:
                                System.out.println("primeiro");
                                break;
                            case 2:
                                System.out.println("segundo");
                                break;
                            case 3:
                                System.out.println("terceiro");
                                break;
                            case 4:
                                System.out.println("quarto");
                                break;
                        }
                    }
                    break;

                case 3:
                    // EXERCÍCIO 03
                    int codigo;
                    int alcool = 0, gasolina = 0, diesel = 0;

                    while (true) {
                        codigo = sc.nextInt();

                        switch (codigo) {
                            case 1:
                                alcool++;
                                break;
                            case 2:
                                gasolina++;
                                break;
                            case 3:
                                diesel++;
                                break;
                            case 4:
                                System.out.println("MUITO OBRIGADO");
                                System.out.println("Alcool: " + alcool);
                                System.out.println("Gasolina: " + gasolina);
                                System.out.println("Diesel: " + diesel);
                                break;
                            default:
                                // ignora inválido
                                break;
                        }

                        if (codigo == 4) {
                            break;
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 0);

        sc.close();
    }
}
