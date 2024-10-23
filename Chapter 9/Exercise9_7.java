
public class Exercise9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Account object with ID of 1122 and balance of 20000
			Account account = new Account(1122, 20000);
	
			//set the annual interest rate at 4.5%
			account.setAnnualInterestRate(4.5);
			
			//withdraw 2,500$
			account.withdraw(2500);
			
			//deposit 3,000$
			account.deposit(3000);
			
			//displays balance, monthly interest, and date of account creation
			
			System.out.println("Account Statement: ");
			System.out.println(" ");
			System.out.println("Account ID: " + account.getId());
			System.out.println("Date Created: " + account.getDateCreated());
			System.out.printf("Balance: $%.2f\n", account.getBalance());
			System.out.printf("Monthly Interest: , $%.2f\n",
							account.getMonthlyInterest());
			
	}

}
