import java.util.*;

public class powOfNum {
    static int power(int n, int p) {
        int num = 1;
        for (int i = 1; i <= p; i++) {
            num = num * n;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.print("Power of a number is:" + power(n, p));
        sc.close();
    }

}
