package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.
Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],
A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/
class ThreeSum {
    /*
    我们不妨先对数组排个序。排序之后，我们就可以对数组用两个指针分别从前后两端向中间扫描了，
    如果是 2Sum，我们找到两个指针之和为target就OK了，
    那 3Sum 类似，我们可以先固定一个数，然后找另外两个数之和为第一个数的相反数就可以了。
     */
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);

        for (int i = 0; i < num.length-2; i++) {
            if (i > 0 && num[i] == num[i-1]) continue;
            find(num, i+1, num.length-1, num[i]); //寻找两个数与num[i]的和为0
        }

        return result;
    }

    public void find(int[] num, int left, int right, int target) {
        int l = left, r = right;
        while (l < r) {
            if (num[l] + num[r] + target == 0) {
                List<Integer> ans = new ArrayList<Integer>();
                ans.add(target);
                ans.add(num[l]);
                ans.add(num[r]);
                result.add(ans); //放入结果集中
                //数组中有相等的数时
                while (l < r && num[l] == num[l+1]) l++;
                while (l < r && num[r] == num[r-1]) r--;
                l++;
                r--;
            } else if (num[l] + num[r] + target < 0) {
                l++;
            } else {
                r--;
            }
        }
    }
}
