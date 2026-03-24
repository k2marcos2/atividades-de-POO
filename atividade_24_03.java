package sla;
import java.util.Scanner;

public class atividade_24_03 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o exercicio (1 a 8): ");
        int op = sc.nextInt();

        switch (op) {

            case 1:
                int n ;
                n = sc.nextInt();
                
                if (n < 0)
                    System.out.println("NEGATIVO");
                else
                    System.out.println("NAO NEGATIVO");
                break;

            case 2:
            	int num;
            	num = sc.nextInt();
                if (num % 2 == 0)
                    System.out.println("PAR");
                else
                    System.out.println("IMPAR");
              
                break;

            case 3:
            	
            	int a ;
                int b ;
                
                a = sc.nextInt();
                b = sc.nextInt();

                if (a % b == 0 || b % a == 0)
                    System.out.println("Sao Multiplos");
                else
                    System.out.println("Nao sao Multiplos");
                
                break;

            case 4:
            	
            	int inicio ;
                int fim ;
                int duracao;
                
                inicio = sc.nextInt();
                fim = sc.nextInt();

                if (inicio < fim)
                    duracao = fim - inicio;
                else
                    duracao = 24 - inicio + fim;

                System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
                
                break;

            case 5:
            	
            	int codigo ;
                int qtd ;
                double total = 0;
                
                codigo = sc.nextInt();
                qtd = sc.nextInt();
                  

                switch (codigo) {
                    case 1: total = qtd * 4.00; break;
                    case 2: total = qtd * 4.50; break;
                    case 3: total = qtd * 5.00; break;
                    case 4: total = qtd * 2.00; break;
                    case 5: total = qtd * 1.50; break;
                }

                System.out.printf("Total: R$ %.2f\n", total);
                
                break;

            case 6:
            	
            	double valor;
            	
            	valor = sc.nextDouble();

                if (valor >= 0 && valor <= 25)
                    System.out.println("Intervalo [0,25]");
                else if (valor <= 50)
                    System.out.println("Intervalo (25,50]");
                else if (valor <= 75)
                    System.out.println("Intervalo (50,75]");
                else if (valor <= 100)
                    System.out.println("Intervalo (75,100]");
                else
                    System.out.println("Fora de intervalo");
                
                break;

            case 7:
            	
            	double x ;
                double y ;
                
                x = sc.nextDouble();
                y = sc.nextDouble();


                if (x == 0 && y == 0)
                    System.out.println("Origem");
                else if (x == 0)
                    System.out.println("Eixo Y");
                else if (y == 0)
                    System.out.println("Eixo X");
                else if (x > 0 && y > 0)
                    System.out.println("Q1");
                else if (x < 0 && y > 0)
                    System.out.println("Q2");
                else if (x < 0 && y < 0)
                    System.out.println("Q3");
                else
                    System.out.println("Q4");
                
                
                break;

            case 8:
            	
            	double salario ;
                double imposto = 0;
                
                salario = sc.nextDouble();

                if (salario <= 2000)
                    System.out.println("Isento");
                else if (salario <= 3000) {
                    imposto = (salario - 2000) * 0.08;
                    System.out.printf("R$ %.2f\n", imposto);
                }
                else if (salario <= 4500) {
                    imposto = (1000 * 0.08) + (salario - 3000) * 0.18;
                    System.out.printf("R$ %.2f\n", imposto);
                }
                else {
                    imposto = (1000 * 0.08) + (1500 * 0.18) + (salario - 4500) * 0.28;
                    System.out.printf("R$ %.2f\n", imposto);
                }
                
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        sc.close();
    }
}