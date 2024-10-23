import java.util.Date;

public class Account {

	//data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//constructors
	
	//default account
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	//account with id and initial balance
		Account(int newId, double newBalance) {
			id = newId;
			balance = newBalance;
			dateCreated = new Date();
			
			}
		
		//mutator methods
		
		//set id
		public void setId(int newId) {
			id = newId;
		}
		//set balance
		public void setBalance(double newBalance) {
			balance = newBalance;
			
		}
		//set annual interest rate
		public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
		
		}
		//Accessor methods
		
		//return id
		public int getId() {
			return id;
			
		}
		//return balance
		public double getBalance() {
			return balance;
			
		}
		// return annual interest rate
		public double getAnnualInterestRate( ) {
			return annualInterestRate;
			
		}
		//return dateCreated
		public String getDateCreated() {
			return dateCreated.toString();
			
		}
		//return monthly interest rate
		public double getMonthlyInterestRate() {
			return annualInterestRate / 12;
		}
		
		//methods
		
		//return monthly interest
		public double getMonthlyInterest() {
			return balance * (getMonthlyInterestRate() / 100);
		}
		//decrease balance by amount
		public void withdraw(double amount) {
			balance -= amount;
			
		}
		//increase balance by amount
		public void deposit(double amount) {
			balance += amount;
		}

}


