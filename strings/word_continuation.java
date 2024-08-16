import java.util.ArrayList;
import java.util.Scanner;

public class word_continuation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.next();
        String w2 = sc.next();
        ArrayList<String> arr = new ArrayList<>();
        while (w1.charAt(w1.length() - 1) == w2.charAt(0)) {

            arr.add(w1);
            w1 = w2;

            w2 = sc.next();

        }
        arr.add(w1);
        for (String c : arr) {
            System.out.println(c);
        }
    }
}
