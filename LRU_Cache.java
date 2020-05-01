import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Stack;

public class LRU_Cache {
    // Leet 24

    int _capacity;
    LinkedHashMap<Integer, Integer> map;
    public void LRUCache(int capacity) {
        _capacity = capacity;
        map = new LinkedHashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int value = map.get(key);
            map.remove(key);
            map.put(key,value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
        } else if (map.size() == _capacity) {
            map.remove(map.keySet().iterator().next());
        }
        map.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

