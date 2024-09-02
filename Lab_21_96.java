//Merge Sort
import java.util.Scanner;

public class Lab_21_96 {
    static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of elements in array : ");
        int n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value of element at index "+i+" ");
            a[i] = sc.nextInt();
        }
        mergeSort(0,n-1);
        merge(0,n/2,n-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    private static void mergeSort(int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(low,mid);
            mergeSort(mid+1,high);
            merge(low,mid,high);
        }
    }

    private static void merge(int low, int mid, int high) {
        int h=low,i=low,j=mid+1;
        int[] ans = new int[a.length];
        while(h<=mid && j<=high){
            if(a[h]<=a[j]){
                ans[i] = a[h];
                h++;
            }
            else{
                ans[i] = a[j];
                j++;
            }
            i++;
        }
        if(h>mid){
            for(int k=j;k<=high;k++){
                ans[i] = a[k];
                i++;
            }
        }
        else{
            for(int k=h;k<=mid;k++){
                ans[i] = a[k];
                i++;
            }
        }
        for(int k=low;k<=high;k++){
            a[k] = ans[k];
        }
    }
}
