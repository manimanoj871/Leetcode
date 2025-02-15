/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a=getlen(headA);
        int b=getlen(headB);
        while(a>b)
        {
            a--;
            headA=headA.next;
        }
        while(b>a)
        {
            b--;
            headB=headB.next;
        }
        while(headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;

        }
        return headA;
    }
     public int getlen(ListNode head)
     {
        int c=0;
        ListNode th=head;
        while(th!=null)
        {
            c++;
            th=th.next;
        }
        return c;
     }
}