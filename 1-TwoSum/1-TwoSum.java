// Last updated: 03/07/2025, 07:14:38
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //we have an array nums 
        //and an int target
        //need to return 2 nos from nums that add up to target
        int c[] = new int[2];
        for(int a = 0; a<nums.length-1; a++)
        {
            for(int b = a+1; b<nums.length; b++)
            {
                if(nums[a]+nums[b] == target)
                {
                c[0]=a;
                c[1]=b;
                break;
                // works
            }
            }
        }
        return c;
    }
}