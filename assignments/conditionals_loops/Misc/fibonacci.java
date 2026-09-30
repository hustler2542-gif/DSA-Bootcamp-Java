import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int num = sc.nextInt(); 

        int f0 = 0; 
        int f1 = 1; 
        int sum = f0 + f1; 

        System.out.print("The fionacci series is : " + f0 + " " + f1 + " " + sum); 

        for(int le = 1; le < num - 2; le++) {
            f0 = f1; 
            f1 = sum; 
            sum = f1 + f0; 
            System.out.print(" " + sum);
        }
    }    
}
