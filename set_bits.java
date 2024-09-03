public class set_bits {

    public static int findSet(int num) {
        int count = 0;
        while (num != 0) {
            count += (num & 1);
            num >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int inp = scanner.nextInt();
        System.out.println(findSet(inp));
        scanner.close();
    }
}
