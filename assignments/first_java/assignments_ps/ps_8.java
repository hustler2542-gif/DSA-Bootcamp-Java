import java.util.Scanner;

public class ps_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String ip = sc.next(); 
        String rev = ""; 

        for(int le = ip.length() - 1; le >= 0; le --) {
            rev = rev + ip.charAt(le); 
        }

        if(ip.equals(rev))
        {
            System.out.println("String is palindrome"); 
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
