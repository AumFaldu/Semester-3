import java.util.Scanner;
public class Lab_9_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Queue : ");
        int size = sc.nextInt();
        Queue q = new Queue(size);
        String choice = "";
        int data=0;
        while(!choice.equals("-1")){
            System.out.println("Enter 1 for enqueue : ");
            System.out.println("Enter 2 for dequeue : ");
            System.out.println("Enter 3 for display : ");
            System.out.println("Enter -1 to exit : ");
            choice = sc.next();
            switch(choice){
                case "1":
                System.out.print("Enter data : ");
                data = sc.nextInt();
                q.enqueue(data);
                break;
                case "2":
                System.out.print(""+q.dequeue());
                break;
                case "3":
                q.display();
                break;
                case "-1":
                System.out.println("Exiting the loop");
                return;
            }
        }

    }
}
class Queue{
    int front=-1,rear=-1,size;
    int[] arr;
    public Queue(int size){
        this.size = size;
        arr = new int[size];
    }
        public void enqueue(int data){
            if(rear>=size-1){
                System.out.println("Queue Overflow");
                return;
            }
            else{
                rear++;
                arr[rear] = data;
            }
            if(front==-1){
                front=0;
            }
        }
        public int dequeue(){
            if(front == -1){
                System.out.println("Queue Underflow");
                return -1;
            }
            if(front == rear){
                front = -1;
                rear = -1;
                return -1;
            }
           int data = arr[front];
           front++;
           return data;
        }
        public void display(){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
}
