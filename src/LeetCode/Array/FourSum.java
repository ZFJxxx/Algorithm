package LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note: The solution set must not contain duplicate quadruplets.

For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
 */
class FourSum {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        public List<List<Integer>> fourSum(int[] num, int target) {
            if (num == null || num.length < 4) return result;
            Arrays.sort(num);

            for (int i = 0; i < num.length-3; i++) {
                if (i > 0 && num[i] == num[i-1]) continue;
                for (int j = i+1; j < num.length-2; j++) {
                    if (j > i+1 && num[j] == num[j-1]) continue;
                    findTwo(num, j+1, num.length-1, target, num[i], num[j]);
                }
            }
            return result;
        }

        public void findTwo(int[] num, int begin, int end, int target, int a, int b) {
            if (begin < 0 || end >= num.length) return;
            int l = begin, r = end;
            while (l < r) {
                if (a+b+num[l]+num[r] < target) {
                    l++;
                } else if (a+b+num[l]+num[r] > target) {
                    r--;
                } else {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(a);
                    ans.add(b);
                    ans.add(num[l]);
                    ans.add(num[r]);
                    result.add(ans);
                    l++;
                    r--;
                    while (l < r && num[l] == num[l-1]) l++;
                    while (l < r && num[r] == num[r+1]) r--;
                }
            }
        }
}
