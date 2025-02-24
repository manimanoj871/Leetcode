/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
      int length=0;
      if(head.next==null)
      return null;
      ListNode th=head;
      while(th!=null)
      {
        length++;
        th=th.next;
      }
      int mid=length/2;
      length=1;
      th=head;
      while(mid!=length)
      {
        length++;
        th=th.next;
      }
      th.next=th.next.next;
      return head;
    }
}