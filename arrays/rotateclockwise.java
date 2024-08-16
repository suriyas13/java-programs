import java.util.Scanner;

public class rotateclockwise {
    public static int[][] transpose(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        return a;

    }

    public static void rotate(int[][] arr, int n) {
        int[][] tarr = transpose(arr, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = tarr[i][j];
                tarr[i][j] = tarr[i][n - j - 1];
                tarr[i][n - j - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(tarr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        rotate(arr, n);
    }
}
