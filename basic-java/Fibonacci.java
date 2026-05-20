class Fibonacci {
    static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        System.out.print(a + " ");
        fibonacci(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print("The Fibonacci series is: ");
        fibonacci(0, 1, n);
    }
}
