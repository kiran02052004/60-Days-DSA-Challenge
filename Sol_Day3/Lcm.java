

package Sol_Day3;
public class Lcm{
    public static int gcd(int a,int b){
        int result =Math.min(a, b);
        while(result <0){
        if(result%a ==0 && result%b==0){
            break;
        }
        result --;

    }
    return result;
    }
    public static void main(String[] args) {
        
        int a =12;
        int b=3;
        int gcd =gcd(a, b);
        int lcm = (a*b)/gcd;
        System.out.println(lcm);

    }

}