import java.util.*; 

public class Main {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        Main m = new Main(); 
        m.input_output(); 
        m.main(args);
    }    
    public void input_output() {
        System.out.println("Enter the input: "); 
        int num = in.nextInt(); 
        System.out.println("The output is : " + num);
    }
}
