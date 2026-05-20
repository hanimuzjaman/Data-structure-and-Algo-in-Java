import java.util.Arrays;
import java.util.Scanner;

class creatwArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array element number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int element = 0;
        for (int i = 0; i < n; i++) {
            element = sc.nextInt();
            arr[i] = element;
        }
        System.out.print("Array is: " + Arrays.toString(arr));
        sc.close();
    }
}
