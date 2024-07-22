import java.util.Scanner;

public class Lab_13_75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = "";
        LinkedList li = new LinkedList();
        while(true) {
            System.out.println("Enter music (enter '-1' to stop adding music): ");
            data = sc.nextLine();
            if(data.equals("-1"))
                break;
            li.addNode(data);
        }
        
        String choice = "";
        while(!choice.equals("-1")) {
            System.out.println("Enter 1 to play the music : ");
            System.out.println("Enter 2 to go to prev : ");
            System.out.println("Enter 3 to go to next : ");
            System.out.println("Enter 4 to stop the music :");
            System.out.println("Enter 5 to display : ");
            System.out.println("Enter -1 to exit the music player : ");
            
            choice = sc.next();
            
            switch(choice) {
                case "1":
                    li.play();
                    break;
                case "2":
                    li.prev();
                    break;
                case "3":
                    li.next();
                    break;
                case "4":
                    li.stop();
                    break;
                case "5":
                    li.display();
                    break;
                case "-1":
                    System.out.println("Exiting Music Player");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}

class Node {
    String data;
    Node lptr;
    Node rptr;
    
    public Node(String data) {
        this.data = data;
        this.lptr = null;
        this.rptr = null;
    }
}

class LinkedList {
    Node first = null;
    Node last = null;
    Node curr = null;
    
    public void addNode(String data) {
        Node newNode = new Node(data);
        if(first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.rptr = newNode;
            newNode.lptr = last;
            last = newNode;
        }
    }
    
    public void display() {
        Node temp = first;
        while(temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.rptr;
        }
        System.out.println();
    }
    
    public void next() {
        if(curr == null) {
            curr = first;
            if(curr != null) {
                System.out.println(curr.data + " music is being selected");
            } else {
                System.out.println("No Music is being selected");
            }
        } else if(curr == last) {
            System.out.println("No Music is being selected");
        } else {
            curr = curr.rptr;
            if(curr != null) {
                System.out.println(curr.data + " is being selected");
            }
        }
    }
    
    public void prev() {
        if(curr == null) {
            System.out.println("No Music is being selected");
        } else {
            curr = curr.lptr;
            if(curr != null) {
                System.out.println(curr.data + " is being selected");
            }
        }
    }
    
    public void stop() {
        if(curr == null) {
            System.out.println("No music is being stopped");
        } else {
            System.out.println(curr.data + " is being stopped");
        }
    }
    
    public void play() {
        if(curr == null) {
            System.out.println("No music is being played");
        } else {
            System.out.println(curr.data + " is being played");
        }
    }
}
