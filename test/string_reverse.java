import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                System.out.print(str[i].charAt(j));
            }
            System.out.println(" ");
        }
    }

}
