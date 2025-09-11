package Sol_Day1;

public class PrimeNumber {
    public static void main(String[] args) {
        int number =2;
        boolean isPrime =true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
                break;
            }

        }
        if(isPrime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
