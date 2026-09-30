import java.util.Scanner;

public class parallelogram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int b = sc.nextInt(); 
        int h = sc.nextInt(); 

        int area = b * h;  

        System.out.print("Area of parallelogram is : " + area);
    }
}
