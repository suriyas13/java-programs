import java.util.Scanner;

public class d1_to_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[x];
        int[][] arr2 = new int[m][n];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int z = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = arr[z];
                z++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println("");
        }
    }

}
