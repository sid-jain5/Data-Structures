package doublyLinkedList;

public class ReverseList {
	
	public static DoublyNode reverseDoublyList(DoublyList list) {
		
		if(list.head==null || list.head.nextPointer==null) {
			System.out.println("list empty or has only a single node");
			return list.head;
		}
		
		DoublyNode temp = list.head;
		
		while(temp!=null) {
			DoublyNode next = temp.nextPointer;
			temp.nextPointer = temp.prevPointer;
			if(temp.prevPointer==null) {
				list.tail=temp;
			}
			temp.prevPointer=next;
			
			if(next==null)
				return temp;
			temp=temp.prevPointer;
			
		}
		
		return temp;
	}
}
