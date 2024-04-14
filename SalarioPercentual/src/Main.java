import java.util.Locale;
import java.util.Scanner;

import entitie.Calculo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Calculo p = new Calculo();
		System.out.print("Name: ");
		String Name = sc.next();
		
		System.out.print("Gross Salary: ");
		double GrossSalary = sc.nextDouble();

		System.out.print("Tax: ");
		int Tax = sc.nextInt();

		Calculo sal = new Calculo(Name, GrossSalary, Tax);
		
		System.out.println();
		
		System.out.printf("Employee: %s, $ %.2f %n", sal.getName(), sal.netSalary());
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentual = sc.nextDouble();
		sal.increaseSalary(percentual);
		System.out.println();
		System.out.printf("Update Data: %s, $ %.2f", sal.getName(), sal.netSalary());
		sc.close();
	}

}
