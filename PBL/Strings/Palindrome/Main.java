
/*Check the given string is palindomre or not using String Buffer*/

import java.util.Scanner;

class Main {
    public void checkPalindrome(String str) {
        StringBuffer a = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            a.append(str.charAt(i));
        }
        if (str.equals(a.toString())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Main obj = new Main();
        obj.checkPalindrome(str);
    }
}
