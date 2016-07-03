public class ListNodeSolution {
	public ListNode removeElements(ListNode head,int val)
	{
		ListNode lnx=head;
		ListNode lnn=null;
		if(lnx.val==val)
		{
			return head.next;
		}
		else while(lnx!=null)
		{
			lnn=lnx.next;
			if(lnn.val==val)
			{
				lnx.next=lnn.next;
				break;
			}
			lnx=lnx.next;
			if(lnx.next==null)
			{
				System.out.println("链表中不存在："+val);
				break;
			}
		}
		return head;
		}
}
