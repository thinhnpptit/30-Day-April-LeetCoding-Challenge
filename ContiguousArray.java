import java.util.HashMap;

public class ContiguousArray {
    // Leet 13
    public int findMaxLength(int[] nums){
        int count = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> mapCounts = new HashMap<>();  // key = count & value = index
        mapCounts.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] == 0){
                count --;
            } else {
                count ++;
            }
            if (mapCounts.containsKey(count)) {
                maxLength = Math.max(maxLength, i - mapCounts.get(count));
            } else {
                mapCounts.put(count, i);
            }
        }

        return maxLength;
    }
}
