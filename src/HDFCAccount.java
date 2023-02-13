import java.util.UUID;

public class HDFCAccount implements BankInterface{

    private String name;
    private String accountNo;
    private String password;
    private int balance;
    private double rateOfInterest;

    public HDFCAccount(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfInterest = 7.1;

        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String moneyDeposit(int amount) {
        balance += amount;
        return "Amount has been successfully deposited";
    }

    @Override
    public String moneyWithdrawel(int amount, String enteredPassword) {
        if(enteredPassword.equals(password)){
            if(amount < balance){
                balance -= amount;
                return "Money is withdrawn successflly";
            }

        }
        return "You entered the wrong password";
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*time*rateOfInterest)/100.0;
    }

}
