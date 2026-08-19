import java.util.Scanner;

class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

 
    BankAccount() {
        accountNumber = 0;
        accountHolderName = "Unknown";
        balance = 0;
    }


    BankAccount(int number, String name, double amount) {
        accountNumber = number;
        accountHolderName = name;
        balance = amount;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance = balance - amount;
        else
            System.out.println("Insufficient Balance");
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount(101, "Rahul", 25000);

        System.out.println("--- Account 1 ---");
        a1.displayAccount();

        System.out.println("\n--- Account 2 ---");
        a2.displayAccount();

        System.out.print("\nEnter deposit: ");
        double d = sc.nextDouble();
        a2.deposit(d);

        System.out.print("Enter withdrawal: ");
        double w = sc.nextDouble();
        a2.withdraw(w);

        System.out.println("\n--- Updated Account 2 ---");
        a2.displayAccount();
    }
}