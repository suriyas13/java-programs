import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, j = n;
        while (i < n) {
            int temp = arr[i];
            arr[i] = arr[n - 1];
            arr[n - 1] = temp;
            i++;
            n--;
        }
        for (int k = 0; k < j; k++) {
            System.out.println(arr[k]);
        }
    }
}
