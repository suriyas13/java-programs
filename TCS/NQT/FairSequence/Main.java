import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int fairsequence(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        int t = 0;
        if (arr[0] > 0) {
            t = 1;
        }
        int i = 0;
        while (i < n) {
            if (t == 1) {
                int j = i;
                while (j < n) {
                    if (arr[j] > 0) {
                        j++;
                    } else {
                        break;
                    }
                }
                int max_sum = arr[i];
                for (int k = i + 1; k < j; k++) {
                    if (arr[k] > max_sum) {
                        max_sum = arr[k];
                    }
                }
                list.add(max_sum);
                i = j;
                t = 0;
            } else {
                int j = i;
                while (j < n) {
                    if (arr[j] < 0) {
                        j++;
                    } else {
                        break;
                    }
                }
                int max_sum = arr[i];
                for (int k = i + 1; k < j; k++) {
                    if (arr[k] > max_sum) {
                        max_sum = arr[k];
                    }
                }
                list.add(max_sum);
                i = j;
                t = 1;
            }
        }
        int sum = 0;
        for (int k : list) {
            sum += k;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = fairsequence(arr, n);
        System.out.println(sum);
    }
}
