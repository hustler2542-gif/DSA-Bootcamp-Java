import java.util.Scanner;

public class equilateral {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();

        double area = (Math.sqrt(3)/4) * side * side; 

        System.out.print("Area of equilateral triangle: " + area); 
    }
}
