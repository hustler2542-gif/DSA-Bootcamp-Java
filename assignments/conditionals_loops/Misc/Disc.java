/*
    Calculate  the discount of the product


*/

import java.util.Scanner;

public class Disc {
    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in); 

        System.out.println("Welcome to our discount calculator"); 
        System.out.println("\n To calculate the discount please enter the following: \n\n");
        System.out.println("1. Original amount \n 2. Discount");    

        int og_amount = in.nextInt(); 
        int discount = in.nextInt(); 

        float discounted_amount = Math.abs(og_amount - og_amount * (discount/100.0f));
        System.out.println("Debugging " + (discount/100.0));

        System.out.println("The discounted amount is : " + discounted_amount); 

    }
}
