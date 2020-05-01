public class MiddleOfTheLinkedList {
    public static MiddleOfTheLinkedList ListNode;

    public MiddleOfTheLinkedList(){}
    public MiddleOfTheLinkedList(MiddleOfTheLinkedList.ListNode listNode) {

    }

    // Leet 8
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){ val = x;}

        // add node to the LinkedList
//        public void addNode(ListNode currentHead, int x) {
//            ListNode current = currentHead.next;
//            while (current != null) {
//                current.next = new ListNode(x);
//            }
//        }
    }
    public ListNode middleNode(ListNode head){
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        if (fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }
}
