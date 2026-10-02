import java.util.Scanner;

public class EvenOdd {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    System.out.println("Please enter a number: "); 
    int num = in.nextInt(); 

    System.out.println("The following " + even_or_odd(num)); 
   }
   
   static String even_or_odd(int num) {
    if(num % 2 == 0) {
        return "number is even"; 
    }
    return "number is odd"; 
   }
}
