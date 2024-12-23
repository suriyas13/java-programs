import java.util.Scanner;

public class even_integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                a[j++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != 0)
                System.err.println(a[i]);
        }
    }
}
