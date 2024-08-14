import java.util.Scanner;

public class Lab_14_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinaryTree bt = new BinaryTree();

        System.out.println("Enter root element: ");
        int rootData = sc.nextInt();
        bt.root = new Node(rootData);
        insert(bt.root, sc);
        bt.display();
    }

    private static void insert(Node node, Scanner sc) {
        if (node == null) return;

        while (true) {
            System.out.println("Enter 1 to add a left child, 2 to add a right child, -1 to stop adding children for node with data " + node.data);
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter data for the left child of node " + node.data + ": ");
                int leftData = sc.nextInt();
                if (node.left == null) {
                    node.left = new Node(leftData);
                }
                insert(node.left, sc);
            } else if (choice == 2) {
                System.out.println("Enter data for the right child of node " + node.data + ": ");
                int rightData = sc.nextInt();
                if (node.right == null) {
                    node.right = new Node(rightData);
                }
                insert(node.right, sc);
            } else if (choice == -1) {
                break;
            }
        }
    }
}

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    void display() {
        displayRecursive(root);
        System.out.println();
    }

    private void displayRecursive(Node node) {
        if (node != null) {
            displayRecursive(node.left);
            System.out.print(node.data + " ");
            displayRecursive(node.right);
        }
    }
}
