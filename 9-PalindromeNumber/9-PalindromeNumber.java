// Last updated: 03/07/2025, 07:14:29
//Palindrome Number
// Given an integer x, return true if x is a palindrome, and false otherwise.
// Follow up: Could you solve it without converting the integer to a string?

class Solution {
    public boolean isPalindrome(int x) {
        //x is given int

        String s = String.valueOf(x);
        int l = s.length();

        while(l>1)
        {
            if(Integer.valueOf(s.charAt(0))!=Integer.valueOf(s.charAt(l-1)))
            return false;
            s=s.substring(1,l-1);
            l = s.length();
        }
        return true;






        // doesn't work for 1000xyz as when you remove the first 1 in the first iteration, it goes to xyz and doesn't check
        // int l = String.valueOf(x).length();
        // l-=1;
        // if(x<0)
        // return false;
        // while(x>9)
        // {
        //     if((int)(x/Math.pow(10,l))!=x%10)
        //     {
        //         return false;
        //     }
        //     x%=Math.pow(10,l);
            
        //     x/=10;
        //     l = String.valueOf(x).length()-1;
        // }
        // return true;
    }
}