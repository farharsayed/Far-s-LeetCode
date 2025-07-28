// Last updated: 28/07/2025, 21:49:15
// using hashmap but not the best runtime
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map_s = new HashMap<>();
        HashMap<Character, Integer> map_t = new HashMap<>();

        if(s.length()!=t.length())
        return false;

        for(int a = 0; a<s.length();a++)
        {
            if(map_s.containsKey(s.charAt(a)))
                map_s.put(s.charAt(a),map_s.get(s.charAt(a))+1);
            else
                map_s.put(s.charAt(a),1);
            if(map_t.containsKey(t.charAt(a)))
                 map_t.put(t.charAt(a),map_t.get(t.charAt(a))+1);
            else
                map_t.put(t.charAt(a),1);
        }
        if(map_s.equals(map_t))
        return true;
        else
        return false;


    }
}