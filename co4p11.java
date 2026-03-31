import java.util.*;

public class co4p11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        System.out.println("Before clear: " + list);

        list.clear();

        System.out.println("After clear: " + list);
    }
}
