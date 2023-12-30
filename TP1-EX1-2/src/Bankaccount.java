
public class Bankaccount {
    private int accountnumber;
    private String AccountHolderName;
    private int balance;
    public Bankaccount(int accountnumber ,String AccountHolder, int balance)
    {
        this.accountnumber=accountnumber;
        this.AccountHolderName=AccountHolder;
        this.balance=balance;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }
    public void deposit (int amount) {
        this.balance += amount;
    }
    public void widthraw (int amount){
        this.balance -= amount;
    }


}