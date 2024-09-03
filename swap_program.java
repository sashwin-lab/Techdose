public class swap_program {

    public static void swap(int[] nums) {
       
        nums[0] ^= nums[1];
        nums[1] ^= nums[0];
        nums[0] ^= nums[1];
    }

    public static void main(String[] args) {
        int[] nums = {15, 40};  

        swap(nums);

        System.out.println("After Swapping a: " + nums[0] + ", b: " + nums[1]);
    }
}
