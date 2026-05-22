class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 3, 7, 9, 4 };
        int[] arr2 = { 6, 5, 1, 9, 0 };
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr2[j] + " ");
                }
            }
        }
    }
}
