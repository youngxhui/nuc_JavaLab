package DeleteLink;

import DeleteLink.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // Write your code here
        if(head==null) return head;
        ListNode p=head,q=head.next;
        while(q!=null){
            if(q.val==val){
                p.next=q.next;
                q=q.next;
            }else {
                p=p.next;
                q=q.next;
            }
        }
        if(head.val==val)   head=head.next;
        return head;
    }
}