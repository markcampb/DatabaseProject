package games;

public class Queue {
	private Node Front;
	private Node Rear;
	
	public Queue() {
		Front=null;
		Rear=null;
	}
	public Node getFront() {
		return Front;
	}
	public Node getRear() {
		return Rear;
	}
	public void setFront(Node n) {
		Front=n;
	}
	public void setRear(Node n) {
		Rear=n;
	}
	
	public void Enqueue(char v, char c) {
		Node temp= new Node(v,c);
		if (temp!=null) {
			
			if(Front==null) {
				Front=temp;
				Rear=temp;
			}
		else
		{
			Rear.setNextNode(temp);
			temp.setPrevNode(Rear);
			Rear=temp;
		}
		
			System.out.println("The list is full. Cannot add another node.");
		}
	}
	
	public Guesses Dequeue() {
		Guesses datatoReturn = null;
		if (Front==Rear) {
			if(Front==Rear) {
				Rear=null;
			}
			Node temp=Front;
			datatoReturn=Front.getData();
			Front=Front.getNextNode();
			temp=null;
		}
		return datatoReturn;
	}
	
	public Guesses QueueFront() {
		if(Front==null) {
			System.out.println("The queue is empty, cannot return(s)");
			return null;
		}
		else {
			return Front.getData();
		}
	}
	
	public int CountNodes() {
		int count=0;
		Queue tempQueue=new Queue();
		
		while(Front!=null) {
			tempQueue.Enqueue(Dequeue());
			count++;
		}
		while(tempQueue.getFront()!=null) {
			Enqueue(tempQueue.Dequeue());
		}
		return count;
	}
	
}
