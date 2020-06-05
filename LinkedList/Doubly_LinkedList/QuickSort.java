package doublyLinkedList;

public class QuickSort {
	
	
	public static DoublyNode partition(DoublyNode start, DoublyNode end) {
		
		int pivot = end.data;
		DoublyNode exchangePoint= start.prevPointer;
		
		for(DoublyNode j=start; j!=end; j=j.nextPointer) {
			if(j.data < pivot) {
				if(exchangePoint == null)
					exchangePoint=start;
				else
					exchangePoint=exchangePoint.nextPointer;
				int temp = exchangePoint.data;
				exchangePoint.data = j.data;
				j.data = temp;
			}
		}
		
		if(exchangePoint == null)
			exchangePoint=start;
		else
			exchangePoint=exchangePoint.nextPointer;
		
		int temp = exchangePoint.data;
		exchangePoint.data = end.data;
		end.data = temp;

		return exchangePoint;
	}
	
	public static void quickSortImpl(DoublyNode start, DoublyNode end) {
		
		if(start!=end && end!=null && start!=end.nextPointer) {
			DoublyNode temp = partition(start, end);
			quickSortImpl(start, temp.prevPointer);
			quickSortImpl(temp.nextPointer, end);
		}
		
	}
	public static void quickSort(DoublyList list) {
		
		if(list.head==null || list.head.nextPointer == null) {
			System.out.println("List is either empty or has a single value");
		}
		
		quickSortImpl(list.head, list.tail);
	}
}
