class LinkedList {
    Node head = null;
    Node tail;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    LinkedList() {
        head = null;
        tail = null;

    }

    public void append(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;

        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
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

    public void reversedisplay() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.append(20);
        obj.append(30);
        
        obj.display();
        obj.reversedisplay();
    }
}
