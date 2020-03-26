package Game;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
public class CreateFile {
	//In this class we have the creation and input of the different category files.
	//As you can see each function does the same thing but to different files
	//Not sure you can have a general function for it but if u can make the changes
	void CreatePerson() {
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
	 
		  void WriteToFile () {  
		    try {  
		      FileWriter myWriter = new FileWriter("Person.txt");
		      myWriter.write("1. Marshall Mathers\n");
		      myWriter.write("2. Beyonce Knowles-Carter\n");
		      myWriter.write("3. Jennifer Lopez\n");
		      myWriter.write("4. Ciara Harris\n");
		      myWriter.write("5. Aubrey Graham\n");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
		  }  
		
	 
		 void CreatePlace () {
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
		

			 void WriteToPFile() {  
			    try {  
			      FileWriter myWriter = new FileWriter("Place.txt");
			      myWriter.write("1. Palawan Island\n");
			      myWriter.write("2. Antelope Canyon\n");
			      myWriter.write("3. Moraine Lake\n");
			      myWriter.write("4. Cliffs of Moher\n");
			      myWriter.write("5. Whitehaven Beach\n");
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			  }  
			 
	  
		    void CreateThing () {
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
		
	
		    void WriteToTFile () {  
			    try {  
			      FileWriter myWriter = new FileWriter("Thing.txt");
			      myWriter.write("1. Game of Thrones\n");
			      myWriter.write("2. The Blair Witch Project\n");
			      myWriter.write("3. The Birth Of Venus\n");
			      myWriter.write("4. Cherry Blossom\n");
			      myWriter.write("5. Lamborghini Veneno\n");
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } 
			  }  
			
		
			   void CreatePhrases() {
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
		
				 void WriteToQFile() {  
				    try {  
				      FileWriter myWriter = new FileWriter("Phrases.txt");
				      myWriter.write("1. Just do the best you can.\n ");
				      myWriter.write("2. Live as if you were to die tomorrow. Learn as if you were to live forever\n");
				      myWriter.write("3. That which does not kill us makes us stronger.\n");
				      myWriter.write("4. Be yourself; everyone else is already taken.\n");
				      myWriter.write("5. If opportunity doesn’t knock, build a door.\n");
				      myWriter.close();
				      System.out.println("Successfully wrote to the file.");
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    } 
				  }
			 
}
   


	
			 
		 
		 
	
		