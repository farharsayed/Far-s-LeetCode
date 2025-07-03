// Last updated: 03/07/2025, 07:14:34
class Solution {
    public int[] runningSum(int[] nums) {
        int a = 0;
        int c[] = new int[nums.length];
        for(int b = 0; b<nums.length;b++)
        {
            a = a+nums[b];
            c[b] = a;
        }
        return c;
    }
}