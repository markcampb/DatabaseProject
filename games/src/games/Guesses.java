package games;
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
public class Guesses {
	
	private char vowel;
	private char constant;
	public static String agree ="yes";
	public static String no = "no";
	public static char guessedChar =0;
	public Guesses(){
		vowel='a'; 
		constant='y';	
	}
	public Guesses(char vowel, char constant) {
		this.vowel=vowel;
		this.constant=constant;
	}
	public Guesses(Guesses G) {
		vowel=G.vowel;
		constant=G.constant;
	}
	public char getvowel() {
		return vowel;
	}
	public char getconstant() {
		return constant;
	}
	
	public void setvowel(char vowel) {
		this.vowel=vowel;
	}
	public void setconstant(char constant) {
		this.constant=constant;
	} 
	public static char Check()  // this basically runs thru the whole guess the letter part and checks to see if 1. what u enter is valid. and 2. if you tryna buy a vowel or not.
	
	{ 
		System.out.println("do you wish to buy a vowel?");

	    Scanner Scan = new Scanner (System.in);
	    
	   
	   
	    String checkIfBuying  = Scan.nextLine();  // reades in the answer if the player  is buying a vowel
	    
	   
	    if (same (checkIfBuying,agree)) 
	    		{
			    	
			    	System.out.println("Enter the vowel you wish to buy");
			    	
			    	   char guessedChar = Scan.next().charAt(0);
			   	    
			   		
			   		if (guessedChar == 'a'|| guessedChar== 'e'|| guessedChar=='i'|| guessedChar=='o'||guessedChar=='u')
			   		{
			   			System.out.println("you are trying to purchase the vowel " +guessedChar);
			   		}
			   		
			   		
			   		else {
			   				System.out.println("that is not a vowel");
			   			}
	    		} 
	    
	   	else if (checkIfBuying != "no")
		   		{
	   		System.out.println("Enter the constant you wish to buy");
	    	   char guessedChar = Scan.next().charAt(0);
	   	    
	    	   
		    	   if (guessedChar == 'a'|| guessedChar== 'e'|| guessedChar=='i'|| guessedChar=='o'||guessedChar=='u')
			   		{
			   			System.out.println("Please do not enter a vowel you click the option that yuh did wa dat.... smh");
			   		}
		    	   else 
		    	    {
			   			System.out.println("you have guessed the constant " +guessedChar);
			   		}
		   		 
			
	    		
		   		}
	    else
			    {
					System.out.println("stop type f*$&ry");
					
				} 
		return guessedChar;		 
		
	
	}
	
	
	private static boolean same(String checkIfBuying, String agree) {
		   if (checkIfBuying.equals(agree))
		        return true;        
		   else if (checkIfBuying.equals(no))
		        return false;
		   
		   
		return false;
	}
	public void display() {
		System.out.println("");
		
	}
}
