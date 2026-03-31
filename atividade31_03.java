package sla;
import java.util.Scanner;
public class atividade31_03 {
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o exercício (1 a 7): ");
        int op = sc.nextInt();

        switch (op) {

            case 1:
                
                int X = sc.nextInt();
                for (int i = 1; i <= X; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;

            case 2:
                
                int N2 = sc.nextInt();
                int in = 0, out = 0;

                for (int i = 0; i < N2; i++) {
                    int num = sc.nextInt();
                    if (num >= 10 && num <= 20) {
                        in++;
                    } else {
                        out++;
                    }
                }

                System.out.println(in + " in");
                System.out.println(out + " out");
                break;

            case 3:
                
                int N3 = sc.nextInt();

                for (int i = 0; i < N3; i++) {
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    double c = sc.nextDouble();

                    double media = (a * 2 + b * 3 + c * 5) / 10;
                    System.out.printf("%.1f\n", media);
                }
                break;

            case 4:
                
                int N4 = sc.nextInt();

                for (int i = 0; i < N4; i++) {
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();

                    if (b == 0) {
                        System.out.println("divisao impossivel");
                    } else {
                        System.out.println(a / b);
                    }
                }
                break;

            case 5:
                
                int N5 = sc.nextInt();
                int fatorial = 1;

                for (int i = 1; i <= N5; i++) {
                    fatorial *= i;
                }

                System.out.println(fatorial);
                break;

            case 6:
                
                int N6 = sc.nextInt();

                for (int i = 1; i <= N6; i++) {
                    if (N6 % i == 0) {
                        System.out.println(i);
                    }
                }
                break;

            case 7:
                
                int N7 = sc.nextInt();

                for (int i = 1; i <= N7; i++) {
                    System.out.println(i + " " + (i * i) + " " + (i * i * i));
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
