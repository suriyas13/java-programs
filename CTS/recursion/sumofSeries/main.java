import java.util.Scanner;

public class main {
    public static int findsum(int n) {
        if (n == 1) {
            return 1;
        }
        return findsum(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = findsum(n);
        System.out.println(sum);
    }
}
