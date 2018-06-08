package by.htp.florist.entity;

import java.util.Arrays;

public class Component {

	public Component[] components;

	public int price;

	public Component() {
	}

	public Component(int price) {
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
		return  "price=" + price + "]";
	}

	int j = 0;

	public void priceOfBouquet() {
		int j = 0;
		for (int i = 0; i < components.length; i++) {
			j += components[i].getPrice();
		}
		System.out.println(j);
	}

	
	public void showBouquet() {
		for (int i = 0; i < components.length; i++) {
			System.out.print(components[i] + "\n");
		}
		System.out.println();
	}
	
	public Component[] sortByLengthOfStem( int from, int to) {
		
		Component[] findFlower = new Component[components.length];
		int j =0;
		for (int i =0; i <components.length; i++) {
			if(components[i] instanceof Flower) {
				if(((Flower) components[i]).getLengthOfStem() > from && ((Flower) components[i]).getLengthOfStem()< to ){
					findFlower[j] = components[i];
					j++;
				}
			}
		}
		return findFlower;
	}
	
	
}
