import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hour:");
        int h = sc.nextInt();
        System.out.println("Enter the minutes:");
        int m = sc.nextInt();
        int hours, min;
        if (h >= 24 || m == 0) {
            hours = 24 - h;
            System.out.println(hours + "::" + m);
        } else {
            hours = 24 - h - 1;
            min = 60 - m;
            System.out.println(hours + "::" + min);
        }
    }
}
