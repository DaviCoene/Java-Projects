package bitwise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mask = 0b00100000; //para numero binario coloca 0b e coloca o número binario como o exemplo aí
		int n = 0b0010100000;
		
		System.out.println(mask);
		System.out.println(n);
		System.out.print(mask & n); //aqui faz uma comparação bit a bit com o operador lógico &, exemplo 1010 & 1111, ele vai comparar primeiro 1 com 0, e vai dar falso, 1 com 1, verdadeiro, até no final ficar 1010, porém ele retorna em numero inteiro;
	}

}
