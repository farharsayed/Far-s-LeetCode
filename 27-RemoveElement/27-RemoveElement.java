// Last updated: 03/07/2025, 07:14:31
class Solution {
    public int removeElement(int[] nums, int val) {
        

        //remove all of vals from array nums

        int l = nums.length;
        int c = 0;
        int count = 0;

        for(int a = 0; a<l; a++)
        {
            
            if(nums[a] == val)
            {
  
                
                count++;
                for(int b = a; b<(l-1); b++)
                {
                    nums[b] = nums[b+1];
                }
                  nums[l-1] = val+1;
             a--;
    
             
            }
            
        }
int r = nums.length-count;
    return r;

    }
}