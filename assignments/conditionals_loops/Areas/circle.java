/*
Area Of Circle Java Program

Ram Ram 

*/
import java.util.*;

class circle {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in); 

        float PI = 3.14f; 
        int radius = sc.nextInt(); 
        float area = PI * (radius * radius); 

        System.out.println("The area of circle is: "+ area); 

    }

}