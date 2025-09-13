package Sol_Day3;

public class PerfectNum {
    public static void main(String[] args) {
        int n =6;
        int sum =0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum ==n){
            System.out.println("The Number is perfect ");
        }
        else{
            System.out.println("Not a Perfect number");
        }

    }
}
