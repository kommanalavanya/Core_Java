package ai.jobiak.services;

public class Account implements AccountService {
	private String acctNo;
	private String fullName;
	private double balance;
	public Account() {
		
	}
	public Account(String acctNo, String fullName, double balance) {
		super();
		this.acctNo = acctNo;
		this.fullName = fullName;
		this.balance = balance;
	}




	public String getAcctNo() {
		return acctNo;
	}




	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}




	public String getFullName() {
		return fullName;
	}




	public void setFullName(String fullName) {
		this.fullName = fullName;
	}




	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}




	@Override
	public double withdraw(double amount) throws WithdrawException {
		if(this.balance-amount<0) {
			throw new WithdrawException("Insufficient funds to carryout the transaction "+this.getAcctNo());
		}
		else {
			this.balance=amount;
		}
		return this.balance;
	}
   
	@Override
	public double deposit(double amount) throws DepositException {
		if(amount<0) {
			throw new DepositException("You cannot deposit negative amount"+this.acctNo);
		}
		else {
		 this.balance+=amount;
			return this.balance;
		}
		
	}

	
	 public boolean transfer(Account account,double amount)throws TransferException {
		if(this.getBalance()>=amount) {
			this.balance=amount;
			account.setBalance(account.getBalance()+amount);
		}
		else {
			throw new TransferException("Insufficient funds in" +this.getAcctNo());
		}
		return true;
		 
	 }

}
