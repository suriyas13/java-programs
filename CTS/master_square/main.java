import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int cols[] = new int[n];
        int rows[] = new int[n];
        int colval = 0, rowval = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowval += arr[i][j];
                colval += arr[j][i];
            }
            cols[i] = colval;
            colval = 0;
            rows[i] = rowval;
            rowval = 0;
        }
        int count = 0, flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] < cols[j]) {
                    count++;
                } else {
                    flag = 1;
                }
            }
        }
        if (flag == 1) {
            System.out.println("NO");
            System.out.println(count);
        } else {
            System.out.println("Yes");
        }
    }
}
