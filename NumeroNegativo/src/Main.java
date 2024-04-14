import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros você vai digitar?: ");
		int n = sc.nextInt();
		
		Produto[] negative = new Produto[n];
		int negaa = 0;
		for (int i = 0; i < n; i++ ) {
			sc.nextLine();
			System.out.println("Digite um número: ");
			int num = sc.nextInt(); 
			while(num > 10);{
			
			
			if (num > 10) {
				System.out.print("escolha um numero até 10");
				num = sc.nextInt(); 
			}
			}
			if (num < 0) {
				negative[negaa] = new Produto(num);
				negaa++;
			}
			
	}
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for (int i = 0; i < negative.length; i++) {
			int number = negative[i].getNumero();
			System.out.println(number);
		}
		sc.close();
	}
}
