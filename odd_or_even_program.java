public class odd_or_even_program {

    public static boolean findOddEven(int x) {
        return (x & 1) == 1;
    }

    public static void main(String[] args) {
        int x = 2;
        System.out.println(x + " is " + (findOddEven(x) ? "Odd Number" : "Even Number"));
    }
}
