import java.util.Scanner;
public class Lab_19_92{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value of arr["+i+"]");
            arr[i] = sc.nextInt();
        }
        bubble_sort(arr);
        System.out.println("Sorted Array using Bubble sort : ");
        for(int i=0;i<n;i++){
            System.out.println("arr["+i+"] : "+arr[i]);
        }
    }
    private static void bubble_sort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
