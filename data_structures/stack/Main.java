class Stack {
    Node top;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Stack() {
        top = null;
    }

    public void push(int val) {
        Node newnode = new Node(val);
        if (top == null) {
            top = newnode;
        } else {
            newnode.next = top;
            top = newnode;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped data:" + top.data);
            top = top.next;
        }
    }

    public void displaytop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top Element:" + top.data);
        }

    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class Main {
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(20);
        obj.push(10);
        obj.push(30);
        obj.pop();
        obj.display();
        obj.displaytop();
    }
}
