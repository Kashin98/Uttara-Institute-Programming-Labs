// This code is not good encapsulation, even if you set methods to package private, you still risk someone
// accessing and setting their own account balance. Using inheritance with bank accounts here reduces encapsulation and
// opens system up to vulnerabilities.

class Account{
    private double balance;

    public double checkBalance() {
        return this.balance;
    }

    // set to package private
    void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double balance) {
        if(balance < 0){
            System.out.println("Invalid amount");
        }else {
            System.out.println("Successfully deposited "+balance);
            this.balance += balance;
        }
    }

    public boolean withdraw(double balance) {
        if(balance < 0 || balance > this.balance){
            System.out.println("Invalid amount or Insufficient Balance");
            return false;
        }else {
            System.out.println("Successfully withdrew "+balance);
            this.balance -= balance;
            return true;
        }
    }
}