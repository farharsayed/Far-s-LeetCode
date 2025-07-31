// Last updated: 31/07/2025, 19:31:26
// v fast v nice
class Solution {
    public int majorityElement(int[] nums) {
        //hash map to conotain unique elements and their frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        int val = (int)Math.floor(nums.length/2);
        for(int a = 0; a<nums.length; a++)
        {
          
             if(map.containsKey(nums[a]))
        {
            map.put (nums[a], map.get(nums[a])+1);
        }
        else
        {
            map.put(nums[a], 1);
        }
        }
        for(int a = 0; a<nums.length; a++)
        {
            if(map.containsKey(nums[a])&& map.get(nums[a])>val)
            {
                return nums[a];
            }
        }
        return 0;
    }
}