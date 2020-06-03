package doublyLinkedList;

public class DoublyNode {
	int data;
	DoublyNode prevPointer, nextPointer;
	
	DoublyNode(int data){
		this.data = data;
		this.prevPointer=null;
		this.nextPointer=null;
	}
}
