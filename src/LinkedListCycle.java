public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        Boolean result = hasCycle(list1);
    }

    public static boolean hasCycle(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;
        while (node2!=null && node2.next!=null) {
            node2 = node2.next.next;
            node1 = node1.next;
            if (node1 == node2) return true;
        }
        return false;
    }
}