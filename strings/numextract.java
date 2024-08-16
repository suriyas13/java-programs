import java.util.Scanner;

public class numextract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0, num = 0, sum = 0;
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num = num * 10 + (s.charAt(i) - '0');
            } else {
                sum += num;
                num = 0;
            }
            i++;
        }
        sum += num;
        System.out.println(sum);
    }

}
