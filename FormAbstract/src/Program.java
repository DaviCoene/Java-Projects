import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Retagle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		
		
		for (int i= 0; i < n; i++) {
			System.out.println("Shape #"+ (i+1)+"data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char v = sc.next().charAt(0);
			if (v == 'r') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.next());
				System.out.print("WIdth: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				Shape form = new Retagle(color, width, height);
				list.add(form);
			}
			else {
				System.out.print("Color (BLACK/BLUE/RED): ");
				Color color = Color.valueOf(sc.next());
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
				
			}
		}
		for (Shape hap : list) {
			System.out.println(hap.area());
		}
		
	}

}
