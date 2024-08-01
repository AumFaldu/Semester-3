//Using Loop
import java.util.Scanner;
public class Lab_18_91_loop {
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
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == search){
                System.out.println("Element is found at "+mid+" index");
                return;
            }
            else if(arr[mid]<search){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println("Cannot be found");
    }
}
