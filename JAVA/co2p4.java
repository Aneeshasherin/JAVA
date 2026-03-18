import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    // Constructor
    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee No: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

public class co2p4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Array of Employee objects
        Employee[] employees = new Employee[n];

        // Reading employee information
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("Enter Employee No: ");
            int eNo = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter Employee Name: ");
            String eName = sc.nextLine();
            System.out.print("Enter Employee Salary: ");
            double eSalary = sc.nextDouble();
            sc.nextLine(); // consume newline

            employees[i] = new Employee(eNo, eName, eSalary);
        }

        // Search for employee by eNo
        System.out.print("\nEnter Employee No to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (employees[i].eNo == searchNo) {
                System.out.println("\nEmployee Found:");
                employees[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with Employee No " + searchNo + " not found.");
        }

        sc.close();
    }
}
