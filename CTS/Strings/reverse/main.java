import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[j])) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            if (!Character.isAlphabetic(ch[i])) {
                i++;
            }
            if (!Character.isAlphabetic(ch[j])) {
                j--;
            }
        }
        String res = new String(ch);
        System.out.println(res);
    }
}
