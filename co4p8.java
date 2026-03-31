import java.util.*;

class StackDemo<T> {
    Stack<T> stack = new Stack<>();

    void push(T item) {
        stack.push(item);
    }

    void pop() {
        if (!stack.isEmpty())
            System.out.println("Popped: " + stack.pop());
        else
            System.out.println("Stack Empty");
    }

    void display() {
        System.out.println(stack);
    }
}

public class co4p8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackDemo<Integer> s = new StackDemo<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            s.push(sc.nextInt());
        }

        s.display();
        s.pop();
        s.display();
    }
}
