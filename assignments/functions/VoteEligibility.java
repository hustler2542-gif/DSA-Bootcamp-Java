import java.util.*;

public class VoteEligibility {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in); 
        System.out.println("Please enter your age"); 
        int age = in.nextInt(); 

        if(isEligibleToVote(age)) {
            System.out.println("You're eligible to vote."); 
        } 
        else {
            System.out.println("You're not eligible to vote. "); 
        }
    }    

    static boolean isEligibleToVote(int age) {
        return age >= 18 ? true : false; 
    }
}
