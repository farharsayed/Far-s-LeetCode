// Last updated: 29/07/2025, 19:30:03
// using hashmaps, very very efficient
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        String s = "";
        String s2="";     
        for (int a = 0; a<strs.length; a++)
        {
            s=strs[a];
            char [] c=s.toCharArray();
            Arrays.sort(c);
            s2=String.valueOf(c);
            //now we have the sorted string
            if(map.containsKey(s2))
            {
            map.get(s2).add(s);
            //VERY COMPLEX but basically it gets the list that the sorted string refers to
            //and then adds an element to THAT LIST
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(s2,list);
        }
        }

        return new ArrayList<>(map.values());




    }
}