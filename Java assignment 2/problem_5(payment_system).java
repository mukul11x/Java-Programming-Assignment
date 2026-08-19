import java.util.Scanner;

interface Payment {

    void makePayment(double amount);

    void paymentDetails();
}


class CreditCardPayment implements Payment {

    String cardNo;

    CreditCardPayment(String cardNo) {
        this.cardNo = cardNo;
    }

    public void makePayment(double amount) {
        System.out.println("Payment Successful!");
        System.out.println("Mode: Credit Card");
        System.out.println("Amount: " + amount);
    }

    public void paymentDetails() {
        System.out.println("Card Number: " + cardNo);
    }
}


class UPIPayment implements Payment {

    String upi;

    UPIPayment(String upi) {
        this.upi = upi;
    }

    public void makePayment(double amount) {
        System.out.println("Payment Successful!");
        System.out.println("Mode: UPI");
        System.out.println("Amount: " + amount);
    }

    public void paymentDetails() {
        System.out.println("UPI ID: " + upi);
    }
}


class CashPayment implements Payment {

    String name;

    CashPayment(String name) {
        this.name = name;
    }

    public void makePayment(double amount) {
        System.out.println("Payment Successful!");
        System.out.println("Mode: Cash");
        System.out.println("Amount: " + amount);
    }

    public void paymentDetails() {
        System.out.println("Name: " + name);
    }
}


public class PaymentSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Payment p;

        if (choice == 1) {

            System.out.print("Enter Card Number: ");
            String card = sc.next();

            p = new CreditCardPayment(card);
        }

        else if (choice == 2) {

            System.out.print("Enter UPI ID: ");
            String upi = sc.next();

            p = new UPIPayment(upi);
        }

        else {

            System.out.print("Enter Name: ");
            String name = sc.next();

            p = new CashPayment(name);
        }

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        p.paymentDetails();
        p.makePayment(amount);
    }
}