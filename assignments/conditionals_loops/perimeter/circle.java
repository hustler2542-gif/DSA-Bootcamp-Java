import java.util.Scanner;

public class circle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        float PI = 3.14f; 
        int r = sc.nextInt(); 
        float perimeter = 2 * PI * r; 

        System.out.println("Perimeter of circle: " + perimeter); 

        
    }
}
