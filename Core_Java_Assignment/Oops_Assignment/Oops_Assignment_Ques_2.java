package oops_assignments;

class BankClass{
	String bankName;
	int cash;
	void bankdetails() {
		System.out.println("This  is "+bankName+" Details");
	}
}
class Saving_account extends BankClass{
	int Fixed_deposit=8000;
	void bankdetails() {
		
		System.out.println("This  is "+bankName+" Details with Total Cash "+(cash+Fixed_deposit));
	}
}
class Current_account extends BankClass{
	int Cash_credit=600;
	void bankdetails() {
		
		System.out.println("This  is "+bankName+" Details with Total Cash "+(cash+Cash_credit));
	}
}

public class BankMain{
	public static void main(String[] args) {
		BankClass sa= new Saving_account();
		sa.bankName="hdfc";
		sa.cash=3900;
		sa.bankdetails();
		
		Bank ca= new Current_account();
		ca.bankName="sbi";
		ca.cash=2000;
		ca.bankdetails();
		
		
		
	}

}
