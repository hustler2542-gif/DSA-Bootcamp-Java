/*

    Cobinations -> n!/ r!(n-r)! 

    Permutation ->   nPr = n!/(n-r)!

*/

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Combinatorics {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        System.out.println("please enter the following \n 1] N  & 2] R"); 
        
        int n = in.nextInt(); 
        int r = in.nextInt(); 
        
        int fact_n = 1; 

        for(int i = n; i >=1; i--) {
            fact_n = i * fact_n; 
        }

        int fact_r = 1; 

        for(int i = r; i >=1; i--) {
            fact_r = i * fact_r; 
        }

        int fact_n_r = 1; 
        
        for(int i = n - r; i >= 1; i--) {
            fact_n_r = fact_n_r * i; 
        }

        // combinations 

        int combination = fact_n/(fact_r*fact_n_r); 
        int permutation = fact_n/fact_n_r; 
    
        System.out.println("The number of combination of n objects: " + combination + "\n The number of permutations of n objects: " + permutation);

    }
}
