public class Ques8 {
    public static void main(String[] args) {
        try {
//            Card myCard = new Card("123AVAW1230"); // throws exception
            Card myCard2 = new Card("123AVAW123");
//            myCard2.setBalance(-12.0);  // throws exception
            myCard2.setBalance(1500);

            ATM atm = new ATM();
            System.out.println(atm.withdraw(myCard2, 500));
            System.out.println(atm.withdraw(myCard2, 5500)); // has a checked exception which is caught by
            // Throwable, but it's always better to code a specific catch block for custom checked exceptions.

        }
        catch (InsufficientAccountBalance iab){
            iab.printStackTrace();
            System.out.println("End user is trying to overdraw");
        }
        catch (Throwable t){
            t.printStackTrace();
        }
    }
}

class ATM{
    public String withdraw(Card card, double amount) throws InsufficientAccountBalance {
        if(card == null){
            throw new IllegalArgumentException("card is null");
        }
        if(amount < 0){
            throw new IllegalArgumentException("Negative amount given");
        }
        if(amount > card.getBalance()){
            throw new InsufficientAccountBalance("The user is poor "+card.getBalance());
        }
        card.setBalance(card.getBalance() - amount);
        return "User withdrew - "+amount+" || Current Balance - "+card.getBalance();
    }
}


class Card {
    private String accountNum;
    private double balance = 0;

    public Card(String accountNum) {
        if(accountNum.length() > 10){
            throw new IllegalArgumentException("Account Number length is more than 10 characters");
        }
        this.accountNum = accountNum;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0){
            throw new IllegalArgumentException("Negative Balance is not allowed");
        }
        this.balance = balance;
    }
}


class InsufficientAccountBalance extends Exception{
    public InsufficientAccountBalance() {
    }

    public InsufficientAccountBalance(String message) {
        super(message);
    }
}