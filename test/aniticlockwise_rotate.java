import java.util.Scanner;

public class aniticlockwise_rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] arr2 = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr2[i][j];
                arr2[i][j] = arr2[j][i];
                arr2[j][i] = temp;
            }
        }
        for (int i = 0; i < m / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    int temp = arr2[i][j];
                    arr2[i][j] = arr2[n - i - 1][j];
                    arr2[n - i - 1][j] = temp;
                }

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println("");

        }
    }

}
