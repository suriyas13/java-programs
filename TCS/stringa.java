import java.util.Scanner;

public class stringa {
    public static int checkstring(String str, int len) {
        int i = 0, count = 0;

        while (i < len) {
            if (str.charAt(i) == '#') {
                count--;
            } else if (str.charAt(i) == '*') {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int ans = checkstring(str, len);
        if (ans > 0) {
            System.out.println("Positive");
        } else if (ans < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Equal");
        }
        System.out.println(ans);
    }
}
