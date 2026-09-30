import java.util.Scanner;

public class cone {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        float PI = 3.14f; 

        int r = sc.nextInt(); 
        int h = sc.nextInt();

        double volume = (PI*r*r*h)/3; 

        System.out.print("Volume of cone is : " + volume);
    }    
}
