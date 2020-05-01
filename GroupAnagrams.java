import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    // Leet 6
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> listResult = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
             char[] chars = str.toCharArray();
             Arrays.sort(chars);
             String sorted = new String(chars);
             if (!map.containsKey(sorted))
                 map.put(sorted, new ArrayList());
             map.get(sorted).add(str);
        }
        listResult.addAll(map.values());

        return listResult;
    }
}
