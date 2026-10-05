import java.util.*;
public class GroupAnagrams
{
    public List<List<String>> groupAnagrams(String strs[])
    {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String word : strs)
        {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if(!map.containsKey(s))
            {
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args)
    {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new GroupAnagrams().groupAnagrams(strs));
    }
}