package Sol_6;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];

        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }

        int start = 0, end = t - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < t; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
