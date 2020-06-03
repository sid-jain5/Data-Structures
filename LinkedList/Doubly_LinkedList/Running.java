package doublyLinkedList;

public class Running {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a doubly linked list
		int[] a = new int[]{2,4,5,8,7,6,5}; //elements to be inserted in list
		DoublyList dl1 = new DoublyList(); //insert elements at last
//		
		for(int i=0; i<a.length; i++) {
			dl1.head = Insertion.insertAtLast(dl1, a[i]);
		}
		
//		System.out.println("Number of elements added in list1 are: " + dl1.getLength());
//		
//		System.out.println("****** List1 ******");
		dl1.traverse();
//		System.out.println("****** List1 reverse ******");
//		dl1.reverseTraverse();
//		
		dl1.head = Insertion.insertAfter(dl1, 11, 8);
//		System.out.println("Adding 11 after 8");
//		System.out.println("****** List1 ******");
		dl1.traverse();
//		
		dl1.head = Insertion.insertBefore(dl1, 12, 2);
//		System.out.println("Adding 12 before 2");
//		System.out.println("****** List1 ******");
		dl1.traverse();
//		
		dl1.head = Insertion.insertAtPosition(dl1, 62, dl1.getLength()+1);
//		System.out.println("Adding 62 at last position");
//		System.out.println("****** List1 ******");
		dl1.traverse();
		
		QuickSort.quickSort(dl1);
		dl1.traverse();
		
		
//		System.out.println("before reversal");
//		dl1.traverse();
//		
//		dl1.head = ReverseList.reverseDoublyList(dl1);
//		System.out.println("after first reversal");
//		dl1.traverse();
//		
//		dl1.head = ReverseList.reverseDoublyList(dl1);
//		System.out.println("after second reversal");
//		dl1.traverse();
		
//		dl1.head = Deletion.deleteData(dl1, 11);
//		dl1.traverse();
//		dl1.head = Deletion.deleteData(dl1, 71);
//		dl1.traverse();
//		dl1.head = Deletion.deleteData(dl1, 62);
//		dl1.traverse();
//		dl1.head = Deletion.deleteData(dl1, 12);
//		dl1.traverse();
//		
//		System.out.println("Head after deletion is " + dl1.head.data + " and tail after deletion is " + dl1.tail.data);
		
//		DoublyList dl2 = new DoublyList(); //insert elements at front
//		if(dl2.isEmpty())
//			System.out.println("Second list empty check -- printed if empty");
//		
//		for(int i=0; i<a.length; i++) {
//			dl2.head = Insertion.insertAtHead(dl2, a[i]);
//		}
//		
//		System.out.println("****** List2 ******");
//		dl2.traverse();
//		System.out.println("****** List2 reverse ******");
//		dl2.reverseTraverse();
		
//		DoublyList dl3 = new DoublyList(); //insert elements in sorted order
//		
//		for(int i=0; i<a.length; i++) {
//			dl3.head = Insertion.sortedInsert(dl3, a[i]);
//		}
//		
//		System.out.println("****** List3 ******");
//		dl3.traverse();
//		System.out.println("****** List3 reverse ******");
//		dl3.reverseTraverse();
	}

}
