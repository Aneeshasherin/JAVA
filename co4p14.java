import java.util.*;

public class co4p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            dq.add(sc.nextInt());

        System.out.println("Deque: " + dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println("After deletion: " + dq);
    }
}
