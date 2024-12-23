import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a = 'a', b = 'b';
        int flag = 0;
        int bvisited = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'b') {
                flag = 1;
                break;
            } else {
                if (s.charAt(i) == 'a' && bvisited == 0) {
                    continue;
                } else if (s.charAt(i) == 'b') {
                    bvisited = 1;
                } else {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0 && bvisited == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
