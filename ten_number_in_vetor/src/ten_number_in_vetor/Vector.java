package ten_number_in_vetor;

import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] vect = new int[10];
		
		for (int i = 0 ; i < vect.length ; i++)
		{
			System.out.printf("Selecione o %d numero: ", i + 1);
			vect[i] = sc.nextInt();
			 
		}
		
		 int sum =0;
		 int count = 0;
		 
		 for (int i = 0;  i < vect.length ; i++) {
			 count++;		
			 sum = sum + vect[i];
			 }
		float avg = sum / count;
		
		System.out.println("A média entre os valores é: "+avg);
		
		sc.close();
	}

}
