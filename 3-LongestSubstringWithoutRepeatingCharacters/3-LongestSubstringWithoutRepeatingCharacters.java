// Last updated: 03/07/2025, 07:14:39
class Solution {
    public int lengthOfLongestSubstring(String s) {
/** 
        int max = 0;
        String best = "";
        String current = "";
        ArrayList<Character> chars = new ArrayList<Character>();


 if (s == null || s.length() == 0) {
            return 0; // Edge case: empty string
        }
boolean first = true;

        for(int a = 0; a<s.length(); a++)
        {
            

            if(!chars.contains(s.charAt(a)))
            {
             current = current.concat(String.valueOf(s.charAt(a)));
            chars.add(s.charAt(a));
            if(first == true)
            {
                max = current.length();
                best = current;
            }
            }
            else if (chars.contains(s.charAt(a)))
            {
                first = false;
                if(max<current.length())
                {
                max = current.length();
                best = current;
                }
                current = "";
                chars.clear();
               
                current = current.concat(String.valueOf(s.charAt(a)));
            chars.add(s.charAt(a));
            }
            

            if(a == s.charAt(a)-1)
            {
                if(max < current.length())
                {
                    max = current.length();
                    best = current;
                }
            }

        }
        return max;
*/
        if (s == null || s.length() == 0) {
            return 0; // Edge case: empty string
        }

        HashSet<Character> seen = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the set, remove characters from the left until it is not in the set
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set and update max length
            seen.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
   
    }
}








