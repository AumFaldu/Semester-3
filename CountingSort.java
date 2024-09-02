import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter value of arr[" + i + "] : ");
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] c = new int[max + 1];

        for (int i = 0; i < n; i++) {
            c[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            c[i] += c[i - 1];
        }

        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[c[arr[i]] - 1] = arr[i];
            c[arr[i]]--;
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
