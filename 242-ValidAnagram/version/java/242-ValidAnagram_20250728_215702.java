// Last updated: 28/07/2025, 21:57:02
// hashmap diff approach but same runtime
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        if(s.length()!=t.length())
        return false;
        for(int a = 0; a<s.length(); a++)
        {
            if(map.containsKey(s.charAt(a)))
            {
                map.put(s.charAt(a), map.get(s.charAt(a))+1);
            }
            else
            map.put(s.charAt(a), 1);
            if(map.containsKey(t.charAt(a)))
            {
                map.put(t.charAt(a), map.get(t.charAt(a))-1);
            }
            else
            map.put(t.charAt(a), -1);

        }
        for (int value : map.values()) {
    if (value != 0) return false;
}
return true;

    }
}