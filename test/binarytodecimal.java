import java.util.Scanner;;

public class binarytodecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int sum = 0;
        // char[] c=s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                sum = (int) (sum + Math.pow(2, n - i - 1));
            }
        }
        System.out.println(sum);
    }
}
