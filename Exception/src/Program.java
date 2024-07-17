import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		method1();
	}
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			e.printStackTrace();
			sc.next();
			
		}

		System.out.println("END OF PROGRAM");
		
		
		sc.close();
	}
	
}
