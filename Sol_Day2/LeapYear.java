package Sol_Day2;

public class LeapYear {
    public static void main(String[] args) {
        int year =1000;
        if((year%4==0 && year %100!=00)||(year %400==0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
