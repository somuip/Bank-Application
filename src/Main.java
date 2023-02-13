import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        // creating account
        SBIAccount somuAcc = new SBIAccount(name, password, balance);

        // showing account num
        System.out.println("Your account has been created by account number:"+somuAcc.getAccountNo());

        // getting balance
        System.out.println("Your account balance is:"+somuAcc.getBalance());

        // money deposite
        somuAcc.moneyDeposit(1000);
        System.out.println("Your account balance is:"+somuAcc.getBalance());

        // money withdraw
        System.out.println("Enter the amount has to be withdrawn");
        int amount = sc.nextInt();
        System.out.println("Enter your password");
        String yourpassword = sc.next();
        somuAcc.moneyWithdrawel(amount, yourpassword);
        System.out.println("Money withdrawn successfully");

        // calculating interest
        System.out.println("Total amount after 4 years:"+somuAcc.calculateInterest(4));

    }
}