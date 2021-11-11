public class TestAccount{
	public static void main(String[] args){
		Account acc = new Account();
		acc.accNum = "1231AAS9889";
		acc.owner = "Kashin";

		acc.withdraw(1000); // should fail as balance in new account is zero.
		acc.deposit(5000); // money is deposit and balance is set.
		acc.withdraw(3000); // works, balance is reduced
		acc.withdraw(3000); // fails, balance is too low for withdrawing
        System.out.println(acc.checkBalance()); // returns balance
	}
}