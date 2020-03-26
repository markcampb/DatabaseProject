package games;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) throws IOException 
	{  
		// TODO Auto-generated method stub
		 
		final String startCon = "yes";

	
	
		System.out.println("DO you Wish to play a game? \nIf so type Yes");     
		
	    Scanner Scanner = new Scanner (System.in);

	    String confirmation = Scanner.nextLine().trim();
         
	    Scanner.close();
	  
	       if (same (confirmation, startCon))
		       { 
	    	   System.out.println("The Game Has begun\n");
	    	   
	    	   
		       Wheel createlinkedlist = new Wheel();
		       play plays = new play();
		       
		       
		       createlinkedlist.Wheelcreate();//creates the list of to 10
		       
		       System.out.println("The wheel is now spinning player\n");
		       
		       
		       plays.choices();
		        
		      createlinkedlist.spinTheWheel();//shows that the list is a circular linked list
		       plays.category();
		       plays.puzzle();
	       
		 
	       }
       
       else	{ 
    	   
    	   System.out.println("maybe another time then" );   
    	   
    	   
       }
	}

	public static boolean same (String confirmation, String startCon){
	    if (confirmation.equals(startCon))
	        return true;        
	    else
	        return false;
	}

}
