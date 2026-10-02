import java.util.Scanner;

public class PrimeInRange {
       public static void main(String[] args) {    
        Scanner in = new Scanner(System.in); 

        System.out.println("Enter a number range: start --> end ");
        int start = in.nextInt();
        int end = in.nextInt();  

        if(start <= 0 || end <= 0 ||  end == 1) {
            System.out.println("Please enter a number valid number greter than 1 and -ve"); 
            start = in.nextInt();
            end = in.nextInt();  
        }

        for(int le = start; le <= end; le++) {
            if(isPrime(le)) {
                System.out.print(" " + le); 
            }
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
