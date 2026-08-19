import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    int marks1;
    int marks2;
    int marks3;

    void acceptDetails(Scanner sc) {

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        marks2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        marks3 = sc.nextInt();
    }

    int calculateTotal() {

        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {

        return calculateTotal() / 3.0;
    }

    void displayResult() {

        double percentage = calculatePercentage();

        System.out.println("\nRoll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        }
        else if (percentage >= 80) {
            System.out.println("Grade: A");
        }
        else if (percentage >= 70) {
            System.out.println("Grade: B");
        }
        else if (percentage >= 60) {
            System.out.println("Grade: C");
        }
        else if (percentage >= 50) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter details of Student 1");
        s1.acceptDetails(sc);

        System.out.println("\nEnter details of Student 2");
        s2.acceptDetails(sc);

        System.out.println("\n----- STUDENT 1 RESULT -----");
        s1.displayResult();

        System.out.println("\n----- STUDENT 2 RESULT -----");
        s2.displayResult();
    }
}