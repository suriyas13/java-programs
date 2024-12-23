import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (j != i && min > arr[j] && arr[i] <= arr[j]) {
                    min = arr[j];
                }
                if (max < arr[j] && i == 0) {
                    max = arr[j];
                }
            }
            if (max == arr[i]) {
                System.out.println(arr[i] + "-->" + "0");
            } else {
                System.out.println(arr[i] + "-->" + min);
            }
        }
    }
}
