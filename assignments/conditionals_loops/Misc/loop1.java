/*
Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

    pseudocode

    create sum var 

    loop (keep taking input until user explicitly enters 0)
        every number should be added stored in sum = sum + the new ip
        
    print the sum 

*/

import java.util.Scanner;

public class loop1 {

    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);

        int ip = sc.nextInt(); 

        while(ip != 0)
        {   
            sum = sum + ip; 
            ip = sc.nextInt();
        }
        System.out.println("The sum of all inputed numbers are : " + sum); 
    }
    
}
