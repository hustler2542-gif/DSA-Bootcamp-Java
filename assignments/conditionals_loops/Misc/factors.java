/*

input a number and print all the factors of that number

factors -> number which divide this number 

12 ke factors will lie below 12 only 

psuedocode

input the num to find  factor of 
loop (i <= input number)
    check if(input number divided by the loop index is equal to 0)
    print the factor 


*/

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt(); 

        int i = 1;
        
        while(i <= num) {
            if(num % i == 0) {
                System.out.print(" "+i);
            }
            i++; 
        }
    }
}
