/*
    pseudocode

    ip number, number of times to multiple it 
    create mul  = ip number
    loop (1 -> number of times to raise)
        mul = mul * ip
    print

*/

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 

        System.out.println("Enter the number you want to get power of : "); 
        int ip = in.nextInt(); 

        System.out.println("Enter by how many power you want to raise it : "); 
        int pow = in.nextInt(); 

        int mul = 1; 

        for(int le = 0; le < pow; le++) {
            mul = mul * ip; 
        }

        System.out.println("The power  : " + pow + " raised to number "+ ip + " is "  + mul);

    }
}
