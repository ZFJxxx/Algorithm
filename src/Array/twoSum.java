package Array;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

class TwoSum {
   /*
   1.利用HashMap只能存储不能重复对象的原理，新建一个HashMap，从第一个开始循环，numbers[1]，然后讯问target-numbers[1]是否存在于HashMap，
   2.若能则说明数组中没有元素能与numbers[1]相加得target，把target-numbers[1]删除。
   3.然后从numbers[1]开始。。。。。。知道target-numbers[1]添加不成功时，才说明存在成立的组合。记录i，查找出target-num[i]的位置
   */
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}
