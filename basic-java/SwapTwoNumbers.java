class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // using a temporary variable
        // int temp;
        // temp = a;
        // a = b;
        // b = temp;

        // without using a temporary variable
        // a = a + b;
        // b = a - b;
        // a = a - b;

        // Using ZOR operator
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
