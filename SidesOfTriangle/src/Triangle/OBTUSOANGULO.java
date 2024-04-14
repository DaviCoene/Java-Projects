package Triangle;

import java.util.Scanner;

public class OBTUSOANGULO {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   float side1,side2,side3;
	   side1 = sc.nextFloat();
	   side2 = sc.nextFloat();
	   side3 = sc.nextFloat();
	   
	   if (side1 == side2) {
		   if (side2 == side3) {
			   System.out.println("É um triangulo equilátero");
			   
		   }
		   else {
			   System.out.println("Triangulo isóceles");
		   }
	   }
	   if(side1 != side2)
	    {
		   
	   if (side1 == side3) {
		   System.out.println("Triangulo isóceles");
	   }
	   if(side2 == side3) {
		   System.out.println("Triangulo isóceles");}
		   else {
			   
		   }
	   
	    }
	   if(side1 != side2 && side1 != side3 && side2 != side3) {
		   System.out.println("Triangulo Escaleno");
	   }
	   sc.close();
   }
}
