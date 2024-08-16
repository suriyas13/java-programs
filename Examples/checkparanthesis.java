import java.util.Scanner;

class checkparanthesis {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int count1 = 0;
        for (int i = 0; i < a.length(); i++) {
            char s = a.charAt(i);
            if (s == '(') {
                count1++;
            } else if (s == ')') {
                count1--;
            }
        }
        if (count1 == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}