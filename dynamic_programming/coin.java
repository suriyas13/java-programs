
//Given a set of coin denominations and a total amount, find the number of ways to make the total amount using any number of coins.
import java.util.Scanner;

public class coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter teh total amount");
        int total = sc.nextInt();
        System.out.println("ENter the number of coins");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ways = new int[total + 1];
        ways[0] = 1;
        for (int coin : arr) {
            for (int j = coin; j < total + 1; j++) {
                ways[j] += ways[j - coin];
            }
        }
        System.out.printf("Number of ways to get total %d:%d", total, ways[total]);

    }
}
