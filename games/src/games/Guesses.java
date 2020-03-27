package games;
public class Guesses {
	private char vowel;
	private char constant;
	
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
	public void Check(char answer) {
		if (answer==('a'|'e'|'i'|'o'|'u')) {
			System.out.println("The answer is a vowel");
		}else {
			System.out.println("The anser is a constant");
		}		
	}
	public void display() {
		System.out.println("");
		
	}
}
