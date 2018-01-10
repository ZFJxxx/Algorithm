package LeetCode.Array;
/*
Follow up for “Remove Duplicates”:
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn’t matter what you leave beyond the new length.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int i,j;
        for(i=2,j=2 ; i<nums.length;i++)
            if(nums[j-2]!=nums[i])
                nums[j++]=nums[i];
        return j;
    }
}
