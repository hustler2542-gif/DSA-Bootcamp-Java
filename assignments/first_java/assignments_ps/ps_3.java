
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class ps_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int p, t, r;

        p = sc.nextInt(); 
        t = sc.nextInt(); 
        r = sc.nextInt(); 

        int si = (p * r * t)/100; 

        System.out.println("Simple interest you will get is: " + si); 
    }    
}
