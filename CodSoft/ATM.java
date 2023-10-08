import java.util.Scanner;
public class ATM{

public static void main(String[] args) {
    System.out.println("Welcome to my Atm");
    Account NewUser = new Account(5000.0);
    Opertaion ATM_1 = new Opertaion(NewUser);
    ATM_1.operate();
}

}
class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount is : " + amount);
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount : " + amount);
            return true;
        } else {
            System.out.println("Insufficient Balance");
            return false;
        }
    }
}

class Opertaion {
    private Account account;

    public Opertaion(Account account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println();        
        System.out.println();
        System.out.println("1. Withdraw: ");
        System.out.println("2. Deposit: ");
        System.out.println("3. Check Current Balance : ");
        System.out.println("4. Exit");
        System.out.println();
    }

    public void operate() {
        Scanner sc = new Scanner(System.in);
        double withdrawalAmount;
        double depositAmount;
        double balance;
        int choice; 
        do {
            displayMenu();
            System.out.print("Please Enter Your Choice: ");
             choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to be withdrawn: ");
                    withdrawalAmount = sc.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to be deposited: ");
                    depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    
                    balance = account.getBalance();
                    System.out.println("Your current balance is : " + balance);
                    break;
                case 4:
                    System.out.println("Thankyou!...Visit Again");
                    sc.close();
                    return;
                default:
                    System.out.println("Ops!.Please enter a valid choice");
            }
        }while (choice!=0);
    }
}