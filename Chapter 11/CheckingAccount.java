
public class CheckingAccount extends Account {

	//data field
	private double overdraftLimit;

	//construct default CheckingAccount object
	public CheckingAccount() {
		super();
		overdraftLimit = -20;
	}

	//construct checking account with ID, balance, and overdraft limit
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
		
		}
	
	//return overdraft limit
	public double getOverdraftLimit() {
		return overdraftLimit;
		
	}
	
	//decrease balance by amount
	
	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error! Amount Exceeds overdraft limit!");

	}
	
	//return String description of the CheckingAcocunt class
	public String toString() {
		return super.toString() + "\n  Overdraft limit: $" +
			String.format("%.2f", overdraftLimit);
		}
	
}
