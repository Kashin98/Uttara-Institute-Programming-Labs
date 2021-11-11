import java.math.BigDecimal;

public class Ques9 {
    public static void main(String[] args) {
        try {
            Account account = new Account("Kashin");
            System.out.println(account.checkBalance());
//            account.credit(new BigDecimal(-5900)); // exception, negative value submitted.
            System.out.println(account.credit(new BigDecimal(5900)));
//            account.debit(new BigDecimal(-6000));
//            account.debit(new BigDecimal(6000));
            System.out.println(account.debit(new BigDecimal(4500)));
        }
        catch (InsufficientAccountBalance iab){
            iab.printStackTrace();
            System.out.println("End User is trying overdraw amount");
        }
        catch (Throwable t){
            t.printStackTrace();
            System.out.println("An error has occurred :(");
        }
    }
}


class Account{
    private BigDecimal balance = new BigDecimal(0);
    private String owner;

    public Account(String name) {
        if(name == null || name.trim().equals("")){
            throw new IllegalArgumentException("Invalid name provided");
        }
        this.owner = name;
    }

    public String debit(BigDecimal amt) throws InsufficientAccountBalance{
        if(amt.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("negative value submitted");
        }
        if(amt.compareTo(balance) > 0){
            throw new InsufficientAccountBalance("User is poor - "+balance);
        }
        balance = balance.subtract(amt);
        return "User has withdrawn - "+amt+" || Current balance - "+balance;
    }

    public String credit(BigDecimal amt) {
        if(amt.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("negative value submitted");
        }
        balance = balance.add(amt);
        return "User has deposited - "+amt+" || Current balance - "+balance;
    }

    public BigDecimal checkBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}

class InsufficientAccountBalance extends Exception{
    public InsufficientAccountBalance() {
    }

    public InsufficientAccountBalance(String message) {
        super(message);
    }
}