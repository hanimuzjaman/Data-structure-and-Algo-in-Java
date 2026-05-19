// import java.util.Scanner;

// class largestOfThree {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int n1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int n2 = sc.nextInt();
//         System.out.print("Enter third number: ");
//         int n3 = sc.nextInt();
//         if (n1 > n2 && n1 > n3) {
//             System.out.println("The largest one is: " + n1);
//         } else if (n2 > n1 && n2 > n3) {
//             System.out.println("The largest one is: " + n2);
//         } else {
//             System.out.println("The largest one is: " + n3);
//         }
//     }
// }

import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        int largest = (n1 > n2 && n1 > n3) ? n1 : (n2 > n3 ? n2 : n3);

        System.out.println("The largest one is: " + largest);

        sc.close();
    }
}
