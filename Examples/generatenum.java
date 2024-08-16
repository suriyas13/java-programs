
// program to generate number for n digit eg if n=3 then print 0 to 999
import java.util.Scanner;

public class generatenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number:");
        int n = sc.nextInt();
        int end = (int) Math.pow(10, n);
        int[] num = new int[end];
        for (int i = 0; i < end; i++) {
            num[i] = i;
        }
        for (int i = 0; i < end; i++) {
            String number = String.format("%2" + 4 + "d", num[i]);
            System.out.print(number + " ");
        }

    }
}
