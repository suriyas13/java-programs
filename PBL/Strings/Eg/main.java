import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                if (i > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                i++;
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());

    }

}
