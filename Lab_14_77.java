import java.util.Scanner;

public class Lab_14_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize Scanner

        BinaryTree bt = new BinaryTree(); // Create BinaryTree instance

        System.out.println("Enter root element: ");
        int rootData = sc.nextInt();
        bt.root = new Node(rootData);

        // Build the tree with user input
        buildTree(bt.root, sc);

        // Display the tree
        bt.display();
    }

    private static void buildTree(Node node, Scanner sc) {
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
                buildTree(node.left, sc); // Recursively build the left subtree
            } else if (choice == 2) {
                System.out.println("Enter data for the right child of node " + node.data + ": ");
                int rightData = sc.nextInt();
                if (node.right == null) {
                    node.right = new Node(rightData);
                }
                buildTree(node.right, sc); // Recursively build the right subtree
            } else if (choice == -1) {
                break; // Stop adding children
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
