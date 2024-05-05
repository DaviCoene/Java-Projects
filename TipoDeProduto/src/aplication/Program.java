package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i+ 1)+" data: ");
			System.out.print("Common, used or imported (c/u/i)?  ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double Price = sc.nextDouble();
			double customPrice;
			Date manufact;
			switch(ch) {
			
			case 'i':
				System.out.print("Customs Price: ");
				customPrice = sc.nextDouble();
				Product p = new ImportedProduct(name, Price, customPrice);
				list.add(p);
				break;
			case 'I':
				System.out.print("Customs Price: ");
				customPrice = sc.nextDouble();
				Product pa = new ImportedProduct(name, Price, customPrice);
				list.add(pa);
				
				break;
			case 'U':
				System.out.print("manufact Date: ");
				manufact = sdf1.parse(sc.next());
				Product pas = new UsedProduct(name, Price, manufact);
				list.add(pas);
				break;
			case 'u':
				System.out.print("manufact Date: ");
				manufact = sdf1.parse(sc.next());
				Product pasa = new UsedProduct(name, Price, manufact);
				list.add(pasa);
				break;
			default:
				Product passa = new Product(name, Price);
				list.add(passa);
			}
			
		
		}
		
		for(Product por : list) {
			System.out.println(por.priceTag());
		}
			
		sc.close();
		
	}

}
