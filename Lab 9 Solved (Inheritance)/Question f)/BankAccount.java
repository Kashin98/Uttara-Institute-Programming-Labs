public class BankAccount extends Account{
    // pre-initialized but could make a constructor to add limits of account during object instantiation
    private double maxBalance = 100000;
    private double minBalance = 0;

//    public BankAccount(double maxBalance, double minBalance) {
//        if(maxBalance < 0 || minBalance >= maxBalance ){
//            System.out.println("Invalid Amounts");
//        }else{
//            this.maxBalance = maxBalance;
//            this.minBalance = minBalance;
//        }
//    }


    // override the parent methods so when polymorphic code is used the overridden method will run.
    @Override
    public void deposit(double balance) {
        if(balance < 0 || super.checkBalance() + balance > 100000){
            System.out.println("Invalid amount or Max Balance Exceeded");
        }else {
            System.out.println("Successfully deposited "+balance);
            super.setBalance(super.checkBalance() + balance);
        }
    }

    @Override
    public boolean withdraw(double balance) {
        if(balance < 0 || balance > super.checkBalance()){
            System.out.println("Invalid amount or Insufficient Balance");
            return false;
        }else {
            System.out.println("Successfully withdrew "+balance);
            super.setBalance(super.checkBalance() - balance);
            return true;
        }
    }

}