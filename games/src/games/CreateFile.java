package games;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
public class CreateFile {
	//In this class we have the creation and input of the different category files.
	//As you can see each function does the same thing but to different files
	//Not sure you can have a general function for it but if u can make the changes
	void CreatePerson(String[] args) {
	    try {
	      File myObj = new File("Person.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	 
		   void WriteToFile (String[] args) {  
		    try {  
		      FileWriter myWriter = new FileWriter("Person.txt");
		      myWriter.write("1. Marshall Mathers");
		      myWriter.write("2. Beyonce Knowles-Carter");
		      myWriter.write("3. Jennifer Lopez");
		      myWriter.write("4. Ciara Harris");
		      myWriter.write("5. Aubrey Graham");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
		  }  
		
	 
		 void CreatePlace (String[] args) {
		    try {
		      File myObj = new File("Place.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
		

			  void WriteToPFile(String[] args) {  
			    try {  
			      FileWriter myWriter = new FileWriter("Person.txt");
			      myWriter.write("1. Palawan Island");
			      myWriter.write("2. Antelope Canyon");
			      myWriter.write("3. Moraine Lake");
			      myWriter.write("4. Cliffs of Moher");
			      myWriter.write("5. Whitehaven Beach");
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			  }  
			 
	  
		   void CreateThing (String[] args) {
		    try {
		      File myObj = new File("Thing.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
		
	
			 void WriteToTFile (String[] args) {  
			    try {  
			      FileWriter myWriter = new FileWriter("Person.txt");
			      myWriter.write("1. Game of Thrones");
			      myWriter.write("2. The Blair Witch Project");
			      myWriter.write("3. The Birth Of Venus");
			      myWriter.write("4. Cherry Blossom");
			      myWriter.write("5. Lamborghini Veneno");
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			  }  
			
		
			   void CreatePhrases(String[] args) {
			    try {
			      File myObj = new File("Phrases.txt");
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			  }
		
				  void WriteToQFile(String[] args) {  
				    try {  
				      FileWriter myWriter = new FileWriter("Person.txt");
				      myWriter.write("1. Just do the best you can. ");
				      myWriter.write("2. Live as if you were to die tomorrow. Learn as if you were to live forever");
				      myWriter.write("3. That which does not kill us makes us stronger.");
				      myWriter.write("4. Be yourself; everyone else is already taken.");
				      myWriter.write("5. If opportunity doesn’t knock, build a door.");
				      myWriter.close();
				      System.out.println("Successfully wrote to the file.");
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    } 
				  }
			 
}
   


	
			 
		 
		 
	
		