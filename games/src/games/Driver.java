package Game;

import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
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

}
