// import java.util.Scanner;

// class A {
//     public static int find_prior_elements(int[] arr, int n) {
//         int count = 0, max = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 count++;
//                 max = arr[i];
//             }
//         }
//         return count;

//     }
// }

// public class prior_elements {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int ans = A.find_prior_elements(arr, n);
//         System.out.println(ans);
//     }
// }
import java.util.Scanner;

class prior_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int flag = 0;
            while (j >= 0) {
                if (arr[j] > arr[i]) {
                    flag = 1;
                    break;
                }
                j--;
            }
            if (flag == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}