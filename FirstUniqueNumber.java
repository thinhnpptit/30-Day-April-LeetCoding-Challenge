import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueNumber {
    // Leet 28

    HashMap<Integer, Integer> map;
    Queue<Integer> queue;

    public void FirstUnique(int[] nums) {
        map = new HashMap<>();
        queue = new LinkedList<>();

        for (int num : nums)
            add(num);
    }

    public int showFirstUnique() {
        while (!queue.isEmpty()) {
            int num = queue.peek();     // get and remove first element from queue
            int freq = map.get(num);    // get time number of num
            if (freq > 1){
                queue.poll();
            } else {
                return num;
            }
        }
        return -1;
    }

    public void add(int value) {
        if (map.containsKey(value)){
            map.put(value, map.get(value) +1);  // increase time + 1 if appearing more than 1 time in map
        } else {
            map.put(value, 1);          // time of num = 1
            queue.add(value);
        }
    }
}
