package Sol_5;

import java.util.Scanner;

public class Evil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        int count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.println(num + " is an Evil number.");
        } else {
            System.out.println(num + " is not an Evil number.");
        }
        sc.close();
        
        
        
    }
}