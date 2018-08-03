
public class AddTwoNumbersII {
	

	 public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	 
	  public static void printList(ListNode head) {
		  ListNode temp = head;
		  while(temp != null) {
			  System.out.print(temp.val + "-> ");
			  temp = temp.next;
		  }
		  System.out.println();
	  }
	 
	 public static ListNode reverse(ListNode head) {
		 if (head == null) {
			 return null;
		 }
		 
		 if(head.next == null) {
			 return head;
		 }
		 ListNode reverse = reverse(head.next);
		 head.next.next = head;
		 head.next = null;
		 return reverse;
		 
	 }
	 
	 public static ListNode addNode(ListNode head, int val) {
		 if (head == null) {
			 return new ListNode(val);
		 }
		 else {
			 ListNode temp = head;
			 while (head.next != null) {
				 head = head.next;
			 }
			 head.next = new ListNode(val);
			 return temp;
		 }
	 }
	 
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
		 ListNode temp1 = reverse(l1);
		 ListNode temp2 = reverse(l2);
		 
		 ListNode newList = null;
		 
		 int carry = 0;
		 int digit = 0;
		 int sum = 0;
		 
		 while(temp1 != null || temp2 != null) {
			 
			 if(temp1 == null) {
				 sum = temp2.val + carry;
			 }
			 else if (temp2 == null) {
				 sum = + temp1.val + carry;
			 }
			 else {
				 sum = temp1.val + temp2.val + carry;
			 }
			 
			 if(sum >= 10) {
				 digit = sum % 10;
				 carry = 1;
			 }
			 else {
				 digit = sum;
				 carry = 0;
			 }
			 
			 newList = addNode(newList, digit);
			 
			 if(temp1 != null) {
				 temp1 = temp1.next;
			 }
			 if(temp2 != null) {
				 temp2 = temp2.next;
			 }
		 }
		 
		 if(carry > 0) {
			 newList = addNode(newList, carry);
		 }
		 
		 return reverse(newList);
	 }
	 
}
