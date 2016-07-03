package renwu;

class ListNode
{
   int val;
   ListNode next;
   ListNode()
   {
	   
   }
   ListNode(int x)
   {
	   this.val = x;
   }
}
public class Solution2
{
	 public void printNode(ListNode head)
	   {
		   if(head != null)
		   {
		   System.out.println(head.val);
		   ListNode node = head.next;
		   printNode(node);
	       }
	   }
	   public void delete(ListNode head,int x)
	   {
		   while(head != null)
		   {
			   if(head.val == x)
			   {
				   deleteNode(head);
			   }
			   else
			   {
				   System.out.println(head.val);
				   head = head.next;
			   }
		   }
		   printNode(head);
	   }
	   public void deleteNode(ListNode node)
	   {
		   node.val = node.next.val;
		   node.next = node.next.next;
	   }
	   public static void main(String[] args)
	{
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;	
        Solution2 test = new Solution2();
        test.delete(node1,3);
		
	}	   
}