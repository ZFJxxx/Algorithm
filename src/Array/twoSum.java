package Array;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution.

Example:
Given numbers = [2, 7, 11, 15], target = 9,
Because numbers[0] + numbers[1] = 2 + 7 = 9,
return [0, 1].
 */

class TwoSum {
   /*
   1.利用HashMap只能存储不能重复对象的原理，新建一个HashMap，从第一个开始循环，HashMap里面放 键为target-每个数的结果 值为下标.
   2.然后从numbers[0]开始，然后讯问target-numbers[0]是否存在于HashMap。
   3.存在就返回result，不存在就把number[0]和其下标加入HashMap
   */
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[0] = map.get(target - numbers[i]);
                result[1] = i;
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
