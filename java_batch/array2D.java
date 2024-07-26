import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Row wise Maximum");
        for (int i = 0; i < r; i++) {
            int max_element = Integer.MIN_VALUE;
            for (int j = 0; j < c; j++) {
                if (arr[i][j] > max_element) {
                    max_element = arr[i][j];
                }
            }
            System.err.print(max_element + " ");
        }
        System.out.println();
        System.out.println("Row wise Minimum");
        for (int i = 0; i < r; i++) {
            int min_element = Integer.MAX_VALUE;
            for (int j = 0; j < c; j++) {
                if (arr[i][j] < min_element) {
                    min_element = arr[i][j];
                }
            }
            System.err.print(min_element + " ");
        }
        System.out.println();
        System.out.println("Column wise Minimum");
        for (int i = 0; i < c; i++) {
            int min_element = Integer.MAX_VALUE;
            for (int j = 0; j < r; j++) {
                if (arr[j][i] < min_element) {
                    min_element = arr[j][i];
                }
            }
            System.err.print(min_element + " ");
        }
        System.out.println();
        System.out.println("Column wise Maximum");
        for (int i = 0; i < c; i++) {
            int max_element = Integer.MIN_VALUE;
            for (int j = 0; j < r; j++) {
                if (arr[j][i] > max_element) {
                    max_element = arr[j][i];
                }
            }
            System.err.print(max_element + " ");
        }

    }
}
