package Day_5;

public class Emp_Details {

    public static void main(String[] args) {

        Employee e1 = new PermanentEmployee(101, "Karthi", 25000);
        Employee e2 = new ContractEmployee(102, "Ranjani", 20000);

        System.out.println("Permanent Employee");
        System.out.println("ID: " + e1.employeeId);
        System.out.println("Name: " + e1.name);
        System.out.println("Salary: Rs. " + e1.calculateSalary());

        System.out.println();

        System.out.println("Contract Employee");
        System.out.println("ID: " + e2.employeeId);
        System.out.println("Name: " + e2.name);
        System.out.println("Salary: Rs. " + e2.calculateSalary());
    }
}

class Employee {
    int employeeId;
    String name;
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }
}

class PermanentEmployee extends Employee {

    PermanentEmployee(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
    }

    
    public double calculateSalary() {
        return basicSalary + (basicSalary * 20 / 100);
    }
}

class ContractEmployee extends Employee {

    ContractEmployee(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
    }

  
   public double calculateSalary() {
        return basicSalary + 2000;
    }
}

