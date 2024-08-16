import java.util.Scanner;

class Stack {
    Node top;

    class Node {
        int data;
        int max;
        Node next;

        Node(int val, int vall) {
            this.data = val;
            this.max = vall;
            this.next = null;
        }
    }

    Stack() {
        top = null;
    }

    public void push(int n) {

        if (top == null) {
            top = new Node(n, n);

        } else {
            Node newnode = new Node(n, Math.max(n, top.max));
            newnode.next = top;
            top = newnode;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        top = top.next;

    }

    public int getmax() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.max;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String k = sc.nextLine();
            if (k.startsWith("1")) {
                int val = Integer.parseInt(k.split(" ")[1]);
                stack.push(val);
            } else if (k.equals("2")) {
                stack.pop();
            } else if (k.equals("3")) {
                System.out.println(stack.getmax());
            }
        }
    }
}
