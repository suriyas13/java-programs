import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> hs = new HashSet<>();
        boolean dul = false;
        for (int num : arr) {
            if (hs.contains(num)) {
                System.out.println("Duplicate Element:" + num);
                dul = true;
                break;
            } else {
                hs.add(num);
            }
        }
        if (!dul) {
            System.out.println("No duplicate");
        }
    }
}
