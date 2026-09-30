import java.util.Scanner;

public class equilateral {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int side = sc.nextInt(); 
        int perimeter = 3 * side; 

        System.out.println("Perimeter of equilateral triangle is : " + perimeter);
    }    
}
