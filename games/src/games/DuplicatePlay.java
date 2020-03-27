package games;
import java.io.*;
import java.lang.Math;
public class DuplicatePlay {
	public static  String [] cate = new String [4] ;
	int pie;
	 public int category() 
	  
	    { 
	        // define the range 
	        int max = 3;   
	        int min = 0;  
	        int range = max - min + 1; 
	  
	       
	           int  rand = (int)(Math.random() * range) + min; 
	  
	            
	            
	  
 	           cate[0] = "Person";
 	          cate[1] = "Place";
 	         cate[2] = "Thing";  
 	        cate[3] = "Phrases"; 
 	        
 	         
	            System.out.println("The Category is " +cate[rand]);
				 pie = rand;
				return pie;
	    }
	 
	 public void pieToWin()
	 {
		DuplicatePlay game= new DuplicatePlay(); 
		System.out.println("  "); 
		
		 			if (pie == 0)  
					{
						game.replacepuzzle();
					}
					else if (pie == 1)
					{
						game.replacePpuzzle();
					}
					
					else if (pie == 3)
					{
						game.replaceQpuzzle();
					}
					
					else if (pie == 2)
					{
						game.replaceTpuzzle();
					}
					
		 
	 }
	 
	 
	 //The category function randomizes the category therefore each player gets a different category 
	 //i used numbers because it looks easier 
	 //1-Person, 2-Place, 3-Thing, 4-Phrases
		public void choices() {
			 System.out.println("The Categories are as follows:");
			 System.out.println("**********1-Person************");
			 System.out.println("**********2-Place*************");
			 System.out.println("**********3-Thing*************");
			 System.out.println("**********4-Phrases***********");
				}   
	 public  void puzzle() 
	    { 
	        // define the range   
	        int max = 4; 
	        int min = 0;  
	        int range = max - min + 1;
	        
	  
	        // generate random numbers within 1 to 5
	       
	            int rand = (int)(Math.random() * range) + min; 
	  
	            System.out.println(rand); 
	          //This function is used to read from the different files and display a specific line 
		        String text = ""; 
			    try {
			      FileReader readfile = new FileReader("Person.txt");
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
	 //The puzzle function randomizes the puzzles for each category there are 5 puzzles
	 //Based on the number the will get a different puzzle. 
	 //in the file class each puzzle has a number assigned 
	 
	 
 
	
	//This function stores all the information in the Person file into an array 
	//Thus allowing us to remove substring from the strings
	public void replacepuzzle() {
		String[] myArray= new String[5];
		myArray[0] = "Marshall Mathers";
		myArray[1] = "Beyonce Knowles-Carter";
		myArray[2] = "Jennifer Lopez";
		myArray[3] = "Ciara Harris";
		myArray[4] = "Aubrey Graham";	
		
		 int max = 4;   
	     int min = 0;  
	     int range = max - min + 1; 
	     int  i = (int)(Math.random() * range) + min;  // help to Choose a random puzzle 
		 String newmyArray = myArray[i].replaceAll("([a,c,,r,n,l,t,o,p])","_"); // chooses the puzzle based on the number generated
		 System.out.println(newmyArray);
			
		

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
		
		 int max = 4;     
	     int min = 0;   
	     int range = max - min + 1; 
	     int  i = (int)(Math.random() * range) + min;  // help to Choose a random puzzle 
		 String newmyArray = myArray[i].replaceAll("([s,m,o,i,l,h,c,v])","_"); // chooses the puzzle based on the number generated
		 System.out.println(newmyArray);
		
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
		
		 int max = 4;   
	     int min = 0;  
	     int range = max - min + 1; 
	     int  i = (int)(Math.random() * range) + min;  // help to Choose a random puzzle 
		 String newmyArray = myArray[i].replaceAll("([,w,o,i,b,m,B,j,l,u,e])","_"); // chooses the puzzle based on the number generated
		 System.out.println(newmyArray);
		
	}
	
	
	
	
	//This function stores all the information in the Phrase file into an array 
	//Thus allowing us to remove substring from the strings
	public void replaceQpuzzle() {
		String[] myArray= new String[5];
		myArray[0] = "Just do the best you can.";
		myArray[1] = "Live as if you were to die tomorrow. 
		myArray[2] = "That which does not kill us makes us stronger.";
		myArray[3] = " Be yourself; everyone else is already taken.";
		myArray[4] = "If opportunity doesn’t knock, build a door.";	
		
		
			
			 int max = 4;   
		     int min = 0;  
		     int range = max - min + 1; 
		     int  i = (int)(Math.random() * range) + min;  // help to Choose a random puzzle 
			 String newmyArray = myArray[i].replaceAll("([s,w,o,i,k,l,u,,g,])","_"); // chooses the puzzle based on the number generated
			 System.out.println(newmyArray);
		
	}
	
}



