package java_oops_part2;

public class Barclays extends Bank {
	
	public static void main(String[] args) {
		
		Bank bc=new Bank();
		bc.creditCard();
		bc.currentAccount();
		bc.fixedDeposit();
		bc.savingsAccount();
		System.out.println(bc.minBalance);
		System.out.println(bc.overdraft);
		
		// TODO Auto-generated method stub
	}

public void balanceTransfer(){
	
	System.out.println("balance Transfer method is Barclays specific ");
}

}
