package sla;
import java.util.Scanner;

public class atividade_31_para_as_oras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mask = 0b1000000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
		System.out.println("7th bit is true!");
		}
		else {
		System.out.println("7th bit is false");
		}
		sc.close();
		}
}
