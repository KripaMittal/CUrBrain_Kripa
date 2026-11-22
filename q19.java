import java.util.*;
public class Q19 {
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) return;
        int n = nums.length;
        k = k % n;
        if (k == 0) return;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    public static void main(String[] args) {
        int[][] inputs = {{1,2,3,4,5,6,7},{-1,-100,3,99},{1,2},{1},{1,2,3}};
        int[] ks = {3,2,5,10,0};
        for (int i = 0; i < inputs.length; i++) {
            rotate(inputs[i], ks[i]);
            System.out.println(Arrays.toString(inputs[i]));
        }
    }
}