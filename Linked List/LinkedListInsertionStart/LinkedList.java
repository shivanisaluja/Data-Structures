package LinkedListInsertionStart;

public class LinkedList {
	Node head;
//----------------------------------------------------------inserting elements in linked list
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		
//		if this is your first node (head does not have the address of next node)
		if (head == null) {
			head = node;

		}

//		there is already a node
		else {
//			created a node and make it as head
//			so as to traverse
			Node n = head;

			while (n.next != null) {
				n = n.next;
			}

//			when we reach to the last node we will update the reference of that node from null to that of the next node which is to be inserted
			n.next = node;

		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//----------------------------------------------------------printing the list

	public void show() {

//		to traverse let initially the node is at head
		Node node = head;

//		if it is not the last node
		while (node.next != null) {
//			print the data
			System.out.println(node.data);
//	    shift to the next node
			node = node.next;
		}
//		last node have value null so loop will terminate
//		so to print data of that node having null in reference block
		System.out.println(node.data);


}

//----------------------------------------------------------inserting node at start



public void insertAtStart(int data) {
	// TODO Auto-generated method stub

	Node node = new Node();
	node.data = data;
	
//	node k pointer m head m jo phle store thi ie value of next pointer vo aajaegi
	node.next=head;
//	aur head m new node ka address aajaega
	head=node;
	
}
	
	

}
