package ai.jobiak.services;

public class BankOfAndhra {

	public static void main(String[] args) throws TransferException {
		// TODO Auto-generated method stub
      Account  account=new Account("1O1S","John Doe",5000);
      Account  account2=new Account("1O2D","Jone Doe",75000);
      Account account3=new Account("103P","Jason doe",25000);
      AccountService service=account;
      double result;
      try {
       result=service.deposit(-1);
      }catch(DepositException e) {
    	 // System.out.println("In Deposit Exception");
    	  System.err.println(e);
      }
   
      service=account2;
      try {
    	  result=service.withdraw(75500);  
      }catch(WithdrawException e) {
    	  System.err.println(e);
      }
     System.out.println(account2.getBalance());
      
      service=account3;
      System.out.println("Account state before transfer");
      System.out.println(account2.getFullName()+" $"+account2.getBalance());
      System.out.println(account3.getFullName()+" $"+account3.getBalance());
      boolean success;
      try {
    	  success=service.transfer(account2, 25500);
    	  System.out.println(success);
      }catch(TransferException e) {
    	  System.err.println(e);
      }
    
      System.out.println("Account State after transfer");
      System.out.println(account2.getFullName()+"$"+account2.getBalance());
      System.out.println(account3.getFullName()+"$"+account3.getBalance());
      
	}
}
