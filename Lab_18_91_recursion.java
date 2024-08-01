//Using Recursion
import java.util.Scanner;
public class Lab_18_91_Recursion {
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
        System.out.print("Element is found at "+Binary_Search(arr,low,high,search)+" index");
    }
    public static int Binary_Search(int[] arr,int low,int high,int X){
        int mid=(low+high)/2;
        if(low<=high){
            if(arr[mid]==X){
                return mid;
            }
            else if(arr[mid]<X){
               return Binary_Search(arr,mid+1,high,X);
            }
            else{
              return Binary_Search(arr,low,mid-1,X);
            }
        }
        return -1;
    }
}
