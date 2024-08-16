
import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int len1 = str1.length();
        int len2 = str2.length();
        int i = 0, j = 0, count = 0;

        while (i < len1 && j < len2) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
                count++;
            } else {
                i++;
            }
        }
        if (count == len2) {
            System.out.println("Subsequence");
        } else {
            System.out.println("not a subsequence");
        }
    }

}