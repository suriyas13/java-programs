import java.util.Scanner;

class BST {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    BST() {
        root = null;
    }

    public void append(int data) {
        Node newnode = new Node(data);
        if (root == null) {
            root = newnode;
        } else {
            Node temp = root;
            while (true) {
                if (newnode.data < temp.data) {
                    if (temp.left != null) {
                        temp = temp.left;
                    } else {
                        temp.left = newnode;
                        break;
                    }
                } else if (data > temp.data) {
                    if (temp.right != null) {
                        temp = temp.right;
                    } else {
                        temp.right = newnode;
                        break;
                    }
                }
            }
        }
    }

    public void display(Node temp) {
        if (temp != null) {
            display(temp.left);
            System.out.print(temp.data + " ");
            display(temp.right);

        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST list = new BST();
        int data;
        while ((data = sc.nextInt()) != -1) {
            list.append(data);
        }

        list.display(list.root);
    }
}
