class secondLargest {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 1, 8, 5, 6, 3 };
        int largest = 0;
        int secondlargest = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        System.out.println("Second largest: " + secondlargest);
    }
}
