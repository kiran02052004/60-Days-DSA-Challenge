package Sol_Day3;

public class Palindrome {
    public static void main(String[] args) {
        int n =121;
        int original =n;
        int reversedNumber = 0;
        while(n !=0){
            int digit = n%10;
            reversedNumber =reversedNumber*10+digit;
            n =n/10;
        }
        if (reversedNumber == original) {
            System.out.println(" is a palindrome.");
        } else {
            System.out.println( " is not a palindrome.");
        }
    }
}
