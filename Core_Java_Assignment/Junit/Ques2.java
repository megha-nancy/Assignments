package JUnit5;

import junit.framework.Test;

public class BankAccount {
	
	double accountBalance;
	

	
	public BankAccount(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	void withDraw(double withDrawAmt) throws InsufficientFundsException {
		
		if(withDrawAmt>accountBalance)
			throw new InsufficientFundsException("InsufficientFundsException");
		
		accountBalance=accountBalance-withDrawAmt;
		
		System.out.println("Amount WithDrawn: "+withDrawAmt);
		System.out.println("Available Balance: "+accountBalance);
	}
	
	public static void main(String[] args) {
		
		BankAccount acc1=new BankAccount(20000.00);

		try {
			acc1.withDraw(10000.00);
		} catch (InsufficientFundsException e) {
		
			e.printStackTrace();
		}
		
	}

}
 class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException(String msg) {
		super(msg);
	}

}

Test class:
--------------
    package JUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		BankAccount acc1=new BankAccount(20000.00);
		
		assertThrows(InsufficientFundsException.class, ()->acc1.withDraw(21000.0));

	}

}
