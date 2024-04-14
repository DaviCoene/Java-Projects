import java.util.Locale;
import java.util.Scanner;

import entitie.Produto;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rended? ");
		int n = sc.nextInt();
		
		Produto[] rooms = new Produto[10];
		
		System.out.println();
		for (int i = 0;i <n ; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d %n", i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine(); 
			System.out.print("Email: ");
			String email = sc.next(); 
			System.out.print("Room: ");
			int room = sc.nextInt();
			rooms[room] = new Produto(name, email, room);
		}
		
		System.out.println("Busy Rooms: ");
		
		for (int i=0;i < rooms.length;i++) {
			if (rooms[i] != null) {
				System.out.printf("%d: %s, %s %n",  rooms[i].getRoom(), rooms[i].getName(), rooms[i].getEmail());
			}
		}
		sc.close();
	}

}
