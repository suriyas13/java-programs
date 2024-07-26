import java.util.Scanner;

public class maximum_subarray {
    public static int maxSubArray(int[] nums) {
        int cs = nums[0];
        int ms = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (cs > 0) {
                cs += nums[i];
            } else {
                cs = nums[i];
            }
            ms = Math.max(cs, ms);
        }
        return ms;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxSubArray(arr);
        System.out.println(ans);
    }
}
