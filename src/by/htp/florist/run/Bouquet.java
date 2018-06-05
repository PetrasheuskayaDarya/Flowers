package by.htp.florist.run;

import by.htp.florist.entity.Accessory;
import by.htp.florist.entity.Component;
import by.htp.florist.entity.Flower;
import by.htp.florist.entity.Ribbon;
import by.htp.florist.entity.Synthetic;
import by.htp.florist.entity.Wild;

public class Bouquet {
	
	Ribbon ribbon = new Ribbon ( "red",10, 20);
	Wild wild = new Wild (10, "fresh", 20);
	Synthetic synthetic = new Synthetic(10, "fresh", 20);
	

	public static void main(String[] args) {
		Object components[] =  new Component[] {
		new Ribbon(),
		new Wild(),
		new Synthetic(),
};
		
for(Object p: components) {
	System.out.println(p);
}

	}

}
