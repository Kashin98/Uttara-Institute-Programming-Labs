public class Person{
    private String name;
    private Account account;

    public Person(String name, Account account) {
        if(name == null || name.trim().equals("") || account == null){
            System.out.println("Invalid Person Details");
        }else {
            this.name = name;
            this.account = account;
        }
    }


    public void buyItem(String name, double price) {
        if (name == null || name.trim().equals("") || price < 0) {
            System.out.println("Invalid Item Details");
            return;
        }

        // Our original overridden withdraw method is enough to make sure that user never overdraws his bank account.

//        if(this.account.withdraw(price)){
//            // the deposit methods are overridden to stop any withdrawals that may break this method, so we don't
//            // need to checkBalance() before performing the withdrawals.
//            System.out.println(name + " was bought at price = "+price);
//        } else{
//            System.out.println(name + " was not purchased");
//        }

        // Approach 2 is to use instanceof operator

        if(this.account instanceof CreditCardAccount){
            CreditCardAccount creditCardAccount = (CreditCardAccount) this.account;
            if((creditCardAccount.checkBalance() - price) < creditCardAccount.getMinBalance()){
                System.out.println("Insufficient Balance");
            }else {
                System.out.println(name + " was bought at price = "+price);
                creditCardAccount.setBalance(creditCardAccount.checkBalance() - price);
            }
        }

        // this will work with Bank Account, no need to check instanceof
        if((this.account.checkBalance() - price) < 0){
            System.out.println("Insufficient Balance");
        }else {
            System.out.println(name + " was bought at price = "+price);
            this.account.setBalance(this.account.checkBalance() - price);
        }


    }

    public void debitMoney(double amount){
        this.account.deposit(amount);
    }

    public double checkAccountBalance(){
        return this.account.checkBalance();
    }
}

class TestPerson{
    public static void main(String[] args) {
        // Bankaccount testing
        System.out.println("------BANK ACCOUNT-----");
        Account account = new BankAccount();
        Person kashin = new Person("Kashin", account);
        kashin.debitMoney(50000);
        kashin.debitMoney(-5000); // fails
        kashin.buyItem("Rolex", 70000); // fails
        kashin.buyItem("Rolex", -70000); // fails
        kashin.buyItem(null , -70000); // fails
        kashin.buyItem("Laptop", 48000); // works, balance should be 2000
        System.out.println("Your account balance is = "+kashin.checkAccountBalance());
        kashin.debitMoney(100000); // fails, limit is 100000, balance is 2000 + 100000 > 100000.
        kashin.debitMoney(98000); // works, limit reached.
        System.out.println("Your account balance is = "+kashin.checkAccountBalance());


        // CreditCardAccount
        System.out.println();
        System.out.println("------CREDIT CARD ACCOUNT------");
        Account account2 = new CreditCardAccount();
        Person karthikeya = new Person("Kashin", account2);
        karthikeya.debitMoney(10000);
        karthikeya.buyItem("Benz Car",200000); // fails
        karthikeya.buyItem("LED TV",60000); // Works
        System.out.println("Your account balance is = "+karthikeya.checkAccountBalance()); // -50000
        karthikeya.buyItem("Monitor", 8000); //fails
        karthikeya.debitMoney(90000);
        System.out.println("Your account balance is = "+karthikeya.checkAccountBalance()); // 40000
    }
}
