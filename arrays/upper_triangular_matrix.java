import java.util.Scanner;

public class upper_triangular_matrix {
    public static void uppertriangluarmatrix(int[][] arr, int n) {
        boolean flag = false;
        System.out.println("Check using Forward diagonal");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (i > j && arr[i][j] == 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        }
        if (flag == true) {
            System.out.println("Upper triangular Matrix");
        } else {
            System.out.println("Not Upper triangular Matrix");
        }
    }

    public static void lowertriangularmatrix(int[][] arr, int n) {
        boolean flag = false;
        System.out.println("Check using Forward diagonal");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j && arr[i][j] != 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;

                }
            }
        }
        if (flag == true) {
            System.out.println("Lower triangular Matrix");
        } else {
            System.out.println("Not Lower triangular Matrix");
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
        uppertriangluarmatrix(arr, n);
        lowertriangularmatrix(arr, n);
    }
}
