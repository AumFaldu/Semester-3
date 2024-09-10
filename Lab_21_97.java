//Quick Sort
import java.util.Scanner;

public class Lab_21_97{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter value of arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The sorted array is : ");
        quickSort(arr,0,n-1);
        for(int num:arr){
            System.out.println(num);
        }
    }
    private static void quickSort(int[] arr,int LB,int UB){
        boolean flag=true;
        if(LB<UB){
            int i=LB;
            int j=UB+1;
            int key=arr[LB];
            while(flag==true){
                i=i+1;
                while (arr[i]<key) { 
                    i=i+1;        
                }
                j=j-1;
                while(arr[j]>key){
                    j=j-1;
                }
                if(i<j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else{
                    flag=false;
                }
            }
            int temp=arr[LB];
            arr[LB]=arr[j];
            arr[j]=temp;
            quickSort(arr,LB,j-1);
            quickSort(arr,j+1,UB);
            }
            return;
        }
}
