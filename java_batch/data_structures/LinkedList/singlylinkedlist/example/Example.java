class LinkedList {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    LinkedList() {
        head = null;
        tail = null;
    }

    public void addatBeginning(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void addatposition(int val, int pos) {
        Node newnode = new Node(val);

        if (pos == 0) {
            newnode.next = head;
            head = newnode;
        } else {
            Node temp = head;

            for (int i = 1; i < pos; i++) {
                temp = temp.next;
                if (temp == null) {
                    System.out.println("Position out of bounds");
                    return;
                }
            }
            newnode.next = temp.next;
            temp.next = newnode;

            if (newnode.next == null) {
                tail = newnode;
            }
        }
    }

    public void addatlast(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void delete_element(int pos) {
        if (pos == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < pos - 2; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Example {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.addatlast(10);
        obj.addatlast(20);
        obj.addatBeginning(30);
        obj.addatposition(40, 0);
        obj.addatposition(50, 2);
        obj.addatposition(60, 4);
        obj.delete_element(3);
        obj.display();
    }
}
