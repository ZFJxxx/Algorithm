package LeetCode.Array;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.


 */
public class MoveZeros {
    /*
    要求很简单，把数组中所有的0元素移到数组最后面去。
    我的思路是，两个指针i,j指向头部，指针i遍历，每当遇到不为零的数就赋值给Nums[j]，最后将指针j后面全部赋予0值就行了。
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int j = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] != 0)  nums[j++] = nums[i];
        }

        while(j < nums.length){
            nums[j++] = 0;
        }
    }
}
