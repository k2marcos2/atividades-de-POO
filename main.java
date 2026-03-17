package sla;
import java.util.Locale;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String product1 = "Computer";
		String product2 = "Office desk";
		
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Produtos: %n");
		System.out.printf("%s, which price is $ %f %n", product1, price1);
		System.out.printf("%s, which price is $ %f %n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code,gender);
		System.out.printf("Measue with eight decimal places: %f",measure );
		System.out.printf("Rouded (three decimal places): %.3f",measure );
		System.out.printf(Locale.US,"US decimal point: %.3f",measure );
		
		
		
		
	}

}