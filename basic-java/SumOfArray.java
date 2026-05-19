import java.util.Arrays;
import java.util.Scanner;

class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; // initialize an empty array of element number n
        int sum = 0;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("The sum of array elements is: " + sum);
        sc.close();
    }
}
