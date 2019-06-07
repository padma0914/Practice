/* Bank > Barclays > Halifax > Lloyds . Lloyds inherts properties from all parent classes. i. props will available to use but not forced to use
Child class can only have one parent but parent can have mutiple child classes  */


package java_oops_part2;

public class Bank {

	int overdraft= 1000;
	int minBalance=50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Bank b=new Bank();
b.creditCard();
b.fixedDeposit();
b.currentAccount();
b.savingsAccount();

	}
	public void currentAccount(){
		
		System.out.println("min balance for current account must be"+ ":"+ minBalance);
		
		System.out.println("this is Parent -Bank-current account method");
	}

public void savingsAccount(){
		
		System.out.println("this is Parent -Bank-savings account method");
		
		System.out.println("over draft limit for the account onrequest could be max of"+ ":"+ overdraft);
		
	}
	
public void fixedDeposit(){
	
	System.out.println("this is Parent -Bank-fixed deposit account method");
}

public void creditCard(){
		
		System.out.println("this is Parent -Bank-credit card method");
	}

}

	

