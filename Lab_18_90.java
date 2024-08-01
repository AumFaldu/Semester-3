import java.util.Scanner;
public class Lab_18_90{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of element you want to search : ");
        int search = sc.nextInt();
        for(int index=0;index<n;index++){
            if(arr[index] == search){
                System.out.println("Element found at index " + index);
                return;
            }
        }
            System.out.println("Cannot be found");
    }
}