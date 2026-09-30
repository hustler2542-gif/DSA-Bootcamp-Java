import java.util.Scanner;

public class sphere {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        int r = sc.nextInt(); 
        double volume = (4.0/3) * Math.PI*r*r*r; 

        System.out.print("Volume of sphere is : " + volume);
    }            
}
