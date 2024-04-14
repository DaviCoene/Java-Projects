import java.util.Locale;
import java.util.Scanner;

import entitie.Produto;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas Pessoas serão digitadas?: ");
		int n = sc.nextInt();
		
		Produto[] vect = new Produto[n];
		
		for (int i=0;i<n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dº pessoa: %n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Produto(name, age, height);
		}
		
		double sum = 0;
		for (int i=0; i < vect.length; i++) {
			
			sum = sum + vect[i].getAltura();
			
		}
		
		int quantity = 0;
		
		
		for (int i=0; i <vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				quantity++;
				
			}
		}	
		Produto[] less16 = new Produto[quantity];
		int less16index = 0;
		for (int i=0; i <vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				String less = vect[i].getName(); 
				less16[less16index] = new Produto(less); 
				less16index++;
			}
		}	
		
		double percentage = (quantity * 100) / vect.length;
		
		double avg = sum / vect.length;

		System.out.printf("Altura média: %.2f %n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%% %n", percentage);
		
		for (int i= 0; i < less16.length;i++) {
			System.out.println(less16[i].getName());
		}
		
		
		
		
		
		sc.close();
		
		
		
		
		
	}

}
