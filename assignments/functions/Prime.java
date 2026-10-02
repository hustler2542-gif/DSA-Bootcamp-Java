/*
    pseudocode 

    input number  main function 
    pass -> copy of value to isPrime()function 

    isPrime()
        if(input parameter == 1 || 0 || -negative)
            return false
        loop (from 2 -> square root of passed parameter)
            check if(passed number uska 2 -> sqrt tak agar koi factor) 
                break -> return false 
        return true; 
*/

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in); 

        System.out.println("Enter a number: ");
        int number = in.nextInt(); 

        if(number <= 0 || number == 1) {
            System.out.println("Please enter a number n> 1 &  n > 0 or -ve number"); 
            number = in.nextInt(); 
        }

        if(isPrime(number)) {
            System.out.println("The entered number is prime"); 
        }
        else {
            System.out.println("The entered number is not prime"); 
        }
    }

    static boolean isPrime(int number) {
        for(int le = 2; le <= (int)Math.sqrt(number); le++) {
            if(number % le == 0) {
                return false; 
            }
        }
        return true; 
    }
    
}
