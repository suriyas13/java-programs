import java.util.Arrays;
import java.util.Scanner;

public class merge_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int a[] = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            a[j] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(a);
        int[] merged_array = new int[n + m];
        int i = 0, k = 0, j = 0;

        while (i < n) {
            merged_array[k++] = arr[i++];
        }
        while (j < m) {
            merged_array[k++] = a[j++];
        }
        for (int l = 0; l < merged_array.length; l++) {
            System.out.println(merged_array[l]);
        }
    }
}
