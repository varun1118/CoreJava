package oct12;

import java.util.Arrays;

public class SwapArrays {
    public static void main(StringDemo[] args) {
        int[] arr = {10,20,30,40,50,60,70};

        int[] nums = new int[arr.length];
        int index=0;
        for (int i = (nums.length-1); i >= 0; i--) {
            nums[index]=arr[i];
            index++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
