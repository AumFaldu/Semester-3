import java.util.Scanner;
public class Lab_13_73{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList li = new LinkedList();
        System.out.println("Enter -1 to exit");
        int data=0;
        while (true) { 
            System.out.print("Enter data : ");
            data = sc.nextInt();
            if(data==-1)break;
            li.addNode(data);
        }
        li.deleteAlternate();
        li.display();
    }
}
class Node{
    int data;
    Node lptr;
    Node rptr;
    public Node(int data){
        this.data = data;
        lptr = null;
        rptr = null;
    }
}
class LinkedList{
    Node head = null;
    Node tail = null;
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{

            tail.rptr = newNode;
            newNode.lptr = tail;
            tail = newNode;
        }
    }
    public void deleteAlternate(){
        if(head==null || head.rptr==null){
            System.out.println("Cannot be deleted");
        }
        else{
            Node temp = head;
            while (temp!=null && temp.rptr!=null) { 
                Node next = temp.rptr;
                temp.rptr = next.rptr;
                if (next.rptr != null) {
                    next.rptr.lptr = temp;
                }
                temp = temp.rptr;
            }
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.rptr;
        }
        System.out.println();
    }
}