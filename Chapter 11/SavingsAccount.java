
public class SavingsAccount extends Account {

	//construct a default CheckingAcocunt object
	public SavingsAccount() {
		super();
		
	}

	//construct a SavingsAcocunt with specified id, balance
	public SavingsAccount(int id, double balance) {
		super(id, balance);
		
	}

	// decrease balance by amount
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
			
		}
		else 
			System.out.println("Refused! Transaction exceeds available balance!");
	}


}
