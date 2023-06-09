public class BankAccount {
    // TODO 1.a Fieldek
    //Készíts egy BankAccount osztályt, az alábbi privát fieldekkel:
    // accountNumber (String), accountHolder (String) és balance (double)!

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public BankAccount(String accountHolder) {
        this.accountNumber = accountHolder;
    }
    public void setAccountNumber( String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setBalace(double balance){
        this.balance=balance;
    }
    public double getBalance() {
        return balance;
    }
}
