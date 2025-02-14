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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode storenode=new ListNode(Integer.MAX_VALUE);
        ListNode headNode=storenode;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                storenode.next=list1;
                list1=list1.next;
            }
            else
            {
                storenode.next=list2;
                list2=list2.next;
            }
            storenode=storenode.next;
        }
        if(list1==null)
        {
            storenode.next=list2;
        }
        if(list2==null)
        {
            storenode.next=list1;
        }
        return headNode.next;
    }
}