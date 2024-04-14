
public class Main {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A,B,C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz Quadrada de " + x + " = " + A);
		System.out.println("Raiz Quadrada de " + y + " = " + B);
		System.out.println("Raiz Quadrada de " + 25 + " = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(y, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado ao " + y + " = " + A);
		System.out.println(x + " elevado ao Quadrado = " + B);
		System.out.println(5 + " elevado ao Quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);

		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		
	}

}
