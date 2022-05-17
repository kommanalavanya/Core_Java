package ai.jobiak.services;

public interface AccountService {
	public double withdraw(double amount)throws WithdrawException;
    public double deposit(double amount)throws DepositException;
    public boolean transfer(Account account,double amount)throws TransferException; 
  

}
