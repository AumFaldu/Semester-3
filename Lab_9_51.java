import java.util.Scanner;

public class Lab_9_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Queue : ");
        int size = sc.nextInt();
        Queue q = new Queue(size);
        int data;
        String choice;
        while (true) {
            System.out.println("Enter 1 for enqueue : ");
            System.out.println("Enter 2 for dequeue : ");
            System.out.println("Enter 3 for display : ");
            System.out.println("Enter -1 to exit : ");
            choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.print("Enter data : ");
                    data = sc.nextInt();
                    q.enqueue(data);
                    break;
                case "2":
                    int dequeuedData = q.dequeue();
                    if (dequeuedData != -1) {
                        System.out.println("Dequeued: " + dequeuedData);
                    }
                    break;
                case "3":
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

    public void enqueue(int data) {
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

    public int dequeue() {
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
