package by.htp.florist.entity;


public class Wild extends Flower {

	
	public String color;
	
	
	public Wild() {
	}
	
	public Wild ( String freshness,int lengthOfStem, int price, String color) {
		
		
	    super(freshness, lengthOfStem, price);
		this.color = color;
		
	}

	
	public String getColor() {
		return this.color;
	}
	

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Wild [color=" + color +super.toString() + "]";
	}
	

}