package Type;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um valor em metros para a conversão: ");
		float valor = sc.nextFloat();
		
		float decm, centm,mm;
		
		decm = valor*10;
		centm = valor*100;
		mm = valor*1000;
		System.out.println("valor em Decimetros: " + decm);
		System.out.println("valor em centimetros: " + centm);
		System.out.println("valor em Milimetros: " + mm);
		
		sc.close();
	}

}
