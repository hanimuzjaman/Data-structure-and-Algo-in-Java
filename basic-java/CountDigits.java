import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            count += 1;
            n = n / 10;
        }
        System.out.println("The number of digit is: " + count);
        sc.close();
    }
}
