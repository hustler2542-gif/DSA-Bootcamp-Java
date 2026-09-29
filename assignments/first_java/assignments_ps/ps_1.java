// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class ps_1 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in); 
        int num  = sc.nextInt(); 

        if(num % 2 == 0)
        {
            System.out.println("Number is even"); 
        }
        else 
        {
            System.out.println("Number is odd"); 
        }
    }
}
