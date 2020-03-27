package games;

public class Node {
	private Node NextNode;
	private Node PrevNode;
	private Guesses Data;

public Node() {
	Data= new Guesses();
	NextNode= null;
	PrevNode=null;
}
public Node(char v, char c) { 
	Data= new Guesses(v,c);
	NextNode= null;
	PrevNode=null;
}
public Node(Guesses data) {
	Data= data;
	NextNode= null;
	PrevNode=null;
}
public Node getNextNode() {
	return NextNode;
}
public void setNextNode(Node nextNode) {
	NextNode=nextNode;
}
public Node getPrevNode() {
	return PrevNode;
}
public void setPrevNode(Node prevNode) {
	PrevNode=prevNode;
}
public Guesses getData() {
	return Data;
}
public void setData(Guesses data) {
	Data=data;
}
}
