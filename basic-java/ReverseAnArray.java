import java.util.Arrays;

class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 4, 3 };
        int arraylength = arr.length;
        for (int i = 0; i < arraylength / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arraylength - (i + 1)];
            arr[arraylength - (i + 1)] = temp;
        }
        System.out.print("Reversed array: " + Arrays.toString(arr));
    }
}
