import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(6);
        System.out.println(queue.removeAll(arrayList));

    }
}
