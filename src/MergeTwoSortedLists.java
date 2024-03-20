public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = mergeTwoLists(list1, list2);
        while (result.next != null) {
            System.out.print(result.val+",");
            result = result.next;
        }
        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode node1 = list1;
        ListNode node2 = list2;
        ListNode node3 = result;
        while (node1 != null && node2 != null) {
            if (node2.val > node1.val) {
                node3.next = node1;
                node1 = node1.next;
            } else {
                node3.next = node2;
                node2 = node2.next;
            }
            node3 = node3.next;
        }
        if (node1 == null) {
            node3.next = node2;
        }
        if (node2 == null) {
            node3.next = node1;
        }
        return result.next;
    }
}