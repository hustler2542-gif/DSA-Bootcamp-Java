/*

    pseudocode


    input the number of nos to read
    create a var called sum initialize it as 0 
    create a temp variable whhich will count of my number of numbers are read or  not. 
    loop (keep reading until the number of numbers is not read)
        store the sum of all the numbers 
    find out the avearage by dividing the sum with number of ip to be taken.
    print it.  
*/

import java.util.Scanner;

public class averagen {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter number of times you want to take input : "); 
        int times = in.nextInt(); 

        // create copy of times literal
        int temp = times; 
        int sum = 0; 

        while(temp >=1) 
        {   
            int user_ip = in.nextInt(); 
            sum = sum + user_ip; 
            temp -= 1; 
        }
        
        System.out.println("The average of all the inputed " + times + " numbers is : " + sum/times); 
    }
}