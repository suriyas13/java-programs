import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        String[] s = new String[t];

        for (int i = 0; i < t; i++) {
            s[i] = sc.nextLine();  
        }
        
        Mau.generate(s, t); // static methods can be called using class name
        sc.close();
    }
}
    class Mau{

    public static void generate(String[] s, int t) {
        try {
            for (int i = 0; i < t; i++) {
                System.out.println((i + 1) + " " + s[i]);
            }
        } catch (Exception e) {
            System.out.println("Read me until end-of-file.");
        }
    }
}
