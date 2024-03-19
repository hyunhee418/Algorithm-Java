public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(9)));

        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));
        ListNode result = addTwoNumbers(list1, list2);
        while (result != null) {
            System.out.print(result.val+",");
            result = result.next;
        }

        System.out.println(addTwoNumbers(list1, list2));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int plus = (l1.val + l2.val) / 10;
        ListNode temp = new ListNode((l1.val + l2.val) % 10);
        ListNode result = temp;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null && l2 != null) {
            temp.next = new ListNode((l1.val + l2.val + plus)  % 10);
            plus = (l1.val + l2.val + plus)  / 10;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l2 != null) {
            temp.next = new ListNode((l2.val + plus)  % 10);
            temp = temp.next;
            plus = (l2.val + plus)  / 10;
            l2 = l2.next;
            while (l2 != null) {
                temp.next = new ListNode((l2.val + plus)  % 10);
                temp = temp.next;
                plus = (l2.val + plus)  / 10;
                l2 = l2.next;
            }
        } else if (l1 != null) {
            temp.next = new ListNode((l1.val + plus)  % 10);
            temp = temp.next;
            plus = (l1.val + plus)  / 10;
            l1 = l1.next;
            while (l1 != null) {
                temp.next = new ListNode((l1.val + plus)  % 10);
                temp = temp.next;
                plus = (l1.val + plus)  / 10;
                l1 = l1.next;
            }
        }
        if (plus != 0) temp.next = new ListNode(plus);
        return result;
    }
}
