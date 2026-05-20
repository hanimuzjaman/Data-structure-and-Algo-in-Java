class SumOfDigits {
    public static void main(String[] args) {
        int n = 4546363;
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.print("The sum of digit of " + n + " is: " + sum);
    }
}
