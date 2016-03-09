import java.util.Date;

public class Assign extends Account{

	public static void main(String[] args){
		Account account1 = new Account (1122,20000,.045);
		account1.withdraw(2500);
		account1.deposit(3000);
		System.out.println("Date Created" + account1.getDateCreated());
		System.out.println("Account ID:" +account1.getId());
		System.out.println("Balance:" + account1.getBalance());
		System.out.println("Interest Rate:" + account1.getAnnualInterestRate());
		System.out.println("Balance after withdraw of 2500:" + account1.getAnnualInterestRate());
		System.out.println("Balance after deposit of 3000:" + account1.getAnnualInterestRate());
		System.out.println("Monthly Interest:" + account1.getId());
		
		System.out.println("End of Process");
	}
	
}
