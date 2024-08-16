import java.util.Scanner;

class Linkedlist {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Linkedlist() {
        head = null;
        tail = null;
    }

    public void addatbeg(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void addatlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void addatspecific(int data, int pos) {
        Node newnode = new Node(data);
        if (pos == 1) {
            newnode.next = head;
            head = newnode;
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
        if (newnode.next == null) {
            tail = newnode;
        }
    }

    // public void reverselist() {
    // Node current = head;
    // Node prev=head;
    // while(temp!=null)
    // }

    public void deleteatpos(int pos) {
        if (pos == 1) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }

            if (temp.next != null) {
                temp.next = temp.next.next;
            }
            if (temp.next == null) {
                tail = temp;
            }
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

    public void reversedisplay(Node temp) {

        if (temp == null) {
            return;
        }
        reversedisplay(temp.next);
        System.out.print(temp.data + " ");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        list.addatbeg(10);
        list.addatbeg(20);
        list.addatbeg(30);
        list.addatlast(40);
        list.addatlast(50);
        list.addatspecific(60, 3);

        list.display();
        list.deleteatpos(2);
        list.deleteatpos(5);
        list.display();
        list.reversedisplay(list.head);
    }
}