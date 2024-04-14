import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		char xa;
		String x, s1, s2, s3,ss;
		int y, xt;
		double z;
		xa = sc.next().charAt(0);
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Você digitou: " + xa);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("---------------------------");
		xt = sc.nextInt();
		ss = sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println(xt);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}

}
