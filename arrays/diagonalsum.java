import java.util.Scanner;

public class diagonalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        int lsum = 0;
        int rsum = 0;
        for (int i = 0; i < n; i++) {
            lsum += arr[i][i];
            rsum += arr[i][n - i - 1];
        }
        if (lsum == rsum) {
            System.out.println("Equal");

        } else {
            System.out.println("Not equal");
        }
    }
}
