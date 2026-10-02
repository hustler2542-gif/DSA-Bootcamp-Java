
public class StringRev {
    public static void main(String[] args) {
        
        String s = "Aryan"; 

        System.out.println("String before manipulation: " + s); 
        manipulate(s);
        System.out.println("String after manipulation: " +s); 
    }

    static void manipulate(String s) {
        String rev = "";
        for(int le = s.length()-1; le >= 0; le--) {
            rev = rev +  s.charAt(le);
        }
        s = rev;
    }
}
