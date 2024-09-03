import java.util.Scanner;

public class bit_is_set_or_not {

    public static int isSet(int num, int i) {
        num >>= (i - 1);
        return num & 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();

        System.out.println(isSet(inp, 2));

        scanner.close();
    }
}
