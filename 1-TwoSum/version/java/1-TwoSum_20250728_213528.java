// Last updated: 28/07/2025, 21:35:28
// hashmap version
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //we have an array nums 
        //and an int target
        //need to return 2 nos from nums that add up to target
        
        //hashmap version - uses complement
        //complement = target-values

        HashMap<Integer, Integer> map = new HashMap<>();
        int comp = 0;
        for(int a = 0; a<nums.length;a++)
        {
            comp = target - nums[a];
            
            if(map.containsKey(comp))
            return new int[] {map.get(comp), a};
            map.put(nums[a], a);
        }
        return new int[] {};

    }}