import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split(" ");
        System.out.println("Length of the array: " + s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }
}
