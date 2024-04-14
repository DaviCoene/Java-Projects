import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("Digite em C");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Temperatura em Fahrenheit: %.1f%n", F);
			System.out.print("Repetir? s/n");
			resp = sc.next().charAt(0);
		}while(resp != 'n');
	}

}
