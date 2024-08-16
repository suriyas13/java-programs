import java.util.Scanner;

class eg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = '@';
        if (Character.isAlphabetic(a)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(a)) {
            System.out.println("NUmber");
        } else {
            System.out.println("Special character");
        }
    }
}