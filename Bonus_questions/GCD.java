package Bonus_questions;

public class GCD {
    public static int GCD(int i, int j){
        while(j !=0){
        int temp =j;
        j = i%j;
        i =temp;
    }
    return i;
}
    public static void main(String[] args) {
        int num1 =30;
        int num2 =18;
        int result =GCD(num1,num2);
        System.out.println(result);
    }
}
