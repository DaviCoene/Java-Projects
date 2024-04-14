package bitwise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mask = 0b00100000; //para numero binario coloca 0b e coloca o n�mero binario como o exemplo a�
		int n = 0b0010100000;
		
		System.out.println(mask);
		System.out.println(n);
		System.out.print(mask & n); //aqui faz uma compara��o bit a bit com o operador l�gico &, exemplo 1010 & 1111, ele vai comparar primeiro 1 com 0, e vai dar falso, 1 com 1, verdadeiro, at� no final ficar 1010, por�m ele retorna em numero inteiro;
	}

}
