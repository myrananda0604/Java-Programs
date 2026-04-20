import java.util.Scanner;

class LogicPrograms {

    // Factorial
    static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        System.out.println("Factorial = " + fact);
    }

    // Armstrong
    static void armstrong(int n) {
        int temp = n, sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += r * r * r;
            n /= 10;
        }
        if (sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }

    // Palindrome
    static void palindrome(int n) {
        int temp = n, rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        if (rev == temp)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    // Fibonacci
    static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    // Pattern
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Factorial");
        System.out.println("2. Armstrong");
        System.out.println("3. Palindrome");
        System.out.println("4. Fibonacci");
        System.out.println("5. Pattern");

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        switch (ch) {
            case 1: factorial(n); break;
            case 2: armstrong(n); break;
            case 3: palindrome(n); break;
            case 4: fibonacci(n); break;
            case 5: pattern(n); break;
            default: System.out.println("Invalid choice");
        }
    }
}