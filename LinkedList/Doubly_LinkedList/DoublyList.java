package doublyLinkedList;

public class DoublyList {
	DoublyNode head;
	DoublyNode tail;
	
	public DoublyList() {
		// TODO Auto-generated constructor stub
		this.head=null;
		this.tail=null;
	}
	public boolean isEmpty() {
		
		if(this.head == null)
			return true;
		return false;
	}
	
	public int getLength() {
		
		DoublyNode temp = this.head;
		int length=0;
		while(temp!=null) {
			length++;
			temp = temp.nextPointer;
		}
		return length;
	}
	
	public void traverse() {
		if(isEmpty())
			System.out.println("Empty List!");
		
		DoublyNode temp = this.head;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.nextPointer;
		}
		System.out.println("");
	}
	
	public void reverseTraverse() {
		if(isEmpty())
			System.out.println("Empty List!");
		
		DoublyNode temp = this.tail;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.prevPointer;
		}
		System.out.println("");
	}
	
	public void traverseRecursive(DoublyNode node) {
		if(node==null) {
			System.out.println("");
			return;
		}
		System.out.print(node.data + " ");
		traverseRecursive(node.nextPointer);
	}
	
	public void traverseRecursiveReverse(DoublyNode node) {
		if(node==null) {
			System.out.println("");
			return;
		}
		traverseRecursiveReverse(node.nextPointer);
		System.out.print(node.data + " ");
	}
}
