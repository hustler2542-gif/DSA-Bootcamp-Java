/* 
    input principal amount, rate of interest, years
    use the ci => p * (1 + rate/100)^time 
    print
*/
import java.util.*;

public class Compound {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); 
        System.out.println("Welcome to Lombard banking services: "); 
        System.out.println("------------------------------------------");

        System.out.println("Enter the following : 1] Principal amount \n 2] Rate of interest \n 3] Years to compound"); 
        int principal_amount = in.nextInt(); 
        int rate = in.nextInt(); 
        int time = in.nextInt(); 

        
        double ci = principal_amount * Math.pow(( 1 + rate/100.0f),time); 

        if(rate == 0)
        { 
            System.out.println("Please enter valid number of years"); 
        }
        else if(time == 0)
        {
            System.out.println("Please enter valid number of years");
        }
        else if(principal_amount == 0)
        {
            System.out.println("Please enter valid amount");
        }
        else 
        {    
            System.out.println("After compounding for :: " + time + " years: \n");
            System.out.println("Your amount will grow by:: " + ci);  
        }
    }
}
