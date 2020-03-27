package games;
import java.io.*;
import java.lang.Math;
public class DuplicatePlay {
	 public void category() 
	    { 
	        // define the range 
	        int max = 3; 
	        int min = 0;  
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
	          //This function is used to read from the different files and display a specific line 
		        String text = "";
			    try {
			      FileReader readfile = new FileReader("myfile.txt");
			      BufferedReader readbuffer = new BufferedReader(readfile);
			      for (rand = 1; rand < 5; rand++) {
			        if (rand == 2) {
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
	
	//This function stores all the information in the Person file into an array 
	//Thus allowing us to remove substring from the strings
	public void replacepuzzle(String[] args) {
		String[] myArray= new String[5];
		myArray[0] = " Marshall Mathers";
		myArray[1] = "Beyonce Knowles-Carter";
		myArray[2] = "Jennifer Lopez";
		myArray[3] = "Ciara Harris";
		myArray[4] = "Aubrey Graham";	
		
		for(int i=0;i<myArray.length;i++) {
			String newmyArray = myArray[i].replaceAll("([m,z])","");
			
			System.out.println(newmyArray);
			
		}

	}
	//This function stores all the information in the Place file into an array 
	//Thus allowing us to remove substring from the strings
	public void replacePpuzzle() {
		String[] myArray = new String[5];
		myArray[0] = "  Palawan Island";
		myArray[1] = "Antelope Canyon"; 
		myArray[2] = "Moraine Lake ";
		myArray[3] = " Cliffs of Moher";
		myArray[4] = "Whitehaven Beach";	
		
		for(int i=0;i<myArray.length;i++) {
			String newmyArray=myArray[i].replaceAll("([a,o])","");
			
			System.out.println(newmyArray);
		}
	}
	//This function stores all the information in the Thing file into an array 
	//Thus allowing us to remove substring from the strings
	public void replaceTpuzzle() {
		String[] myArray= new String[5];
		myArray[0] = " Game of Thrones";
		myArray[1] = "The Blair Witch Project";
		myArray[2] = "The Birth Of Venus";
		myArray[3] = "Cherry Blossom";
		myArray[4] = "Lamborghini Veneno";	
		
		for(int i=0;i<myArray.length;i++) {
			String newmyArray = myArray[i].replaceAll("([c,r])","");
			
			System.out.println(newmyArray);
		}
	}
	//This function stores all the information in the Phrase file into an array 
	//Thus allowing us to remove substring from the strings
	public void replaceQpuzzle() {
		String[] myArray= new String[5];
		myArray[0] = "Just do the best you can.";
		myArray[1] = "Live as if you were to die tomorrow. Learn as if you were to live forever";
		myArray[2] = "That which does not kill us makes us stronger.";
		myArray[3] = " Be yourself; everyone else is already taken.";
		myArray[4] = "If opportunity doesn’t knock, build a door.";	
		
		for(int i=0;i<myArray.length;i++) {
			String newmyArray = myArray[i].replaceAll("([h,w])","");
			
			System.out.println(newmyArray);
		}
	}

}



