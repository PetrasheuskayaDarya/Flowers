package by.htp.florist.entity;

public class Synthetic extends Flower {
	
	
	
	public int lengthOfStem;
	
	public Synthetic() {
	}
	
	public Synthetic ( int lengthOfStem, String freshness, int price) {
		
	    super (freshness, price);
		this.lengthOfStem = lengthOfStem;
		
		
	}
	
	public int getLengthOfStem() {
		return this.lengthOfStem;
	}
	
}