package LeetCode.Array;

/*
Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of
nums being 1 and 2 respectively. It doesn’t matter what you leave
beyond the new length.
 */
public class RemoveDuplicatesFromSortedArray {
    /*
    思路是两个指针i，j，指针i遍历数组，每当nums[i]和nums[j]不同时，j就往前移动一格然后num[i]的值赋予给nums[j]
     */
    public int removeDuplicates(int[] nums) {
        int j =0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] != nums[j])
                nums[++j]= nums[i];
        }
        return j+1;
    }
}
