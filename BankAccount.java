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
    // Paraméteres konstruktor
    public BankAccount( String accountNumber, String accountHolder, double balance){
        this.accountNumber=accountNumber;
        this.accountHolder= accountHolder;
        this.balance=balance;
    }
    // Default (alapértelmezett konstruktor)
    public BankAccount(){
        this("111-222-333","Overlord",998877);
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
