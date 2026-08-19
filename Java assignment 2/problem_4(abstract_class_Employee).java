abstract class Employee {

    int id;
    String name;
    double basic;

    Employee(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
    }
}


class PermanentEmployee extends Employee {

    PermanentEmployee(int id, String name, double basic) {
        super(id, name, basic);
    }

    double calculateSalary() {

        double hra = basic * 0.20;
        double da = basic * 0.40;
        double pf = basic * 0.12;

        return basic + hra + da - pf;
    }
}


class ContractEmployee extends Employee {

    ContractEmployee(int id, String name, double basic) {
        super(id, name, basic);
    }

    double calculateSalary() {

        return basic + basic * 0.10;
    }
}


public class EmployeeSalarySystem {

    public static void main(String[] args) {

        Employee e1 =
            new PermanentEmployee(101, "Rahul", 30000);

        Employee e2 =
            new ContractEmployee(102, "Aman", 25000);

        e1.display();
        System.out.println("Salary: " + e1.calculateSalary());

        System.out.println();

        e2.display();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}