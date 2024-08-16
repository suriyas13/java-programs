import java.util.Scanner;

public class unifrom_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        if (even == (n * n)) {
            System.out.println("Even");
        } else if (odd == (n * n)) {
            System.out.println("Odd");
        } else {
            System.out.println("Not uniform");
        }

    }
}
