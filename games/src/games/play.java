package games;
import java.io.*;
import java.lang.Math;
import java.util.Arrays;
public class play {
	
	
	
	 public void category()  
	    { 
		 
	        // define the range 
	        int max = 3; 
	        int min = 0;  
	        int range = max - min + 1; 
	  
	        // generate random numbers within 1 to 4
	        
	        
	        String[] cate = new String[4];  //this arrays is used to show which category is being played 
			
			cate [0]= "Person";
			cate [1]= "Place";
			cate [2]= "thing";
			cate [3]= "Phrases";
					
	        
	        
	        
	            int randCategory = (int)(Math.random() * range) + min; 
	  
	            System.out.println("The Category is  " + cate[randCategory]); 
	        
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
	       
	            int randPuzzle = (int)(Math.random() * range) + min; 
	  
	            System.out.println("The puzzle is " +randPuzzle); //in the futre this will show the puzzle not the number
	        
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
	
	
/*	public void ReadFile(String[] args)
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
 */
}



