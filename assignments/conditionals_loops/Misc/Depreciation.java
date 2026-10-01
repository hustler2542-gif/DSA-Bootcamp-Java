/* 

    pseudocode

    input the amount original value 
    input the number -> percent of depreciation 

    use the direct formula og_amount 8 ( 1 - rate/100)-> remove the depreciated amount and give me the remaining from 100 percent
*/
import java.util.Scanner;

public class Depreciation {
   public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in); 

    System.out.println("Welcome to Lombard bank Depreciation calculator: ");
    System.out.println("Enter the following \n 1. Amount 2. Depreciation percentage ");
    
    int og_amount = in.nextInt(); 
    int depreciation = in.nextInt(); 

    float amount_after_depreciation = og_amount * (1 - depreciation/100.0f); 

    System.out.println("Amount remaining after the depreciation of the asset is : " + amount_after_depreciation) ;   

   } 
}
