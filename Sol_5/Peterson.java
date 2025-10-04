package Sol_5;
import java.util.Scanner;
public class Peterson {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        // A number is Peterson if the sum of factorials of its digits equals the number.
        
        int temp =num;
        int sum =0;
        while(num>0){
           int rem =num%10;
            int fact =1;
            for(int i=1;i<=rem;i++){
            fact = fact*i;
        }
        num /=10;
        sum +=fact; 
        }
        // System.out.println(num);
        if(sum == temp){
            System.out.println("Peterson number");
        }
        else{
            System.out.println("not a peterson number");
        }



    }
    
}
