import java.util.Scanner;

public class fibonacciModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = 0, b = 1;
            int nth = 0;

            if (n == 0) {
                nth = a % m;
            } else if (n == 1) {
                nth = b % m;
            } else {
                for (int i = 2; i <= n; i++) {
                    int c = (a + b) % m;
                    a = b;
                    b = c;
                    nth = c % m;
                }
            }
            System.out.println(nth);
        }

    }

}
