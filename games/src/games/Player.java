package games;

public class Player {
	private String PlayerName;
	private int PlayerNum;
	private float GrandTot;
	
	public Player (){
		PlayerName = "";
		PlayerNum = 0;
		GrandTot = 0;
	}
	public Player (String n, int p, float g) {
		PlayerName = n;
		PlayerNum = p;
		GrandTot = g;
	}
	public Player (Player y) {
		PlayerName = y.PlayerName;
		PlayerNum = y.PlayerNum;
		GrandTot = y.GrandTot;
	}
	public void setPlayerName(String n) {
		PlayerName = n;
	}
	public String getPlayerName() {
		return this.PlayerName;
	}
	public void setPlayerNum(int p) {
		PlayerNum = p;
	}
	public int getPlayerNum() {
		return this.PlayerNum;
	}
	public void setGrandTot(float g) {
		GrandTot = g;
	}
	public float getGrandTot() {
		return this.GrandTot;
	}
}
