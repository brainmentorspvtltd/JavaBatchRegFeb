/*
 * 1. Code Reuse
 * 2. Polymorphism
 * Overriding - Must be IS-A
 * When ever we inherit then we have a chance to override the parent
 * method and build the improve method in child
 * override method - updated method, so parent older method is hide
 */
class Account
{
	int accountNo;
	double balance;
	String name;
	void withDraw(){
	System.out.println("Account Class WithDraw Call");	
	}
	/*
	 * this is comment
	 */
	/**
	 * this is docs
	 * @see SavingAccount.roi()
	 */
	@Deprecated
	void roi(){
		System.out.println("Account class ROI 4%");
	}
}
class SavingAccount extends Account
{
	void limit(){
		System.out.println("With Draw has Limit SavingAccount...");
		
	}
	// signature of overridden method in child is same as parent method
	// this is annotation (Meta data of class)
	@Override
	void roi(){
		//super.roi();
		// super is predefine keyword in java
		// and it hold the parent reference
		// this is predefine keyword and it hold the current reference
		System.out.println("Saving Account ROI 6.5%");
		//this.schemes();
	}
	void schemes(){
		System.out.println("Saving Account Schemes");
	}
}
class CurrentAccount extends Account{
	void noLimit(){
		System.out.println("There is No Limit in Current Account");
	}
	void roi(){
		System.out.println("Current Account ROI Need to Pay 7.5%");
	}
	
	void odLimit(){
		System.out.println("U Have OD Limit....");
	}
	
}

// this class is used to call SavingAccount or Account or CurrentAccount
class AccountCaller
{
	void callMe(Account account){
		//SavingAccount sa  = new SavingAccount();
		account.withDraw();
		//sa.limit();
		account.roi();
		// Downcasting
		if(account instanceof SavingAccount){
			SavingAccount sa = (SavingAccount) account;  // this is downcasting
			sa.limit();
			sa.schemes();
		}
		else
		if(account instanceof CurrentAccount){	
			//CurrentAccount ca = (CurrentAccount) account; // this is downcasting
			((CurrentAccount)account).odLimit();
			((CurrentAccount)account).noLimit();
			//ca.noLimit();
		}
		
		
		//account.limit();
		System.out.println("***********************");
	}
}

public class ISADemo {

	public static void main(String[] args) {
		
		AccountCaller ac = new AccountCaller();
		ac.callMe(new SavingAccount());
		
		ac.callMe(new CurrentAccount());
		// Account sa = new SavingAccount();
		// TODO Auto-generated method stub
		//int e = 90.20;
		// DRY - Don't Repeat YourSelf
		//Account sa = new SavingAccount(); //Upcasting
		/*
		 * new SavingAccount() will create SavingAccount object 
		 * and sa is reference variable which is pointing to the
		 * newly created object.
		 * But Type of sa is Account , so it can hold only Account
		 * things it can't hold savingAccount things
		 */
		//SavingAccount sa  = new SavingAccount();
//		sa.withDraw();
//		sa.limit();
//		sa.roi();
//		//sa.ro
//		System.out.println("*************************");
//		CurrentAccount ca = new CurrentAccount();
//		ca.withDraw();
//		ca.noLimit();
//		ca.roi();
//		ca.odLimit();
		
		

	}

}
