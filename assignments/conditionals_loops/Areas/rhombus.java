import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int d1 = sc.nextInt(); 
        int d2 = sc.nextInt(); 

        float area = 0.5f * d1 * d2; 

        System.out.println("Area of rhombus is : " + area); 
    }    
}
