import java.util.Scanner;

public class prism {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        int ba = sc.nextInt(); 
        int h = sc.nextInt();

        double volume = ba * h; 

        System.out.print("Volume of prism is : " + volume);
    }        
}
