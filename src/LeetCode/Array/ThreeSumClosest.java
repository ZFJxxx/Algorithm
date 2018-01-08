package LeetCode.Array;

import java.util.Arrays;
/*
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

For example, given array S = {-1 2 1 -4}, and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumClosest {
    /*
    和 3Sum问题 很像，与之不同的是，不再是求三个数的和是不是为0，而是看三个数的和与target的差是否为最小，只需记录当前最优解并不断更新其值就可。
    也是选定一个数，然后从排好序的数组两端开始相加
    注意，closest也就是其差值的绝对值。
     */
    public int threeSumClosest(int[] num, int target) {
        int result = num[0] + num[1] + num[num.length - 1];
        Arrays.sort(num);   //排序
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1, end = num.length - 1;
            while (start < end) {
                int sum = num[i] + num[start] + num[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                //找出最小值
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
