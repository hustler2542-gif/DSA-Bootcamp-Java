// Input currency in rupees and output in USD.

import java.util.Scanner;

public class ps_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        float oneruppeinusd = 0.0104243861f;
        
        int rs = sc.nextInt(); 

        System.out.println("Ruppe converted in dollar becomes: " +(rs * oneruppeinusd)); 
    }    
}
