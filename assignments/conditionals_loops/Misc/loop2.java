/*
Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

    pseudocode

    create largest var 

    loop (keep taking input until user explicitly enters 0)
        ip compare with previous ip 
        largest = largest < ip ? ip : largest
        largest = ip        
    print the sum 

*/

import java.util.Scanner;

public class loop2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ip = sc.nextInt();
        int largest = ip; 

        while(ip != 0)
        {   
            ip = sc.nextInt();
            largest = largest < ip ? ip : largest; 
        }
        System.out.println("The largest number is  : " + largest); 
    }
}
