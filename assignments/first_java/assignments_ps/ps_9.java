import java.util.Scanner;

public class ps_9 {

    public static boolean isArmstrong(int num)
    {
           int temp1 = num; 
        // No of digits calculate
        int counter = 1; 

        while(temp1/10 !=0)
        {
            counter++; 
            temp1 = temp1/10; 
        }

        // each facevalue add power and do their same

        int temp2 = num; 
        int no_of_digits = counter; 
        int sum = 0; 
        while (counter != 0) {
            
            int digit = temp2 % 10; 
            sum = sum + (int)(Math.pow(digit, no_of_digits));             
            temp2 = temp2/10; 
            counter --; 
        }

        if(sum == num)
        {
            return true;
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int start = sc.nextInt();
        int end = sc.nextInt();
        
        for(int i = start; i <= end; i++)
        {
            if(isArmstrong(i) == true)
            {
                System.out.println(+i+ " is palindrome"); 
            }
        }

    }
    
}

