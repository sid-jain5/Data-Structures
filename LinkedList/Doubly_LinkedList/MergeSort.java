package doublyLinkedList;

public class MergeSort {
	
	public static DoublyNode findMiddle(DoublyNode start) {
		if(start==null)
			return null;
		
		DoublyNode slowPointer=start;
		DoublyNode fastPointer=start;
		
		while(fastPointer.nextPointer!=null && fastPointer.nextPointer.nextPointer!=null) {
			slowPointer = slowPointer.nextPointer;
			fastPointer = fastPointer.nextPointer.nextPointer;
		}
		
		return slowPointer;
	}
	
	public static DoublyNode merge(DoublyNode leftStart, DoublyNode rightStart) {
		if(leftStart==null)
			return rightStart;
		if(rightStart==null)
			return leftStart;
		
		if(leftStart.data<rightStart.data) {
			leftStart.nextPointer = merge(leftStart.nextPointer, rightStart);
			leftStart.nextPointer.prevPointer = leftStart;
			leftStart.prevPointer=null;
			return leftStart;
		}
		else {
			rightStart.nextPointer = merge(leftStart, rightStart.nextPointer);
			rightStart.nextPointer.prevPointer = rightStart;
			rightStart.prevPointer=null;
			return rightStart;
		}
	}
	
	public static DoublyNode mergeSortImpl(DoublyNode start) {
		
		if(start==null || start.nextPointer==null)
			return start;
		
		DoublyNode middleNode = findMiddle(start);
		DoublyNode rightStart = middleNode.nextPointer;
		//System.out.println("second list starts from:" + rightStart.data);
		middleNode.nextPointer=null;
		
		DoublyNode left = mergeSortImpl(start);
		DoublyNode right = mergeSortImpl(rightStart);
		
//		DoublyNode x = merge(left, right);
//		System.out.println("after merge");
//		DoublyNode temp = x;
//		while(temp!=null) {
//			System.out.print(temp.data + " ");
//			temp = temp.nextPointer;
//		}
//		System.out.println("");
		
		return merge(left, right);
	}
	
	public static DoublyNode mergeSort(DoublyList list) {
		if(list.head==null || list.head.nextPointer==null)
			return list.head;
		
		return mergeSortImpl(list.head);
	}
}
