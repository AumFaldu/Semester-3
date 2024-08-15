
import java.util.Scanner;

public class Lab_14_79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        int data;
        BinarySearchTree bst1 = new BinarySearchTree();
        System.out.println("BST1:");
        while(true){
            System.out.println("Enter value you want to enter : ");
            System.out.println("Enter -1 to exit");
            data = sc.nextInt();
            if(data == -1) break;
            bst1.insert(data);
        }
        data=0;
        BinarySearchTree bst2 = new BinarySearchTree();
        System.out.println("BST2:");
        while (true) { 
            System.out.println("Enter value you want to enter : ");
            System.out.println("Enter -1 to exit");
            data = sc.nextInt();
            if(data == -1) break;
            bst2.insert(data);
        }
        if(bst1.equals(bst2)){
            System.out.println("BST1 and BST2 are equal");
        }
        else{
            System.out.println("BST1 and BST2 are not equal");
        }
    }
}
class Node{
    int key;
    Node left;
    Node right;
    Node(int data){
        key = data;
        left = null;
        right = null;
    }
}
class BinarySearchTree{
    Node root;
    void insert(int data){
        root = insertRecord(root,data);
    }
    Node insertRecord(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.key){
            root.left = insertRecord(root.left,data);
        }
        else if(data>root.key){
            root.right = insertRecord(root.right,data);
        }
        return root;
    }
    void inorderRecord(Node root){
        if(root==null){
            return;
        }
        inorderRecord(root.left);
        System.out.println(root.key+" ");
        inorderRecord(root.right);
    }
    boolean equals(BinarySearchTree bst2){
        return equalsRecord(this.root,bst2.root);
    }
    boolean equalsRecord(Node node1,Node node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1!=null && node2!=null){
            return (node1.key == node2.key) && equalsRecord(node1.left,node2.left) && equalsRecord(node1.right,node2.right);
        }
        return false;
    }
}
