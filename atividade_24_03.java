package sla;
import java.util.Scanner;

public class atividade_24_03 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o exercicio (1 a 8): ");
        int op = sc.nextInt();

        switch (op) {

            case 1:
                int n = sc.nextInt();
                if (n < 0)
                    System.out.println("NEGATIVO");
                else
                    System.out.println("NAO NEGATIVO");
                break;

            case 2:
              
                break;

            case 3:
                
                break;

            case 4:
                
                break;

            case 5:
                
                break;

            case 6:
                
                break;

            case 7:
                
                break;

            case 8:
                
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        sc.close();
    }
}