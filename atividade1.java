package sla;
import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		String nome;
		int idade;
		Double altura;
		
		System.out.print("Digite seu nome: ");
		nome = scanf.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = scanf.nextInt();
		
		System.out.print("Digite sua altura: ");
		altura = scanf.nextDouble();
		
		if (idade < 18) {
		
			System.out.println("parabens, voce é maior de idade, UUUUAUUUU");
		}else {
			
			System.out.println("voce não é maior de idade");
		}
		
		if(altura < 1.75) {
			
			System.out.print("anão de jardim");
		}else {
			System.out.print("c tem altura de gente");
		}
		
	}

}
