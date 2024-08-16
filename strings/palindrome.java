import java.util.Scanner;

public class palindrome {
    public static boolean checkpalindrome(String s) {
        boolean flag = true;
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                flag = true;
                i++;
                j--;

            } else {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().replace("[^A-Za-z]", "").toLowerCase();

        boolean flag = checkpalindrome(s);

        if (flag)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

}
