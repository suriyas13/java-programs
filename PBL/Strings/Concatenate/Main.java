
import java.util.Scanner;

public class Main {
    public void concatenate(String name) {
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                char ch = Character.toLowerCase(name.charAt(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Main obj = new Main();
        obj.concatenate(name);

    }
}
