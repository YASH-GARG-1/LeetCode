/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode head, curr, temp, list1, list2;
    list1 = l1;
    list2 = l2;
    head = curr = temp = null;
    while (list1 != null || list2 != null || carry != 0) {
      int value1 = list1 != null ? list1.val : 0;
      int value2 = list2 != null ? list2.val : 0;
      list1 = list1 != null ? list1.next : null;
      list2 = list2 != null ? list2.next : null;
      int total = value1 + value2 + carry;
      if (head == null) {
        head = new ListNode(total % 10);
        curr = head;
        carry = total / 10;
      } else {
        temp = new ListNode(total % 10);
        carry = total / 10;
        curr.next = temp;
        curr = temp;
      }
    }

    return head;
  }
}