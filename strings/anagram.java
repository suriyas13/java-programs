import java.util.Scanner;

public class anagram {
    static boolean checkanagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] count = new int[52];

        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i : count) {
            if (i != 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean res = checkanagram(str1, str2);
        if (res)
            System.out.println("YEs");
        else
            System.out.println("NO");
    }

}
