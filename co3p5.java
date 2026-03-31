import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }
}

interface Sports {
    double sportsMarks = 50;  // constant

    void displaySports();
}

class Result extends Student implements Sports {

    Result(int r, String n, double m) {
        super(r, n, m);
    }

    public void displaySports() {
        System.out.println("Sports Marks: " + sportsMarks);
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + marks);
        displaySports();
        System.out.println("Total: " + (marks + sportsMarks));
    }
}

class co3p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Result[] r = new Result[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();

            r[i] = new Result(roll, name, marks);
        }

        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            r[i].display();
        }

        sc.close();
    }
}
