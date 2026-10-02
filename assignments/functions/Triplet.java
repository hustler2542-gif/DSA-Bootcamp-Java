import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 

        System.out.println("Please enter 3 numbers: "); 
        int a = in.nextInt(); int b = in.nextInt(); int c = in.nextInt(); 

        if(isTriplet(a,b,c)) {
            System.out.println("The provided three numbers are pythagorean triplet"); 
        } 
        else {
            System.out.println("The provided three numbers are not pythogorean triplet"); 
        }
    }

    static boolean isTriplet(int a, int b, int c) {
        if( a * a + b * b == c * c) {
            return true; 
        }
        return false; 
    }
}
