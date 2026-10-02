import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.println("Please enter 3 numbers: "); 
        int a = in.nextInt(); 
        int b = in.nextInt(); 
        int c = in.nextInt(); 

        System.out.println("The maxiumum number amongst these three is : " + maximum(a, b, c)); 
        System.out.println("The minimum number amongst these three is : "+minimum(a, b, c)); 
    }   
    
    static int maximum(int a, int b, int c) {
        return (a < b && b > c) ? b : (a > b && a > c) ? a : c;    
    }

    static int minimum(int a, int b, int c) {
        return ( a < b && a < c) ? a:(b < a && b < c) ? b : c;  
    }
}
