import java.util.Arrays;
import java.util.Scanner;

class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array" + Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
