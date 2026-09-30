import java.util.Scanner;

public class csa {
      public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in); 
 
        int radius = sc.nextInt(); 
        int h = sc.nextInt();
        double area = 2* Math.PI * radius * h; 

        System.out.println("The curved surface area  is: "+ area); 

    }
    
}
