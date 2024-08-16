import java.util.Scanner;

public class snake_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int j = 0; j < n/2; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[n - i - 1][j];
                    arr[n - i - 1][j] = temp;
                }
                System.out.print(arr[i][] + " ");
            }
        }
    }
}
