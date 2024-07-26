
import java.util.Scanner;

public class left_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        d = d % n;
        for (int i = 0; i < n; i++) {
            b[i] = arr[(i + d) % n];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
