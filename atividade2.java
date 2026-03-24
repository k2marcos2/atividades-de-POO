package sla;
import java.util.Locale;
import java.util.Scanner;

public class atividade2 {
	
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int minutos;
	char plano;
	
	System.out.printf("qual sera seu plano? %n (b ou B) para o plano basico %n (P ou P) para o plano plus ");
	plano = sc.next().charAt(0);
	
	
	if (plano == 'b' || plano == 'B') { 
	
		double conta = 50.0;
		
		System.out.printf("voce passou quantos minutos em ligação?");
		minutos = sc.nextInt();
		
		if (minutos > 100) {	
		conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		}else if (plano == 'p' || plano == 'P') { 
			
			double conta = 100.0;
			
			System.out.printf("voce passou quantos minutos em ligação?");
			minutos = sc.nextInt();
			
			if (minutos > 300) {	
			conta += (minutos - 300) * 2.0;
			
			System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
			}else {
			
			System.out.printf("Escolha uma opção valida");
			
		}
		
	}
}
}

	
	
	
	


