package games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) throws IOException 
	{  
		// TODO Auto-generated method stub
		/* 
		final String startCon = "yes";

	
	
		System.out.println("DO you Wish to play a game? \nIf so type Yes");     
		
	    Scanner Scanner = new Scanner (System.in);

	    String confirmation = Scanner.nextLine().trim();
         
	    Scanner.close();
	  
	       if (same (confirmation, startCon))
		       { 
	    	   System.out.println("The Game Has begun\n");
	    	   
	    	   
		       Wheel createlinkedlist = new Wheel();
		       DuplicatePlay plays = new DuplicatePlay();
		       
		       
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
	       
	       
	       
	       */
		
		
		
		
		
		
		
		//This function call creates and file to various puzzle files 
		//Coming from the Create a file class
		//CreateFile puzzlefiles = new CreateFile();
		//puzzlefiles.CreatePerson();
		//puzzlefiles.WriteToFile();	
		//puzzlefiles.CreatePlace();
		//puzzlefiles.WriteToPFile();
		//puzzlefiles.CreateThing();
		//puzzlefiles.WriteToTFile();
		//puzzlefiles.CreatePhrases();
		//puzzlefiles.WriteToQFile();
		// This function call runs the Actual game play, based on the decision 
		// or phase in the game the appropriate function will be called
		//Coming from the Play class
		//Play game= new Play();
		//game.choices();
		//game.category();
		//game.puzzle();
		//game.readFileT();
		//game.readFileP();
		//game.readFileQ();
		//game.replacepuzzle();
		//game.replacePpuzzle();
		//game.replaceQpuzzle();
		//game.replaceTpuzzle();
		
		
		// This function call control the guesses for the puzzle,
		// count the number of occurrences for the letters
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);   
        // Character input 
		char guess= sc.next().charAt(0); 
		System.out.println("Please enter your answer:"+guess);
		Guesses g= new Guesses();
		g.Check(guess);
		g.display();
		Queue q= new Queue();
		
	}

	public static boolean same (String confirmation, String startCon){
	    if (confirmation.equals(startCon))
	        return true;        
	    else
	        return false;
	}

}
