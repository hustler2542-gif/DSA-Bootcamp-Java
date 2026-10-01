/*
    Total Bill=(Units Consumed×Tariff Rate)+Fixed Charges+Electricity Duty+Surcharges


*/

import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int fixed_charges = 110; 
        float rate = 8.09f; 


        System.out.println("Enter the units you consumed: "); 
        int units_consumed = in.nextInt(); 

        
        float energy_consumed = units_consumed * rate;
        float duty = Math.abs(energy_consumed - energy_consumed * 1.05f);
        float bill = energy_consumed + duty + fixed_charges;  

        System.out.println("The total electricity bill is : " + bill);

    }    
}
