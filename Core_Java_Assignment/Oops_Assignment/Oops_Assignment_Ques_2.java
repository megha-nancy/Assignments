public class Bank {

	public static void main(String[] args) {
   SavingAccount savingaccount = new SavingAccount(20000,1000);
   CurrentAccount currentaccount = new CurrentAccount(20000,3000);
   savingaccount.totalAmount();
   currentaccount.totalAmount();
   double totalbankbalance= savingaccount.totalAmount()+currentaccount.totalAmt();
   System.out.println("total cash in the bank:"+totalbankbalance);
   }

}

public class SavingAccount extends Bank{
	    private double fixed_Deposit;
	    private double balance;
	    

	    public SavingAccount(double fixed_Deposit, double balance)
	    {
	    	this.fixed_Deposit=fixed_Deposit;
	    	this.balance=balance;
	    }
	    public double totalAmount() {
	    	double Savingbalance= fixed_Deposit+balance;
	    	return Savingbalance;
	   }
}
public class CurrentAccount extends Bank {
	private double cash_credit;
	private double balance;
	
 public CurrentAccount(double cash_credit, double balance)
 {
	 this.balance=balance;
	 this.cash_credit=cash_credit;
	 
 }
 public double totalAmount() {

     double currentbalance= cash_credit+balance;
     return currentbalance;
      }
	}
