import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df3 = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        int litres = sc.nextInt();
        int distancecovered = sc.nextInt();
        double resl = ((double) litres * 100 / (double) distancecovered);
        System.out.printf("%.2f", resl);
        System.out.println();
        double distance = (double) distancecovered * 0.6214;
        System.out.println(df3.format(distance));

    }
}
