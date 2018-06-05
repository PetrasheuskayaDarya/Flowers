package by.htp.florist.entity;

public class Ribbon extends Accessory {
	
	public int length;
	
	public Ribbon() {
	}
	
	public Ribbon ( int length, String color, int price) {
		
	
		this.length = length;
		this.color = color;
		this.price = price;
	}
	
	
	
	public int getLength() {
		return this.length;
	}
	
}