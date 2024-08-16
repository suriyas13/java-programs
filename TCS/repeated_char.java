import java.util.Scanner;

public class repeated_char {
    public static int find_odd_ans(int[] b) {
        for (int i = 0; i < b.length; i++) {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] b = new char[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.next().charAt(0);
        }
        int ans = find_odd_ans(b);
    }
}
