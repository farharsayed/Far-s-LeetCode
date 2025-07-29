// Last updated: 29/07/2025, 08:03:54
// using hashmaps
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        //map will contain chars of magazine

        if(ransomNote.length()>magazine.length())
        return false;

        for(char a : magazine.toCharArray())
        {
            map.put(a, map.getOrDefault(a,0)+1);
        }

        for(int b = 0; b<ransomNote.length(); b++)
        {
            if(map.containsKey(ransomNote.charAt(b)) && map.get(ransomNote.charAt(b))>0)
            {
                map.put(ransomNote.charAt(b), map.get(ransomNote.charAt(b))-1);
                
            }
            else
            return false;
        }

        return true;

    }
}