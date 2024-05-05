import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.People;
import entities.PeopleCompany;
import entities.PeopleIndividual;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<People> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax prayers: ");
		int n = sc.nextInt();
		
		for(int i =0; i < n ; i++) {
			System.out.println("Tax prayer #"+(i+1)+ " data: ");
			System.out.print("Individual or company: ");
			char h = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if (h == 'c') {
				System.out.print("Number of employees: ");
				int numE = sc.nextInt();
				
				People pep = new PeopleCompany(name, income, numE);
				list.add(pep);
			}
			else {
				System.out.print("Health Expenditures: ");
				double health = sc.nextDouble();
				
				People pep = new PeopleIndividual(name, income, health);
				list.add(pep);
			}
			
		}
		
		System.out.println("TAXES PAID: ");
		double totaltax = 0;
		for(People pep : list) {
			
			totaltax = totaltax + pep.tax();
			System.out.println(pep.getName() + ": $ " + String.format("%.2f",pep.tax()));
		}
		System.out.println();
		
		System.out.println("TOTAL TAXES: $"+ String.format("%.2f", totaltax));
		sc.close();
		
	}

}
