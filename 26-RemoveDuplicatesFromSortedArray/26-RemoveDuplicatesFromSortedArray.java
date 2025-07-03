// Last updated: 03/07/2025, 07:14:33
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Empty array has no duplicates
        }

        int uniquePtr = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniquePtr]) {
                uniquePtr++;
                nums[uniquePtr] = nums[i];
            }
        }

        // Length of the subarray containing unique elements
        return uniquePtr + 1;
    }
}
