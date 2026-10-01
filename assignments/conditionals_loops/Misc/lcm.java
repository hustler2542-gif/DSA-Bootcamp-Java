/*

pseudocode

1. multiple ip 
2. hcf(ip)
3. multiplied value / hcf(ip) -> op 

input number num1, num2 
multiple var -> store the multiplication of ip1 * ip2;
loop (1->largest among both the numbers)
    check if (loop index divides both the numbers)
    if yes -> hcf set with loop index value 

multiplied value divide by hcf function op 
print 

*/

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 

        System.out.println("Enter two numbers: "); 
        int num1 = in.nextInt(); int num2 = in.nextInt(); 

        int lcm_mul = num1 * num2; 

        int hcf = 0; 
        int largest = num1 < num2 ? num2 : num1; 

        for(int le = 1; le <= largest; le++) {
            if(num1 % le == 0 && num2 % le == 0) {
                hcf = le; 
            }
        }

        System.out.println("Lcm of " + num1 + " and " + num2 + " is : " + lcm_mul / hcf); 
    }
    
}
