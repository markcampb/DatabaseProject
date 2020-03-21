package games;
import java.io.*;
import java.lang.Math;

public class play {
	 public void category() 
	    { 
	        // define the range 
	        int max = 4; 
	        int min = 1; 
	        int range = max - min + 1; 
	  
	        // generate random numbers within 1 to 4
	        for (int i = 0; i < 4; i++) { 
	            int rand = (int)(Math.random() * range) + min; 
	  
	            System.out.println(rand); 
	        } 
	    } 
	 //The category function randomizes the category therefore each player gets a different category 
	 //i used numbers because it looks easier 
	 //1-Person, 2-Place, 3-Thing, 4-Phrases
	 
	 public  void puzzle() 
	    { 
	        // define the range 
	        int max = 5; 
	        int min = 1; 
	        int range = max - min + 1; 
	  
	        // generate random numbers within 1 to 5
	        for (int i = 0; i < 5; i++) { 
	            int rand = (int)(Math.random() * range) + min; 
	  
	            System.out.println(rand); 
	        } 
	    } 
	 //The puzzle function randomizes the puzzles for each category there are 5 puzzles
	 //Based on the number the will get a different puzzle. 
	 //in the file class each puzzle has a number assigned 
	 
	 
	public void choices() {
		 System.out.println("The Categories are as follows:");
		 System.out.println("**********1-Person************");
		 System.out.println("**********2-Place*************");
		 System.out.println("**********3-Thing*************");
		 System.out.println("**********4-Phrases***********");
			}
	
	
	public void ReadFile(String[] args)
	    {
		 	String text = "";
		    int lineNumber;
		    try {
		      FileReader readfile = new FileReader("myfile.txt");
		      BufferedReader readbuffer = new BufferedReader(readfile);
		      for (lineNumber = 1; lineNumber < 5; lineNumber++) {
		        if (lineNumber == 2) {
		          text = readbuffer.readLine();
		        } else
		          readbuffer.readLine();
		      }
		      readbuffer.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		    System.out.println(" The specific Line is: " + text);
		  }
	    
}



