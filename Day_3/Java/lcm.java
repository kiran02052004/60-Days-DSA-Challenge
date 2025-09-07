import java.util.Scanner;

public class lcm {
    static int gcd(int a, int b) {

        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
        sc.close();
    }

}
