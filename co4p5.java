import java.util.Scanner;

class Table extends Thread {
    int n;
    Table(int n) { this.n = n; }

    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }
}

class Prime extends Thread {
    int n;
    Prime(int n) { this.n = n; }

    public void run() {
        int count = 0, num = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

public class co4p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for table: ");
        int t = sc.nextInt();

        System.out.print("Enter how many primes: ");
        int p = sc.nextInt();

        new Table(t).start();
        new Prime(p).start();
    }
}
