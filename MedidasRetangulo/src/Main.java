import java.util.Locale;
import java.util.Scanner;

import entitie.Calculo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		
		Calculo ret = new Calculo();

		System.out.println("Enter rectangle width and height: ");
		ret.height = sc.nextDouble();
		ret.width = sc.nextDouble();
		
		double area = ret.Area();
		double perimeter = ret.Perimeter();
		double diagonal = ret.Diagonal();
		
		System.out.printf("Area = %.2f %n", area);

		System.out.printf("Perimeter = %.2f %n", perimeter);

		System.out.printf("Diagonal = %.2f %n", diagonal);


		sc.close();
	}

}
