import java.util.PriorityQueue;

public class LastStoneWeight {
    // Leet 12
    public int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < stones.length; i++) {
            // queue is ordered by ascending
            queue.add(- stones[i]);   // add negative number because when using remove() it will get snallest number at the beginning of the queue
        }
        while (queue.size() > 1){
            int stone1 = - queue.remove();  // stone1 is largest number
            int stone2 = - queue.remove();  // stone2 is second-largest number

            if (stone1 != stone2)
                queue.add(- ( stone1 - stone2 ));
        }
        return queue.isEmpty()? 0 : queue.remove();
    }

}

