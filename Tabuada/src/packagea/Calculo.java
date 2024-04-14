package packagea;

public class Calculo {

	public static void main(String[] args) {
		System.out.println("TABUADA: ");
		for (int i = 0; i <11; i++) {
			for (int j = 0; j < 11; j++) {
				int valor = i * j;
				System.out.printf("%d x %d = %d \n",i , j , valor);
			}
			System.out.println("--------------------------------------");
		}
	}

}
