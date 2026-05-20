import java.util.Scanner;

class positiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        String result = (a < 0) ? "It is negative number ." : (a > 0 ? "It is positive number ." : "It is Zero");
        System.out.print(result);
        sc.close();
    }
}
