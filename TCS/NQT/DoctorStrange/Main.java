import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int attacks = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int red[] = new int[attacks];
        for (int i = 0; i < attacks; i++) {
            red[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < red.length; i++) {
            int j = 0, count = 0;
            while (red[i] > 0) {
                if (arr[j] != 0) {
                    arr[j] = arr[j] - 1;
                    red[i]--;
                }
                if (arr[j] == 0) {
                    count++;
                }
                j++;
            }
            if (count == n) {
                for (int k = 0; k < arr.length; k++) {
                    arr[k] = 1;
                }
                list.add(count);
            } else {
                list.add(n - count);
            }
        }
        System.out.println(list.toString());
    }
}
