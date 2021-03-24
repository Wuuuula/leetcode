import java.util.ArrayList;
import java.util.HashMap;

public class leetcode_1480 {
    /**
     *  1480. 一维数组的动态和
     *
     *  给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     *
     *  请返回 nums 的动态和。
     */

    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                a[i] = nums[i];
            }else{
                a[i] = a[i-1] +nums[i];
            }
        }
        return a;
    }
}
