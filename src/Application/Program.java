package Application;
import java.util.*;
import entities.Account;
import java.util.Locale;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account  account;
        System.out.println("enter account number: ");
		int number = sc.nextInt();
		System.out.println("enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		sc.nextLine();
		System.out.println("Is there an initial deposit (y/N)? ");
		char response = sc.next().charAt(0);
		if (response == 'Y' ) {
			double initialDeposit =sc.nextDouble();
			System.out.println("enter initial deposit value: ");
			account = new Account(number,holder,initialDeposit);
			sc.close();
		}else {
			account = new Account(number, holder);
			
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println();
		
		System.out.print("enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("upadate account data: ");
		System.out.println(account);
		
        System.out.println();
		
        System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		sc.close();
	}

}
