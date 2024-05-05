import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < n ; i++ ) {
			sc.nextLine();
			System.out.println("Employee #"+ (i + 1) +" data: ");
			System.out.print("Outsourced (y/n)? ");
			char out = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (out == 'y' || out == 'Y') {
				System.out.print("Additional charge: ");
				double adicionalCharge = sc.nextDouble();
				
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, adicionalCharge);
				list.add(emp);
			}
			else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
			
		}
		
		for(Employee emp : list) {
			System.out.println(emp.getName()+  " - " + String.format("%.2f",emp.payment()));
		}
		sc.close();
		
		
	}

}
