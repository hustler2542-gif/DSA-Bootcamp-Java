import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int  l = sc.nextInt(); 
        int  w = sc.nextInt(); 

        int area = l * w; 

        System.out.print("Area of rectangle is : "+ area);
    }    
}
