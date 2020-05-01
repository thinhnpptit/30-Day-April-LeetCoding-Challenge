import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    // Leet 7
    public int countElements(int[] arr) {
        int count = 0;

        Set<Integer> set = new HashSet<>();

        if (arr.length < 1 || arr.length > 1000)
            return 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] > 1000)
                return 0;
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] + 1)){
                count ++;
            }
        }

        return count;
    }
}
