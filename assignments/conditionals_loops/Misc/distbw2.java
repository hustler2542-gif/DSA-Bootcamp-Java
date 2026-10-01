import java.util.Scanner;

public class distbw2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 

        System.out.println("Welcome to calculate distance between 2 points. ");
        
        System.out.println("================================================="); 
        System.out.println("Enter distance 1: ");
        int d1 = in.nextInt(); 

        System.out.println("Enter distance d2: ");
        int d2 = in.nextInt(); 

        System.out.println("The disance between the point d1 : " + d1 + " and point d2: " + d2 + " is => " + (int)(d2 - d1));

    }
}
