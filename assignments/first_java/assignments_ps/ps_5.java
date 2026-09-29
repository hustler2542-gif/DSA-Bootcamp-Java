//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class ps_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        System.out.println("The largest number of them 2 is : "+(a<b ? b:a)); 
    }
    
}
