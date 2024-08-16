
import java.util.Scanner;
import java.util.Stack;

class Example {
    public void findbalance(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("No");
                    return;
                }
                char top = stack.pop();
                if ((top != '(' && ch == ')') ||
                        (top != '{' && ch == '}') ||
                        (top != '[' && ch == ']')) {
                    System.out.println("No");
                    return;
                }
            }

        }
        if (stack.isEmpty())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Example eg = new Example();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            eg.findbalance(str);
        }
    }
}