import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        double sqr = Math.sqrt(n);
        for (int i = 2; i <= sqr; i++) {
            if (n % i == 0) {
                System.out.println("The number " + n + " is not Prime!");
                break;
            } else {
                System.out.println("The number " + n + " is Prime!");
                break;
            }
        }
        sc.close();
    }
}
