import java.util.Scanner;

// Base class
class Publisher {
    String publisherName;

    Publisher(String pname) {
        this.publisherName = pname;
    }
}

// Derived class
class Book extends Publisher {
    String bookName, author;

    Book(String pname, String bname, String auth) {
        super(pname);
        this.bookName = bname;
        this.author = auth;
    }

    void display() {
        System.out.println(bookName + " | " + author + " | " + publisherName);
    }
}

// Subclass 1
class Literature extends Book {

    Literature(String pname, String bname, String auth) {
        super(pname, bname, auth);
    }

    @Override
    void display() {
        System.out.print("Literature Book -> ");
        super.display();
    }
}

// Subclass 2
class Fiction extends Book {

    Fiction(String pname, String bname, String auth) {
        super(pname, bname, auth);
    }

    @Override
    void display() {
        System.out.print("Fiction Book -> ");
        super.display();
    }
}

// Main class
public class co3p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Separate sizes (better practice)
        System.out.print("Enter number of Literature books: ");
        int lCount = sc.nextInt();
        sc.nextLine();

        Literature[] l = new Literature[lCount];

        System.out.println("\nEnter Literature Books:");
        for (int i = 0; i < lCount; i++) {
            System.out.println("Book " + (i + 1));

            System.out.print("Publisher: ");
            String pname = sc.nextLine();

            System.out.print("Book Name: ");
            String bname = sc.nextLine();

            System.out.print("Author: ");
            String auth = sc.nextLine();

            l[i] = new Literature(pname, bname, auth);
        }

        System.out.print("\nEnter number of Fiction books: ");
        int fCount = sc.nextInt();
        sc.nextLine();

        Fiction[] f = new Fiction[fCount];

        System.out.println("\nEnter Fiction Books:");
        for (int i = 0; i < fCount; i++) {
            System.out.println("Book " + (i + 1));

            System.out.print("Publisher: ");
            String pname = sc.nextLine();

            System.out.print("Book Name: ");
            String bname = sc.nextLine();

            System.out.print("Author: ");
            String auth = sc.nextLine();

            f[i] = new Fiction(pname, bname, auth);
        }

        // Display
        System.out.println("\n--- Literature Details ---");
        for (Literature book : l) {
            book.display();
        }

        System.out.println("\n--- Fiction Details ---");
        for (Fiction book : f) {
            book.display();
        }

        sc.close();
    }
}
