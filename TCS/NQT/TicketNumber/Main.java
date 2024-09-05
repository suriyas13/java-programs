import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tickets:");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E' && str.charAt(i + 1) == 'F' && i + 1 < str.length()) {
                i++;
                continue;
            } else if (str.charAt(i) == 'G') {
                continue;
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}