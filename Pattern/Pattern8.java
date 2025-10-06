package Pattern;

public class Pattern8 {
//      *
//    * * *
//  * * * * *
//    * * *
//      *
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print("   ");

            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            
            }
            for(int l=2;l<=i;l++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("   ");
            }
            for(int k=i;k<=n-1;k++){
                System.out.print(" * ");
            }
            for(int l=i;l<=n-2;l++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        

    }
}
