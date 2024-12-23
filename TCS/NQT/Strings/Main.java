import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int c1[] = new int[26];
        int c2[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            c1[c - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            c2[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (c1[i] != 0 && c2[i] != 0) {
                if (c1[i] == c2[i]) {
                    int min = Math.min(c1[i], c2[i]);
                    char c = (char) (i + 'a');
                    for (int j = 0; j < min; j++) {
                        sb.append(c);
                    }

                } else {
                    char c = (char) (i + 'a');
                    sb.append(c);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
