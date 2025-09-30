package Sol_4;
import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        int pro=0;
        while (num-->0){
            sum +=num%10;
            pro +=num%10;
            num /=10;

        } 
        if(sum==pro){
            System.out.println("Spy number");
        }
        else{
            System.out.println("NOt a Spy number");
        }
        
        sc.close();    
        
    }
    
}
