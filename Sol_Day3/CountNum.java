package Sol_Day3;

public class CountNum {
    public static void main(String[] args) {
        
        int n =89987;
        int count=0;
        for(int i=1;i<=n;i++){
            n = n/10;
            count ++;

        }
        System.out.println(count);

    }
}
