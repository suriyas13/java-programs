import java.util.Scanner;

public class majorityelement {
    public static int majorityElement(int arr[]) {
        int cd = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                cd = arr[i];
            }
            if (cd == i) {
                count++;
            } else {
                count--;
            }
        }
        return cd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
}
