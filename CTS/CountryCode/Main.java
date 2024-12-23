import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.contains("-")) {
            System.out.println(s.substring(0, 2));
        } else {
            System.out.println("NF");
        }
    }
}
