import java.util.Scanner;

import entitie.Product;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product ab;
		ab = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		ab.name = sc.next();
		System.out.print("Price: ");
		ab.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		ab.stock = sc.nextInt();
		System.out.println();
		
		
		
		System.out.println(ab);
		 
		System.out.print("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		ab.stock = ab.unitAdd(add);
		System.out.println();
		System.out.println(ab);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int less = sc.nextInt();
		System.out.println();
		ab.stock = ab.unitLess(less);
		
		System.out.println(ab);
		sc.close();

	}

}
