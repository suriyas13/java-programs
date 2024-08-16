
import java.util.Scanner;

public class two_wheeler {
    public int find_two_wheeler(int v, int w) {
        int four = (w - (2 * v)) / 2;

        return four;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of vehicles:");
        int v = sc.nextInt();
        System.out.println("ENter the number of wheels:");
        int w = sc.nextInt();
        two_wheeler obj = new two_wheeler();
        int four = obj.find_two_wheeler(v, w);
        int two = v - four;
        System.out.println(two);
        System.out.println(four);
    }
}
