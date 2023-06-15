package Easy;

public class MergeTwoSortedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this(val); this.next = next; }
    }

    static class Solution {
        private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    list1.next = mergeTwoLists(list1.next, list2);
                    return list1;
                } else {
                    list2.next = mergeTwoLists(list1, list2.next);
                    return list2;
                }
            }

            if (list1 == null) {
                return list2;
            }

            return list1;
        }

        public static void main(String[] args) {

            ListNode list1 = new ListNode(1, new ListNode(5, new ListNode(20)));
            ListNode list2 = new ListNode(2, new ListNode(10, new ListNode(15)));

            ListNode merged = mergeTwoLists(list1, list2);

            // Testing with debug mode
            System.out.println();
        }
    }
}