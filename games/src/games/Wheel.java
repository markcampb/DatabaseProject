package games;
import java.util.Random; 
public class Wheel 
{
	private ListNode First;
	private class ListNode 
		{
			private ListNode next;
			private int data;
			
			
			public ListNode(int data)
			{
				this.data=data;
				
			}
		}
	
		
	
	 

	
	 
	public void Wheelcreate()  // This Function creates a fixed list of one to 10. With 10 different node pointing to each other
	{
		ListNode A = new ListNode(1000);
		ListNode B = new ListNode(2000);
		ListNode C = new ListNode(3000);
		ListNode D = new ListNode(4000);
		ListNode E = new ListNode(5000);
		ListNode F = new ListNode(6000);
		ListNode G = new ListNode(7000);
		ListNode H = new ListNode(8000);
		ListNode I = new ListNode(9000);
		ListNode J = new ListNode(10000);
		
		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		E.next = F;
		F.next = G;
		G.next = H;
		H.next = I;
		I.next = J;
		J.next = A;
		
		First = A; //this just shows which Node in the List is Currently First
	
		
		
	
	}
	
	
	
	public void spinTheWheel ()    // This function was just to show that the Linked List works fine
	{
		
		 Random rand = new Random();
		 int i = 0;
		 
		  
		 
		 int b = rand.nextInt(100000);
		ListNode n = First;
		while (n.next!=null & i <b)
		{ 
			
			n=n.next;
			i++;// this stops the list from going over itself unlimitedly
		}
		System.out.println(n.data);
	}
	

}
