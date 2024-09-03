public class set_ith {

    public static int setBit(int num, int i) {
        return num | (1 << (i - 1));
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int inp = scanner.nextInt();
        System.out.println(setBit(inp, 2));
        scanner.close();
    }
}
