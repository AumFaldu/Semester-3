
import java.util.Scanner;

public class Lab_13_72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data=0;
        LinkedList li = new LinkedList();
        
        String s = "";
        while (!s.equals("-1")) { 
            System.out.println("Enter 1 to insert node at first position : ");
        System.out.println("Enter 2 to delete node at specific position : ");
        System.out.println("Enter 3 to insert node at last position : ");
        System.out.println("Enter 4 to display Doubly Linked List : ");
        System.out.println("Enter -1 to end the loop");
        s = sc.next();
            switch(s){
                case "1":
                System.out.println("Enter data : ");
                data = sc.nextInt();
                li.insertAtFirst(data);
                break;
                case "2":
                System.out.println("Enter data : ");
                data = sc.nextInt();
                li.deleteAtSpecific(data);
                break;
                case "3":
                System.out.println("Enter data : ");
                data = sc.nextInt();
                li.insertAtLast(data);
                break;
                case "4":
                li.display();
                break;
                case "-1":
                System.out.println("Exiting the loop");
                return;
            }
        }
    } 
}
class Node{
    int data;
    Node lptr;
    Node rptr;
    public Node(int data){
        this.data = data;
        this.lptr = null;
        this.rptr = null;
    }
}
class LinkedList{
    Node first = null;
    Node last = null;
    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            last = newNode;
        }
        else{
            last.rptr = newNode;
            newNode.lptr = last;
            last = newNode;
        }
    }
    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            last = newNode;
        }
        else{
            newNode.rptr = first;
            first = newNode;
        }
    }
    public void deleteAtSpecific(int data){
        if(first == null){
            System.out.println("Doubly LinkedList is Empty");
        }
        else{
            if (first.data == data) {
                first = first.rptr;
                first.lptr = null;
            }
            Node temp = first;
            while (temp.rptr.rptr!=null) {
                if (temp.rptr.data == data) {
                    temp.rptr = temp.rptr.rptr;
                } 
                temp = temp.rptr;
            }
            if(temp.rptr.data == data){
            temp.rptr = null;
            }
        }
    }
    public void display(){
        Node temp=first;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp = temp.rptr;
        }
        System.out.println();
    }
}