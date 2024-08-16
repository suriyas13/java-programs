import java.util.Scanner;

public class parking_slot {
    public static int find_prior_elements(int[][] arr, int r, int c) {
        int max = 0, count = 0, index = 0;
        for (int i = 0; i < r; i++) {
            count = 0;
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (max < count) {
                max = count;
                index = i + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = find_prior_elements(arr, r, c);
        System.out.println(ans);
    }
}
