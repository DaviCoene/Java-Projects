import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.print("Digite um valor para o primeiro lado: ");
		int valor1 = sc.nextInt();
		System.out.print("Digite um valor para o segundo lado: ");
		int valor2 = sc.nextInt();
		
		
		Retangulo ratang = new Retangulo(valor1, valor2);
		ratang.calcularArea();
		ratang.calcularPerimetro();
		
		System.out.println(ratang.getArea());
		System.out.println(ratang.getPerimetro());
		
		
	}

	}

}
