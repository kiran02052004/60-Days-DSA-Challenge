package Bonus_questions;

public class PowerSum{
    public static int Pow(int num,int pow){
        if(pow==0) return 1;
        return num*Pow(num,pow-1);
    }
        
    public static void main(String[] args) {
        int num=2;
        int pow=5;
        System.out.println(Pow(num,pow));
        
    }
}