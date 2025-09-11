package Bonus_questions;

import java.util.Scanner;

public class MaxEleArray {
    public static void main(String[] args) {;
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int arr[] ={3,4,1,8,6,7};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max)
             {
                max=arr[i];
             }    
            }
        System.out.println("Max element in array is: "+max);
    }
}
