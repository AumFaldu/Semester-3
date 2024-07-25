import java.util.Scanner;

public class Lab_9_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Queue : ");
        int size = sc.nextInt();
        Queue q = new Queue(size);
        int data;
        String choice;
        while (true) {
            System.out.println("Enter 1 for insert at rear : ");
            System.out.println("Enter 2 for delete at front : ");
            System.out.println("Enter 3 for insert at front : ");
            System.out.println("Enter 4 for delete at rear : ");
            System.out.println("Enter 5 to display : ");
            System.out.println("Enter -1 to exit : ");
            choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.print("Enter data : ");
                    data = sc.nextInt();
                    q.insertAtRear(data);
                    break;
                case "2":
                    int frontData = q.deleteAtFront();
                    if (frontData != -1) {
                        System.out.println("Delete at front : " + frontData);
                    }
                    break;
                case "3":
                    System.out.print("Enter data : ");
                    data = sc.nextInt();
                    q.insertAtFront(data);
                    break;
                case "4":
                    int rearData = q.deleteAtRear();
                    if (rearData != -1) {
                        System.out.println("Delete at rear : " + rearData);
                    }
                    break;
                case "5":
                    q.display();
                    break;
                case "-1":
                    System.out.println("Exiting the loop");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

class Queue {
    int front = -1, rear = -1, size;
    int[] arr;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void insertAtRear(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow");
            return;
        } else {
            rear = (rear + 1) % size;
            arr[rear] = data;
            if (front == -1) {
                front = rear;
            }
        }
    }

    public int deleteAtFront() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return data;
    }

    public void insertAtFront(int data) {
        if (front == -1) {
            front = 0;
            rear = 0;
            arr[front] = data;
        } else if (front == 0) {
            if (rear == size - 1) {
                System.out.println("Queue Overflow");
            } else {
                front = size - 1;
                arr[front] = data;
            }
        } else {
            front--;
            arr[front] = data;
        }
    }

    public int deleteAtRear() {
        if (rear == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = arr[rear];
        if (rear == front) {
            rear = -1;
            front = -1;
        } else {
            rear = (rear - 1 + size) % size;
        }
        return data;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(arr[i]);
            if (i == rear) {
                break;
            }
            System.out.print(", ");
            i = (i + 1) % size;
        }
        System.out.println();
    }
}
