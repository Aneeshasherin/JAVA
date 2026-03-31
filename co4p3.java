import java.util.Scanner;

class InvalidLoginException extends Exception {
    InvalidLoginException(String msg) {
        super(msg);
    }
}

public class co4p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = "admin", pass = "1234";

        System.out.print("Enter username: ");
        String u = sc.nextLine();
        System.out.print("Enter password: ");
        String p = sc.nextLine();

        try {
            if (!u.equals(user) || !p.equals(pass)) {
                throw new InvalidLoginException("Invalid Credentials!");
            }
            System.out.println("Login Successful");
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}
