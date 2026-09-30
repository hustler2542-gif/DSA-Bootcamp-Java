import java.util.Scanner;

public class cylinder {
 public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        int r = sc.nextInt(); 
        int h = sc.nextInt();

        double volume = Math.PI*r*r*h; 

        System.out.print("Volume of cylinder is : " + volume);
    }        
}
