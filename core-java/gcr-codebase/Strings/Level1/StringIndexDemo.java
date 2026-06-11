import java.util.Scanner;

public class StringIndexDemo {

   
    static void generateException(String s) {
        System.out.println(s.charAt(s.length())); // out of bounds
    }

    
    static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

       

        handleException(s); 

        sc.close();
    }
}