import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class addstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            arr.add(s);
        }
        arr.remove("suriya");

        int i = 0;
        for (String x : arr) {
            if (x.equals("banana")) {
                System.out.println(i);
            }
            i++;
        }
        Collections.sort(arr);
        for (String x : arr) {
            System.out.println(x);
        }
        // Increase capacity to 6
        arr.ensureCapacity(6);

    }
}
