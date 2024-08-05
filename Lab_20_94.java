import java.util.Scanner;
public class Lab_20_94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value of arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
            selection_sort(arr);
            System.out.println("sorted array using Selection sort");
            for(int i=0;i<n;i++){
                System.out.println("arr["+i+"] = "+arr[i]);
            }
    }
    private static void selection_sort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp = a[i];
                a[i] = a[min_index];
                a[min_index] = temp;
            }
        }
    }
}
