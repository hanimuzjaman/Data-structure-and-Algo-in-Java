class Armstrong {
    public static void main(String[] args) {
        int n = 54748;
        int original = n;
        int sum = 0;
        int digitNo = 0;

        int temp = n;

        while (temp != 0) {
            temp = temp / 10;
            digitNo++;
        }

        temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitNo);
            temp = temp / 10;
        }

        if (original == sum) {
            System.out.print("It is Armstrong number!");
        } else {
            System.out.print("It is not Armstrong number!");
        }
    }
}
