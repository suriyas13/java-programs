
//program to get sum from maximum of two elements and minimum of two elements
import java.util.Scanner;

public class sum_of_max_min_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int max_sum = arr[n - 1] + arr[n - 2];
        int min_sum = arr[0] + arr[1];
        int sum_of_max_min = arr[0] + arr[1] + arr[n - 1] + arr[n - 2];
        System.out.println("Maximum sum:" + max_sum);
        System.out.println("Minimum sum:" + min_sum);
        System.out.println("Sum:" + sum_of_max_min);
    }
}
