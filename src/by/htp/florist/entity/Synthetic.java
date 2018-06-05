package by.htp.florist.entity;

public class Synthetic extends Flower {
	
	
	
	public int lengthOfStem;
	
	public Synthetic() {
	}
	
	public Synthetic ( int lengthOfStem, String freshness, int price) {
		
	
		this.lengthOfStem = lengthOfStem;
		this.freshness = freshness;
		this.price = price;
		
	}
	
	public int getLengthOfStem() {
		return this.lengthOfStem;
	}
	
}