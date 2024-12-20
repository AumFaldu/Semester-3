import java.util.Scanner;
public class Lab_10_57{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList li = new LinkedList();
		String s = "";
		int data=0;
		while(!s.equals("-1")){
			System.out.println("Press 1 to Insert node at first : ");
		System.out.println("Press 2 for display of nodes : ");
		System.out.println("Press 3 to delete node at first : ");
		System.out.println("Press 4 to insert node at end : ");
		System.out.println("Press 5 to delete node at end : ");
		System.out.println("Press 6 to delete node at specified position : ");
		System.out.println("Press -1 for exit");
		s = sc.next();
			switch(s){
				case "1":
					System.out.print("Enter the value of node you want to insert at first : ");
					data = sc.nextInt();
					li.insertAtFirst(data);
				break; 
				case "2":
					li.display();
				break; 
				case "3":
					li.deleteAtFirst();
				break; 
				case "4":
					System.out.print("Enter the value of node that you want to insert at last : ");
					data = sc.nextInt();
					li.insertAtLast(data);
				break; 
				case "5":
					li.deleteAtLast();
				break; 
				case "6":
					System.out.print("Enter the value of node that you want to delete : ");
					data = sc.nextInt();
					li.deleteAtSpecific(data);
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
	Node link;
	public Node(int data){
		this.data = data;
		this.link = null;
	}
}
class LinkedList{
	Node first = null;
	public void insertAtFirst(int data){
		Node newNode = new Node(data);
		if(first == null){
			first = newNode;
		}
		else{
			newNode.link = first;
			first = newNode;
		}
	}
	public void insertAtLast(int data){
		Node newNode = new Node(data);
		if(first == null){
			first = newNode;
		}
		else{
			Node temp = first;
			while(temp.link!=null){
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}
	public void display(){
		Node temp=first;
			while(temp != null){
				System.out.print(" "+temp.data);
				temp = temp.link;
			}
			System.out.println();
	}
	public void deleteAtFirst(){
		if(first==null){
			System.out.println("Cannot be deleted as LinkedList is empty");
		}
		else{
			first = first.link;
		}
	}
	public void deleteAtLast(){
		if(first==null){
			System.out.println("Cannot be deleted as LinkedList is empty");
		}
		else{
			Node current=first;
			while((current.link).link!=null){
				current = current.link;
			}
			current.link = null;
		}
	}
	public void deleteAtSpecific(int data){
		if (first == null) {
            System.out.println("Cannot be deleted as LinkedList is empty");
            return;
        }

        if (first.data == data) {
            deleteAtFirst();
            return;
        }

        Node current = first;
        while(current.link.data != data) {
            if (current.link == null) {
                System.out.println("Cannot be deleted as value is not inside the node");
                return;
           }
            current = current.link;
        }

        if (current.link == null) {
            System.out.println("Cannot be deleted as value entered is not inside the node");
        } else {
            current.link = current.link.link;
        }
	}
}
