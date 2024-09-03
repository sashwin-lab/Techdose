import java.util.ArrayList;
import java.util.List;

public class subset_program {

    public static void sub(List<Integer> arr) {
        int n = arr.size();
        int cnt = 1 << n;

        for (int i = 0; i < cnt; i++) {
            List<Integer> subset = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(arr.get(j));
                }
            }

            System.out.print("{ ");
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        sub(arr);
    }
}
