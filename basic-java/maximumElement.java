class maximumElement {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 12, 8, 2 };
        int n = arr.length;
        int maxElement = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
            // System.out.println("*");
        }
        System.out.print("max element is: " + maxElement);
    }
}
