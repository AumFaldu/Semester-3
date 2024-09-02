import java.util.Scanner;

public class ArrayToTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid array size. Must be greater than 0.");
            return;
        }

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        BinaryTree bt = new BinaryTree();
        bt.root = bt.insert(arr, 0);

        System.out.println("Preorder traversal of the binary tree:");
        bt.preorder(bt.root);
        System.out.println("\nInorder traversal of the binary tree:");
        bt.inorder(bt.root);
        System.out.println("\nPostorder traversal of the binary tree:");
        bt.postorder(bt.root);

        sc.close();
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    Node insert(int[] arr, int i) {
        Node node = null;
        if (i < arr.length) {
            node = new Node(arr[i]);
            node.left = insert(arr, 2 * i + 1);
            node.right = insert(arr, 2 * i + 2);
        }
        return node;
    }

    void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}
