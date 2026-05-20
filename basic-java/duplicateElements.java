class duplicateElements {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 2, 3, 1, 5, 3, 5, 2, 4, 2, 5, 7 };

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }

            if (!alreadyPrinted && count > 1) {
                System.out.println(arr[i] + " has duplicate: " + (count - 1));
            }
        }
    }
}
