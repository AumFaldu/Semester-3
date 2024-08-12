import java.util.Scanner;

public class ArrayToTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        Tree tree = new Tree();
        for (int i = 0; i < n; i++) {
            tree.insertNode(arr[i], i);
        }

        System.out.println("In-order Traversal of the Binary Tree:");
        tree.inorder();
    }
}

class Node {
    Node lptr = null;
    Node rptr = null;
    int data;

    Node(int data) {
        this.data = data;
    }
}

class Tree {
    Node root = null;

    public void insertNode(int val, int index) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
        } else {
            insertAtIndex(root, newNode, index, 0);
        }
    }

    private void insertAtIndex(Node curr, Node newNode, int targetIndex, int currentIndex) {
        if (curr == null) {
            return;
        }
        if (currentIndex == targetIndex) {
            if (curr.lptr == null) {
                curr.lptr = newNode;
            } else if (curr.rptr == null) {
                curr.rptr = newNode;
            }
            return;
        }
        if (curr.lptr != null) {
            insertAtIndex(curr.lptr, newNode, targetIndex, 2 * currentIndex + 1);
        }
        if (curr.rptr != null) {
            insertAtIndex(curr.rptr, newNode, targetIndex, 2 * currentIndex + 2);
        }
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.lptr);
            System.out.print(node.data + " ");
            inorderRec(node.rptr);
        }
    }
}
