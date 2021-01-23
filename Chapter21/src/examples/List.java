package examples;

class ListNode<T> {
	
	//package access members
	T data; // data for this node
	ListNode<T> nextNode; // reference to the next node of the list
	
	//constructor with null reference to next node which indicates the end of the list
	ListNode(T object) {
		this(object, null);
	}
	
	//constructor with specific object and reference to the next Node
	ListNode(T object, ListNode<T> node){
		data = object;
		nextNode = node;
	}
	
	T getData() {
		return data;
	}
	
	ListNode<T> getNext(){
		return nextNode;
	}

}// end of listNode<T>


public class List<T>{
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name;
	
	//creates empty list with "list" as the name
	public List() {
		this("list");
	}
	
	//constructor creates an empty list with a name 
	public List(String listName) {
		name = listName;
		firstNode = lastNode = null;
	}
	
	//insert item at front of list
	public void insertAtFront(T insertItem) {
		if(isEmpty())//firstNode and lastNode refer to the same object
			firstNode = lastNode = new ListNode<T>(insertItem);
		else// firstNode refers to new node
			firstNode = new ListNode<T>(insertItem, firstNode);
	}
	
	//insert item at end of list
	public void insertAtBack(T insertItem) {
		if(isEmpty())
			firstNode = lastNode = new ListNode<T>(insertItem);
		else
			lastNode =lastNode.nextNode = new ListNode<T>(insertItem);
	}
	
	//remove first node from list
	public T removeFromFront() throws EmptyListException{
		if(isEmpty())// throw exception if list is empty
			throw new EmptyListException(name);
		
		T removeItem = firstNode.data; // retrieve data being removed
		
		//update references firstNode and lastNode
		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;
		
		return removeItem;//return removed item
		
	}
	
	//remove last node from list
	public T removeFromBack() throws EmptyListException{
		if(isEmpty())// throw exception if list is empty
			throw new EmptyListException(name);
		
		T removeItem = lastNode.data;
		
		if(firstNode == lastNode)
			firstNode = lastNode = null;
		else {
			ListNode<T> current = firstNode;
			// loop while current node does not refer to lastNode
			while(current.nextNode != lastNode)
				current = current.nextNode;
			
			lastNode = current;// current is new lastNode
			current.nextNode = null;
		}
		return removeItem; // return removed node data
	}
	
	//determine whether list is empty
	public boolean isEmpty() {
		return firstNode == null; // returns true if list is empty
	}
	
	//output list contents
	public void print() {
		if(isEmpty()) {
			System.out.printf("Empty %s%n", name);
			return;
		}
		
		System.out.printf("The %s is: ", name);
		ListNode<T> current = firstNode;
		
		//while not at end of list, output current node's data
		while(current != null) {
			System.out.printf("%s ", current.data);
			current = current.nextNode;
		}
		System.out.println();
	}
}//end of list class
