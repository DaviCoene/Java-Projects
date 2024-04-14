import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i <n; i++) {
			vect[i] = sc.nextDouble();		
		}
		
		double sum = 0;
		for (int a = 0; a < n; a++) {
			sum += vect[a];
		}
		double avg = sum / n;
		System.out.printf("average Height: %.2f",avg);
		sc.close();
	}

}
