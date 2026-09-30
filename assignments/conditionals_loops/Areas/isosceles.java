import java.util.Scanner;

public class isosceles {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int b = sc.nextInt(); 
        int h = sc.nextInt();

        float area = 0.5f*b*h; 

        System.out.println("Area of isosceles triangle is: " + area); 
    }
    
}