package Sol_5;
import java.util.Scanner;

public class Duck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isDuck = false;
        int rem =0;
        while(n>0){
            rem = n%10;
            if(rem==0){
                isDuck = true;
                break;
            }
            n = n/10;
        }
        if(isDuck==true){
            System.out.println("Duck Number");
        }
        else{
            System.out.println("Not a Duck Number");
        }
        
    }
}
