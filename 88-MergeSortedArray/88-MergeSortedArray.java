// Last updated: 03/07/2025, 07:14:32
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //two arrays in ascending order
        //m is length of nums1
        //n is length of nums2

        int c =  m+n;
        
        int arr[]= new int[c];

        int ptr1 = 0;
        int ptr2 = 0;
         for(int a = 0; a<c; a++)
        {
            if(ptr1<m && ptr2<n)
            {
            if (nums1[ptr1] == nums2[ptr2]) 
            {
                if(ptr1<m && ptr2<n)
                {
                arr[a] = nums1[ptr1];
                ptr1++;
                a++;
                arr[a] = nums2[ptr2];
                ptr2++;
                }
            }

            else if(nums1[ptr1]>nums2[ptr2])
            {
                if(ptr2<n)
                {
                arr[a] = nums2[ptr2];
                ptr2++;
                }
            }
            else
            {
                if(ptr1<m)
                {
                arr[a] = nums1[ptr1];
                ptr1++;
                }
            }
            }
            else if(ptr1==m)
            {
                arr[a] = nums2[ptr2];
                ptr2++;
            }
             else if(ptr2==n)
            {
                arr[a] = nums1[ptr1];
                ptr1++;
            }
            else
            {
                a = c;
            }
        }

            for(int b = 0; b<c; b++)
            {
                nums1[b]= arr[b];
            }



      //  return nums1[];


    }
    }