import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr1[i] = arr[i];
        }
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    count1++;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[j - 1] > arr1[j]) {
                    int temp = arr1[j - 1];
                    arr1[j - 1] = arr1[j];
                    arr1[j] = temp;
                    count2++;
                }
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
