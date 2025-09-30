package Sol_4;

import java.util.Scanner;
public class Harshad{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num =sc.nextInt();
        int sum =0;

        while(num -->0){
            sum +=num%10;
            num /=10;
        }
        if(sum % num ==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not harshad Number");
        }
    }
}