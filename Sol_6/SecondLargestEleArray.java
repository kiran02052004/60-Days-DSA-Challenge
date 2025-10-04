package Sol_6;

import java.util.Scanner;

public class SecondLargestEleArray {
    public static void main(String[] args) {
        // Find the second largest element in the array.
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < t; i++) {
            if (arr[i] > max) {
                secondMax = max; 
                max = arr[i];  
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i]; 
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("Second largest element: " + secondMax);
        }
    }
}