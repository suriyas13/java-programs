import java.util.ArrayList;
import java.util.List;
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
                } else if (newnode.data > temp.data) {
                    if (temp.right != null) {
                        temp = temp.right;
                    } else {
                        temp.right = newnode;
                        break;
                    }
                } else {
                    // Duplicate values are not added in the BST
                    break;
                }
            }
        }
    }

    public List<Integer> display(Node temp) {
        List<Integer> arr = new ArrayList<>();
        if (temp != null) {
            arr.addAll(display(temp.left));
            arr.add(temp.data);
            arr.addAll(display(temp.right));
        }
        return arr;
    }

    public Integer findKthMinimum(int k) {
        List<Integer> sortedElements = display(root);
        if (k > 0 && k <= sortedElements.size()) {
            return sortedElements.get(k - 1);
        } else {
            return null; // k is out of bounds
        }
    }
}

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST list = new BST();
        int data;

        // Read input data
        System.out.println("Enter values for the BST (end with -1):");
        while ((data = sc.nextInt()) != -1) {
            list.append(data);
        }

        // Display the 3rd minimum element (or any k-th minimum element)
        System.out.println("Enter k to find the k-th minimum element:");
        int k = sc.nextInt();

        Integer kthMin = list.findKthMinimum(k);
        if (kthMin != null) {
            System.out.println("The " + k + "-th minimum element is: " + kthMin);
        } else {
            System.out.println("There are fewer than " + k + " elements in the tree.");
        }

        sc.close(); // Close the scanner to avoid resource leak
        
    }
}
