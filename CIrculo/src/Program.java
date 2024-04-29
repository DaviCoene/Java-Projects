import java.util.Scanner;

import entitie.Circulo;



public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.print("Digite um valor para o primeiro lado: ");
		int valor1 = sc.nextInt();
		
		
		Circulo ratang = new Circulo(valor1);
		ratang.calcularArea();
		ratang.calcularPerimetro();
		
		System.out.println(ratang.getArea());
		System.out.println(ratang.getPerimetro());

	}

}
}