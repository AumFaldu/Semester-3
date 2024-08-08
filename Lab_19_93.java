//Insertion Sort
import java.util.Scanner;
public class Lab_19_93{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value of element at index "+i+" : ");
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);

    }
    private static void insertionSort(int[] a){
        for(int i=1;i<a.length;i++){
            int key = a[i];
            int j=i-1;
            for(j=i-1;j>=0 && a[j]>key;j--){
                a[j+1]=a[j];
            }
            a[j+1]=key;
        }
        System.out.println("Sorted Array using insertionSort");
        for(int n:a){
            System.out.print(n+" ");
        }
    }
}