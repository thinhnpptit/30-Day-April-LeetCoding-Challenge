import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> mySet = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            int current = n;
            while (current != 0) {
                sum += (current % 10) * (current % 10);
                current /= 10;
            }
            if (mySet.contains(sum))  // loop endlessly in a circle
                return false;
            mySet.add(sum);
            n = sum;
        }
        return true;
    }
}
