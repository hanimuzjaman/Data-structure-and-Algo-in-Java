import java.util.Arrays;
import java.util.Scanner;

class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 7, 3, 6, 3 };
        System.out.print("This is the array: " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter target element: ");
        int n = sc.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == n) {
                System.out.print("Your target element index is: " + i);
                break;
            }
        }
        sc.close();
    }
}
