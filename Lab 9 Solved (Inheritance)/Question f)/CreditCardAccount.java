public class CreditCardAccount extends Account{
    private double minBalance = -50000;

    @Override
    public void deposit(double balance) {
        if(balance < 0){
            System.out.println("Invalid amount");
        }else {
            System.out.println("Successfully deposited "+balance);
            super.setBalance(super.checkBalance() + balance);
        }
    }

    @Override
    public boolean withdraw(double balance) {
        if(super.checkBalance() - balance < minBalance){
            System.out.println("Insufficient Balance");
            return false;
        }else {
            System.out.println("Successfully withdrew "+balance);
            super.setBalance(super.checkBalance() - balance);
            return true;
        }
    }

    public double getMinBalance() {
        return minBalance;
    }
}