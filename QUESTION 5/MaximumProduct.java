import java.util.Arrays;

public class MaximumProduct {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        
        int maxProduct1 = nums[length - 1] * nums[length - 2] * nums[length - 3];
        int maxProduct2 = nums[0] * nums[1] * nums[length - 1];
        
        return Math.max(maxProduct1, maxProduct2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int maxProduct = maximumProduct(nums);
        System.out.println(maxProduct);
    }
}
