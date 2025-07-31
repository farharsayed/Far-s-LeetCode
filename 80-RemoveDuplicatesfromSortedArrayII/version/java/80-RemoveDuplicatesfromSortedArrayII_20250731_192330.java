// Last updated: 31/07/2025, 19:23:30
// ez
class Solution {
    public int removeDuplicates(int[] nums) {

        //hashmap to store unique digits and their frequency

        HashMap<Integer, Integer> map = new HashMap<>();

        int k = 0;
        for (int a = 0; a<nums.length; a++)
        {
            if (map.containsKey(nums[a]) && map.get(nums[a] )==2) //the element already has 2 replicas
            {
               nums[a] = -10001;
               

            }
            else if (map.containsKey(nums[a]))
            {
                map.put(nums[a], map.get(nums[a])+1);
                k++;
            }
            else
            {
                map.put(nums[a], 1);
                k++;
            }


        }
    int ptr = 0;
        for(int b = 0; b<nums.length; b++)
        {
           if(nums[b]!=-10001)
           {
            nums[ptr] = nums[b];
            ptr++;
           } 
        }
        return k;









    }
}