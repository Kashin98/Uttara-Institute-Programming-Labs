public class Account{
	public String accNum;
	public String owner;
	private double balance = 0; //balance is set to 0 always

	public void withdraw(double withdrawalAmount){
		if(withdrawalAmount < 1){
			System.out.println("Withdrawal amounts should be more than 0");
			return;
		}
		if(withdrawalAmount > balance){
			System.out.println("Your "+this.balance+" is not sufficient for withdrawal");
		}else{
			System.out.println("You withdrew "+ withdrawalAmount);
			this.balance -= withdrawalAmount;
		}
	}

	public void deposit(double depositAmount){
		if(depositAmount < 1){
			System.out.println("Deposit amounts should be more than 0");
			return;
		} else{
			System.out.println("You deposited "+depositAmount);
			this.balance += depositAmount;
		}
	}

	public double checkBalance() {
		return balance;
    }
}