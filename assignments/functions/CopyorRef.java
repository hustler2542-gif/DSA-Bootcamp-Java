public class CopyorRef {
    public static void main(String[] args) {
    int a = 2; 
    System.out.println("Before passing to function: " + a); 
    add(a);
    a = add(a); 
    System.out.println("After passing to function: " + a); 
    
    }   
    static int add(int a){
        return a = a + a; 
    }
}
