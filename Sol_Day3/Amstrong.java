package Sol_Day3;

public class Amstrong {
    public static void main(String[] args) {
        int n =153;
        int original =n;
        int sum = 0;
        while(n!=0){
            int digit =n/10;
            sum +=digit*digit*digit;
            n %=10;

        }
        if(sum ==n){
            System.out.println("Amstrong");
        }
        else{
            System.out.println("Not Amstrong");
        }
    }
}
