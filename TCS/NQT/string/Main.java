import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = s.split(" ");
        if (str[1].contains(str[0])) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
