import java.util.Scanner;

public class Lab_13_74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList li = new LinkedList();
        int data = 0;
        while (true) {
            System.out.print("Enter data: ");
            data = sc.nextInt();
            if (data == -1) break;
            li.addNode(data);
        }
        li.split();
    }
    
}

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class LinkedList {
    Node first = null;
    Node last = null;
    int count=0;
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            last = newNode;
            last.link = first;
            count=1;
        } else {
            last.link = newNode;
            last = newNode;
            last.link = first;
            count++;
        }
    }
    public void split(){
        LinkedList li1 = new LinkedList();
        LinkedList li2 = new LinkedList();
        Node temp = first;
            for(int i=0;i<count/2;i++){
                li1.addNode(temp.data);
                temp = temp.link;
            }  
            for(int i=count/2;i<count;i++){
                li2.addNode(temp.data);
                temp = temp.link;
            }
            System.out.println("LinkedList1 = "+li1.display());
            System.out.println("LinkedList2 = "+li2.display());
    }

    public String display() {
        if (first == null) return "";
        StringBuilder sb = new StringBuilder();
        Node temp = first;
        do {
            sb.append(temp.data+" ");
            temp = temp.link;
            
        } while (temp != first);
        return sb.toString();
    }
}
