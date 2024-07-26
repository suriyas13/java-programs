import java.util.Scanner;

public class missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum1 = 0, sum2 = 0;
        ;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum1 += arr[i];
        }

        for (int i = 1; i <= n + 1; i++) {
            sum2 += i;
        }
        System.out.println(sum2 - sum1);
    }
}
