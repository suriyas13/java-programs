import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int val = (int) (s.charAt(i) - '0');
            if (val > arr[val]) {
                sb.append(val);
            } else {
                sb.append(arr[val]);
            }
        }
        System.out.println(sb.toString());
    }
}
