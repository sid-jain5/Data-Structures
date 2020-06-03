package doublyLinkedList;

public class Insertion {
//	DoublyList list;
//	
//	Insertion(DoublyList list){
//		this.list = list;
//	}
	
	
	public static DoublyNode insertAtLast(DoublyList list, int data) {
		DoublyNode node = new DoublyNode(data);
		//empty list
		if(list.isEmpty()) {
			list.tail = node;
			return node;
		}
		
		//anywhere else in the list
		DoublyNode temp = list.head;
		
		while(temp.nextPointer!=null) {
			temp = temp.nextPointer;
		}
		temp.nextPointer = node;
		node.prevPointer = temp;
		list.tail = node;
		return list.head;
	}
	public static DoublyNode insertAtHead(DoublyList list, int data) {
		DoublyNode node = new DoublyNode(data);
		if(list.isEmpty()) {
			list.tail = node;
			return node;
		}
		
		node.nextPointer = list.head;
		list.head.prevPointer = node;
		
		return node;
	}
	public static DoublyNode insertAtPosition(DoublyList list, int data, int position) {
		
		DoublyNode node = new DoublyNode(data);
		
		//position starts from 1
		if(list.isEmpty()) {
			if(position==1) {
				return insertAtHead(list,data);
			}
			else {
				System.out.println("No such position in empty list");
				return list.head;
			}
		}
		if(list.getLength()<position-1) {
			System.out.println("No such position in the list");
			return list.head;
		}
		
		DoublyNode temp = list.head;
		
		for(int i=1; i<position-1; i++) {
			temp = temp.nextPointer;
		}
		
		if(temp==list.tail) {
			return insertAtLast(list, data);
		}
		
		DoublyNode next = temp.nextPointer;
		temp.nextPointer = node;
		node.prevPointer=temp;
		node.nextPointer = next;
		next.prevPointer = node;
		
		return list.head;
	}
	
	public static DoublyNode insertBefore(DoublyList list, int data, int dataAfter) {
		
		if(list.isEmpty()) {
			System.out.println("Empty list!!");
			return null;
		}
		
		DoublyNode temp = list.head;
		
		if(dataAfter == temp.data) {
			return insertAtHead(list, data);
		}
		
		DoublyNode node = new DoublyNode(data);
		
		while(temp!=null) {
			if(temp.data == dataAfter) {
				DoublyNode prev = temp.prevPointer;
				temp.prevPointer = node;
				node.nextPointer = temp;
				
				node.prevPointer = prev;
				prev.nextPointer = node;
				
				return list.head;
			}
			temp = temp.nextPointer;
		}
		
		System.out.println("Data not found");
		return list.head;
	}
	
	public static DoublyNode insertAfter(DoublyList list, int data, int dataBefore) {
		
		if(list.isEmpty()) {
			System.out.println("Empty list!!");
			return null;
		}
		
		DoublyNode temp = list.head;
		DoublyNode node = new DoublyNode(data);
		
		while(temp.data!=dataBefore && temp!=null)
			temp=temp.nextPointer;
		
		if(temp==null) {
			System.out.println("data not found");
		}
		
		DoublyNode next = temp.nextPointer;
		temp.nextPointer = node;
		node.prevPointer = temp;
		node.nextPointer = next;
		
		if(next!=null)
			next.prevPointer = node;
		else
			list.tail=node;
		
		return list.head;
	}
	
	public static DoublyNode sortedInsert(DoublyList list, int data) {
		
		if(list.isEmpty() || list.head.data>data) {
//			System.out.println("empty list" + " data is " + data);
			return insertAtHead(list, data);
		}

		if(list.tail.data<data) {
			System.out.println("inserting at last " + "data is " + data);
			list.head=insertAtLast(list, data);
			return list.head;
		}
		
		DoublyNode temp = list.head;
		
		while(temp.nextPointer.data < data) {
			temp = temp.nextPointer;
		}
		
//		System.out.println("inserting after " + temp.data + " data is " + data);
		insertAfter(list, data, temp.data);
		return list.head;
	}
}
