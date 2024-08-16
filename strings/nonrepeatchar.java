import java.util.Scanner;

public class nonrepeatchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(s.charAt(i));
            }
        }

    }
}
