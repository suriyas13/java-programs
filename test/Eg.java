
import java.util.Scanner;

class Eg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
            sum1 += arr1[i];
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
            sum2 += arr2[i];
        }
        if (m == n && sum1 == sum2) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

    }
}
