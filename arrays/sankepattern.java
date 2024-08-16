import java.util.Scanner;

public class sankepattern {
    public static void pattern1(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (i % 2 != 0) {
                    int temp = a[i][j];
                    a[i][j] = a[i][n - j - 1];
                    a[i][n - j - 1] = temp;
                }
            }
        }
        System.out.println("Pattern 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");

            }
        }
        System.out.println("");
    }

    public static void pattern2(int[][] a, int n) {
        System.out.println("Pattern 2:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
            } else {

                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }

    public static void pattern3(int[][] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n - i - 1) {
                    sum += a[i][j];
                }
            }
        }
        System.out.println(" ");
        System.out.println("Sum of first row backward daigonal and last row:");
        System.out.println(sum);
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
        int[][] array = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        pattern1(arr, n);
        pattern2(array, n);
        pattern3(arr, n);

    }

}
