import java.util.Scanner;

class Employee {
    int empId;
    String name, address;
    double salary;

    Employee(int id, String n, String addr, double sal) {
        empId = id;
        name = n;
        address = addr;
        salary = sal;
    }
}

class Teacher extends Employee {
    String department, subject;

    Teacher(int id, String n, String addr, double sal,
            String dept, String sub) {
        super(id, n, addr, sal);
        department = dept;
        subject = sub;
    }

    void display() {
        System.out.println(empId + " " + name + " " + address + " "
                + salary + " " + department + " " + subject);
    }
}

public class co3p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details:");

            System.out.print("EmpId: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Address: ");
            String addr = sc.nextLine();

            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject: ");
            String sub = sc.nextLine();

            t[i] = new Teacher(id, name, addr, sal, dept, sub);
        }

        System.out.println("\n--- Teacher Details ---");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}
