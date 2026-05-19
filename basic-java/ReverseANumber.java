import java.util.Scanner;

class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reversedNumber = 0;
        while (n != 0) {
            reversedNumber = reversedNumber * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("reversed number: " + reversedNumber);
        sc.close();
    }
}
