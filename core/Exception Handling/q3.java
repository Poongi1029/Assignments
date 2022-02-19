class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String str)
    {
        super(str);
    }
}
class IllegalBankTransactionException extends InsufficientBalanceException {

    public IllegalBankTransactionException(String str) {
        super(str);
    }
}
class  savingAccount{
    private final long id ;
    private double balance  ;
    public savingAccount(long id,double balance){
        this.id=id;
        this.balance=balance;
    };
    public  double withdraw(double amount) throws RuntimeException {
        try {
            if(balance<amount){
                throw new InsufficientBalanceException ("insufficient balance in the account");
            }
            balance -= amount ;
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return  balance ;
    }
public  double deposit(double amount) throws RuntimeException {
    try {
        if(amount<=0){
            throw new IllegalBankTransactionException("The amount should always be greater than 0");
        }
        balance -= amount ;
    }
    catch (IllegalBankTransactionException ez) {
        System.out.println(ez.getMessage());
        ez.printStackTrace();
    }
    finally {
        balance = balance ;
    }
    return  balance ;
        }
    public  double getBalance()  {
        return  balance ;
    }
}

public class q3 {
    public static void main(String[] args)  {
        savingAccount Mohsin = new savingAccount(10,9000);
        Mohsin.deposit(-1);
        Mohsin.withdraw(9100);
        System.out.println(Mohsin.getBalance());
    }
}