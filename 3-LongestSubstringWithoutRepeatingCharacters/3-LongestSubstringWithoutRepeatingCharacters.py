# Last updated: 03/07/2025, 07:14:37
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l, r = 0, 0
        maxlen = 0
        charSet = set() #store every char here to ensure no duplicate chars

        #r will change with every character

        for r in range(len(s)): 
            #range is used when value is number, for string you just do "for i in str"
            while(s[r] in charSet):
                charSet.remove(s[l])
                l+=1
            
            charSet.add(s[r])
            maxlen = max(maxlen,len(charSet))
        return maxlen



        