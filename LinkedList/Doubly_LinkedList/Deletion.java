package doublyLinkedList;

public class Deletion {
	//Doubly list
	
	public static DoublyNode deleteData(DoublyList list, int data) {
		
		//empty list 
		if(list.head == null) {
			System.out.println("Empty list");
			return null;
		}
		DoublyNode temp = list.head;
		//delete from beginning(head)
		if(temp.data == data) {
			temp.nextPointer.prevPointer = null;
			return temp.nextPointer;
		}
		
		//delete from anywhere in between the list
		while(temp.nextPointer!=null) {
			if(temp.data==data) {
				temp.prevPointer.nextPointer = temp.nextPointer;
				temp.nextPointer.prevPointer = temp.prevPointer;
				return list.head;
			}
			temp = temp.nextPointer;
		}
		
		//delete from last(tail node)
		if(temp.data==data) {
			temp.prevPointer.nextPointer = null;
		}
		//data not found
		System.out.println("Given data point not found");
		return list.head;
	}
}
