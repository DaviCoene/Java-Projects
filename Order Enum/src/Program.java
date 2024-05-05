import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("DD/MM/yyyy");
		
		System.out.println("ENTER CLIENT DATA: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date: ");
		Date birth = sdf1.parse(sc.next());
		
		Client client = new Client(name,email, birth);
		
		System.out.println("ENTER ORDER DATA: ");
		System.out.print("Status: ");
		String status = sc.next();
		Date x1 = new Date();
		
		Order order = new Order(x1 , OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 0 ; i <= n; i++) {
			System.out.println("ENTER #" + (i+1) +" ITEM DATA: " );
			sc.nextLine();
			String nameP = sc.nextLine();
			double Price = sc.nextDouble();
			int quantity = sc.nextInt();
			
			Product product = new Product(nameP, Price);
			OrdemItem ordemitem = new OrdemItem(quantity, Price, product);
		
			order.addItem(ordemitem);
			
		}

		System.out.println(order);
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
