import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum / n;
        DecimalFormat df = new DecimalFormat("0.#################");
        System.out.println(df.format(avg));
    }
}
