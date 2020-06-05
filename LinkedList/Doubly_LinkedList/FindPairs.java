package doublyLinkedList;


/*
 * https://www.geeksforgeeks.org/find-pairs-given-sum-doubly-linked-list/
 * 
 * Given a sorted doubly linked list of positive distinct elements,
 *  the task is to find pairs in doubly linked list whose sum is equal to given value x, 
 *  without using any extra space ?
 */
public class FindPairs {
	
	public static void findPairsSimple(DoublyList list, int x) {
		DoublyNode temp = list.head;
		boolean pairFound=false;
		while(temp!=null) {
			boolean otherFound = list.find(x-temp.data);
			
			if(otherFound) {
				System.out.println("pair with this sum in list is: " + temp.data + " and " + (x-temp.data));
				pairFound=true;
			}
			temp = temp.nextPointer;
		}
		
		if(!pairFound)
			System.out.println("No such pair in list");
	}
	
	public static DoublyNode lastNode(DoublyList list) {
		DoublyNode temp = list.head;
		while(temp.nextPointer != null) {
			temp = temp.nextPointer;
		}
		
		return temp;
	}
	public static void findPairs(DoublyList list, int x) {
		list.head = MergeSort.mergeSort(list);
		
		DoublyNode firstNode = list.head;
		DoublyNode secondNode = lastNode(list);
		boolean pairFound=false;
		
		while(firstNode!=null && secondNode!=null && firstNode!=secondNode && secondNode.nextPointer!=firstNode) {
			int a = firstNode.data + secondNode.data;
			if(a==x) {
				pairFound=true;
				System.out.println("pair with this sum in list is: " + firstNode.data + " and " + secondNode.data);
				firstNode=firstNode.nextPointer;
				secondNode=secondNode.prevPointer;
			}
			else if(a>x) {
				secondNode = secondNode.prevPointer;
			}
			else {
				firstNode = firstNode.nextPointer;
			}
		}
		
		if(!pairFound)
			System.out.println("No such pair in list");
		
	}
}
