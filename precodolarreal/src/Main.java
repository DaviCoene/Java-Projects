import java.util.Locale;
import java.util.Scanner;

import entitie.Calculo;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.printf("What is the dollar price?: ");
		double a = sc.nextDouble();
		System.out.printf("%n How many dollars will be bought?: %n");
		double b = sc.nextDouble();
		double c = Calculo.precoDollar(b, a);
		System.out.printf("Amount to be paid in reais = %.2f ", c);
		
		sc.close();

	}

}
