package Basic;
import java.util.Scanner;

public class Loop {

    // Palindrome logic
    static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int num) {
        if (num < 0) return false;
        return num == reverse(num);
    }

    // Fibonacci series up to n terms
    static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Armstrong number check (e.g., 153 = 1³ + 5³ + 3³)
    static boolean isArmstrong(int num) {
        if (num < 0) return false;

        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Palindrome Check");
        System.out.println("2. Fibonacci Series");
        System.out.println("3. Armstrong Check");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int palNum = sc.nextInt();
                if (isPalindrome(palNum)) {
                    System.out.println(palNum + " is a palindrome number.");
                } else {
                    System.out.println(palNum + " is not a palindrome number.");
                }
                break;

            case 2:
                System.out.print("Enter the number of terms: ");
                int terms = sc.nextInt();
                printFibonacci(terms);
                break;

            case 3:
                System.out.print("Enter a number: ");
                int armNum = sc.nextInt();
                if (isArmstrong(armNum)) {
                    System.out.println(armNum + " is an Armstrong number.");
                } else {
                    System.out.println(armNum + " is not an Armstrong number.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
