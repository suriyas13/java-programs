import java.util.Scanner;

public class Main {
    public static boolean checkpalindrome(String s) {
        if (s == null) {
            return true;
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return checkpalindrome(s.substring(1, (s.length() - 1)));
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Boolean flag = checkpalindrome(s);
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
