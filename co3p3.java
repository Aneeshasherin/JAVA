import java.util.Scanner;

class Person {
    String name, gender, address;
    int age;

    Person(String n, String g, String addr, int a) {
        name = n;
        gender = g;
        address = addr;
        age = a;
    }
}

class Employee extends Person {
    int empId;
    String company, qualification;
    double salary;

    Employee(String n, String g, String addr, int a,
             int id, String comp, String qual, double sal) {
        super(n, g, addr, a);
        empId = id;
        company = comp;
        qualification = qual;
        salary = sal;
    }
}

class Teacher extends Employee {
    int teacherId;
    String subject, department;

    Teacher(String n, String g, String addr, int a,
            int id, String comp, String qual, double sal,
            int tid, String sub, String dept) {

        super(n, g, addr, a, id, comp, qual, sal);
        teacherId = tid;
        subject = sub;
        department = dept;
    }

    void display() {
        System.out.println(name + " " + gender + " " + age + " "
                + address + " " + empId + " " + company + " "
                + qualification + " " + salary + " "
                + teacherId + " " + subject + " " + department);
    }
}

public class co3p3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String addr = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("EmpId: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Company: ");
            String comp = sc.nextLine();

            System.out.print("Qualification: ");
            String qual = sc.nextLine();

            System.out.print("Salary: ");
            double sal = sc.nextDouble();

            System.out.print("TeacherId: ");
            int tid = sc.nextInt();
            sc.nextLine();

            System.out.print("Subject: ");
            String sub = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            t[i] = new Teacher(name, gender, addr, age,
                    id, comp, qual, sal, tid, sub, dept);
        }

        System.out.println("\n--- Details ---");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}
