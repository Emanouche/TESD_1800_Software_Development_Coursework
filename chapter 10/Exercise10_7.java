import java.util.Scanner;
public class Exercise10_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//create 10 accounts in an array
		Account[] accounts = new Account[10];
		
		initialBalance(accounts);
		
		//once the system starts, it won't stop
		//prompt ID
		do {
			System.out.print("Enter an ID: ");
				int id = input.nextInt();
				
				if (isValidID(id, accounts)) {
					int choice;
					
					//get user choice
					do { 
						choice = displayMainMenu(input);
						if (isTransaction(choice)) {
								executeTransaction(choice, accounts, id, input);
						}
					// 4 will exit main menu	
					} while (choice!= 4); 
				}
		
		//prompt for ID again after exit
	}	while (true); 

}
//initialize account with balance of 100

	public static void initialBalance(Account[] a) {
		int initialBalance = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = new Account(i, initialBalance);
			
		}
		
	}
	//true if choice is a transaction
	public static boolean isTransaction(int choice) {
		return choice > 0 && choice < 4;
	}
	
	//return true if valid ID
	public static boolean isValidID(int id, Account[] a) {
		for (int i = 0; i < a.length; i++) {
			if (id == a[i].getId())
				return true;
		}
		return false;
	
	}
	
	//display main menu
	public static int displayMainMenu(Scanner input) {
		System.out.print(
			"\nMain menu\n1: check balance\n2: withdraw" +
			"\n3: deposit\n4: exit\nEnter a choice: ");
				return input.nextInt();
	}
	public static void executeTransaction(int choice, Account[] accounts, int id, Scanner input) {
	    switch (choice) {
	        case 1:
	            // Viewing the current balance
	            System.out.println("The balance is " + accounts[id].getBalance());
	            System.out.println("Press Enter to continue...");
	            input.nextLine();  
	            input.nextLine(); 
	            break;
	        case 2:
	            // Withdraw money
	            System.out.print("Enter an amount to withdraw: ");
	            accounts[id].withdraw(input.nextDouble());
	            input.nextLine(); 
	            break;
	        case 3:
	            // Deposit money
	            System.out.print("Enter an amount to deposit: ");
	            accounts[id].deposit(input.nextDouble());
	            input.nextLine();  
	            break;
	    

			}
		}
	}
	
	