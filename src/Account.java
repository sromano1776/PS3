import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}

	Account(int newId, double newBalance, double newAnnualInterestRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	Date getDateCreated() {
		return dateCreated;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	double getMonthlyInterest() {
		return annualInterestRate / 12;
	}

	double withdraw(double amount) {
		return balance -= amount;
	}

	double deposit(double amount) {
		return balance += amount;
	}
}
