/*

    psuedocode

    input two number
    create hcf var 
    loop (1 to the largest number out of the two numbers)
        check if (the  loop index divides  both ip1 and ip2)
        if yes -> store it as hcf -> this acts as running max 
    
    print hcf 
*/

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 

        System.out.println("Enter two numbers : "); 
        int num1 = in.nextInt(); int num2 = in.nextInt(); 

        int hcf = 0; 
        int largest = num1 < num2 ? num2 : num1; 

        for(int le = 1; le <= largest; le++) {
            if(num1 % le == 0 && num2 % le == 0) {
                hcf = le; 
            }
        }

        System.out.print("\nThe highest common factor after using the factors listing method\n"); 
        System.out.println(hcf); 
    }
}
