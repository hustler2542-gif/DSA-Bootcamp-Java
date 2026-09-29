// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class ps_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        String name = sc.nextLine(); 

        System.out.println("Hello to " + name + " from java"); 
    }   
}
