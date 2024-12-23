import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split("\\.");
        int n = Integer.parseInt(arr[0]);
        double a = Double.parseDouble(s);

        double d = a - n;
        if (d >= 0.5) {
            n += 1;
        }
        System.out.println(n);
    }
}
