class smallestElement {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 9, 7, 1 };
        int smallestElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallestElement) {
                smallestElement = arr[i];
            }
        }
        System.out.print("The smallest element is: " + smallestElement);
    }
}
