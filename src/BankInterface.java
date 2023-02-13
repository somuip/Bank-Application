public interface BankInterface {
    int getBalance();
    String moneyDeposit(int amount);
    String moneyWithdrawel(int amount, String enteredPassword);
    double  calculateInterest(int time);

}
