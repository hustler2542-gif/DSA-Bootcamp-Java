/*
    Factorial fn -> says to multiple all the number from n to down to 1

    eg 

    5 -> 5,4,3,2,1

    multiple 5 * 4 * 3 * 2 * 1; 

    pseudocode

    input number
    create a fact variable initalize it with 1  
    loop (until my number isn't 1 keep looping current loop -> ip number)
        fact = fact * 5 
        decrement the value of ip number 

    print fact
*/

import java.util.Scanner;

public class factorial {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 

        int num = in.nextInt(); 
        int fact = 1;

        while(num >=1)
        {
            fact *= num;
            num = num - 1;  
        }

        System.out.println("Factorial of given number is : " + fact);
    }
}
