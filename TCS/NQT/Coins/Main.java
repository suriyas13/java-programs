import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = i; j <= n; j++) {
                dp[j] += dp[j - i];
            }
        }
        System.out.println(dp[n]);
    }
}
