package by.htp.florist.entity;

public class Ribbon extends Accessory {
	
	public int length;
	
	public Ribbon() {
	}
	
	public Ribbon ( String color, int price, int length) {
		
	    super(color, price);
		this.length = length;
		
	}
	
	
	
	public int getLength() {
		return this.length;
	}

	@Override
	public String toString() {
		return "Ribbon [length=" + length + super.toString() +"]";
	}
	
	

	
}