package by.htp.florist.entity;

import java.util.Arrays;

public class Component {
	
	public Component [] components;
	
	public int price;
	
	public Component() {
	}
	
	public Component (int price) {
		this.price = price;
		
	}
	
	public int getPrice() {
		return this.price;
	}

	public Component[] getComponents() {
		return components;
	}

	public void setComponents(Component[] components) {
		this.components = components;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Component [components=" + Arrays.toString(components) + ", price=" + price  +"]";
	}
	
	


	

}

