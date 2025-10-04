package Sol_5;

import java.util.Scanner;

public class Kaprekar {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sq=0;
        while(num>0){
            num %=10;
            sq += num * num;
            num /=10;

        }
        if (sq == num) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }
        sc.close();
    }
}
