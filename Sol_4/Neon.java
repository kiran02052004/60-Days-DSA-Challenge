package Sol_4;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        int sq =num*num;
        while(sq>0){
            sum +=sq%10;
            sq /=10;

        }
        if(num==sum){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}
