package by.htp.florist.entity;

public class Wild extends Flower {

	
	public int lengthOfStem;
	
	
	public Wild() {
	}
	
	public Wild ( int lengthOfStem, String freshness, int price) {
		
	
		this.lengthOfStem = lengthOfStem;
		this.freshness = freshness;
		this.price = price;
		
	}

	
	public int getLengthOfStem() {
		return this.lengthOfStem;
	}
	

}