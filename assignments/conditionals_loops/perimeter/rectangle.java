import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int a = sc.nextInt();
        int b = sc.nextInt();
        int perimeter = 2 * (a + b); 
            
        System.out.print("Perimeter of rectangle is : " + perimeter);
    }        
}
