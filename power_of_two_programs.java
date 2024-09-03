import java.util.Scanner;

public class power_of_two_programs {

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();

        if (isPowerOfTwo(inp)) {
            System.out.println("Yes, it is");
        } else {
            System.out.println("No, it's not");
        }

        scanner.close();
    }
}
