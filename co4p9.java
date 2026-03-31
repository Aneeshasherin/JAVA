import java.util.*;

public class co4p9 {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        Integer arr[] = new Integer[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        bubbleSort(arr);

        System.out.println("Sorted:");
        for (int i : arr)
            System.out.print(i + " ");
    }
}
