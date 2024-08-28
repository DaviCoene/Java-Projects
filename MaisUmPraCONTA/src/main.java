import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.Excepption;

public class main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Enter Account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        
        System.out.print("Withdraw limit: ");
        double withdraw = sc.nextDouble();
        
        Account cont = new Account(number, holder, balance, withdraw);
        
        System.out.println();
        
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();
        
        try {
            cont.withdraw(amount);
            System.out.printf("New Balance: %.2f", cont.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Excepption e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
