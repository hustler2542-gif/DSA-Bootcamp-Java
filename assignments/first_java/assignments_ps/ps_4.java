// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class ps_4 {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in); 

    int a,b; 
    char symb; 

    a = sc.nextInt(); 
    b = sc.nextInt(); 
    symb = sc.next().charAt(0);

    if(symb == '+')
    {
        System.out.println("User asked for + :" + (a + b)); 
    }
    else if(symb == '-')
    {
        System.out.println("User asked for - :" + (a - b)); 

    }
    else if(symb == '*')
    {
        System.out.println("User asked for * :" + (a * b)); 

    }
    else 
    {
        System.out.println("User asked for / :"+ (a/b)); 
    }

   } 
}
