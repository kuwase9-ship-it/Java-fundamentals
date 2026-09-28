
public class Bankaccount {
    
    private final String accountNumber; 
    private String accountHolderName;
    private double balance;

   
    public Bankaccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        if (initialBalance < 0) {
            this.balance = 0.0;
            System.out.println(" Warning: Initial balance cannot be negative. Balance set to 0.0");
        } else {
            this.balance = initialBalance;
        }
    }

    
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println(" Invalid deposit amount.");
        }
    }

    
    

   
    public double calculateLoan() {
        double loanAmount;
        if (balance < 10000) {
            loanAmount = balance * 0.10;
        } else if (balance >= 11000 && balance <= 60000) {
            loanAmount = balance * 0.25;
        } else {
            loanAmount = balance * 0.30;
        }
        return loanAmount;
    }

    
    public void displayAccountDetails() {
        System.out.println("====================================");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
        System.out.println("Eligible Loan: " + calculateLoan());
        System.out.println("====================================");
    }

    
    public static void main(String[] args) {
        Bankaccount acc1 = new Bankaccount("001", "Alice", 5000);
        Bankaccount acc2 = new Bankaccount("002", "Bob", 25000);
        Bankaccount acc3 = new Bankaccount("003", "Charlie", 75000);

        acc1.deposit(2000);
        acc1.displayAccountDetails();

        acc2.deposit(5000);
        acc2.displayAccountDetails();

        acc3.deposit(10000);
        acc3.displayAccountDetails();
    }
}
