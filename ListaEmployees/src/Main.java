
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> empregado = new ArrayList<>();
		
		System.out.print("How many employees will be registed? ");
		int n = sc.nextInt();
		
		for (int i = 0 ; i < n; i++) {
			
			System.out.println();
			System.out.println("Employee # "+(i + 1)+": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name , salary);
			empregado.add(emp);
		}
		
		System.out.print("Enter the employee id that wil have salary increase: ");
		int ids = sc.nextInt();
		
		int desc = idExist(empregado, ids);
		if (desc == 1) {
		System.out.print("Enter percentage: ");
		double percentage = sc.nextDouble();
		for (int i = 0; i < empregado.size(); i++) {	
			if (empregado.get(i).get_id() == ids) {
				empregado.get(i).increaseSalary(percentage);
			}
		}
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp: empregado) {
			System.out.println(emp);
		}
		
		sc.close(); 
	}
	
	public static int idExist(List<Employee> list, int x) {
		while(true) {
			for (int i = 0; i < list.size(); i++) {	
			if(list.get(i).get_id() == x) {
				return 1;
			}
				}
			System.out.println("This id is not exist!");
			return 0;
		}
		
	}
	
	
}