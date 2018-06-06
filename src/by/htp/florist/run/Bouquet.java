package by.htp.florist.run;

import by.htp.florist.entity.Accessory;
import by.htp.florist.entity.Component;
import by.htp.florist.entity.Flower;
import by.htp.florist.entity.Ribbon;
import by.htp.florist.entity.Synthetic;
import by.htp.florist.entity.Wild;



public class Bouquet {
	public static void main(String[] args) {
//	Цветочница. Определить иерархию цветов. Создать несколько объек-
//	тов-цветов. Собрать букет (используя аксессуары) с определением его
//	стоимости. Провести сортировку цветов в букете на основе уровня све-
//	жести. Найти цветок в букете, соответствующий заданному диапазону
//	длин стеблей.
	
	Ribbon ribbon = new Ribbon ( "red",10, 20);
	Wild wild = new Wild ("fresh", 10, 20, "red");
	Synthetic synthetic = new Synthetic("fresh", 11, 20, 5);
	
	
//	Flower flower = new Flower();
//	Accessory accessory = new Accessory();
//	
//	Component component = new Component();
//
//	 component.components[0] = wild;
//	 component.components[1] = synthetic;
//	 component.components[3] = ribbon;
	

//	public static void main(String[] args) {
	
	
	Component[] components = new Component[3];
	Component my = new Component();

	components[0] = ribbon;
	components[1] = wild;
	components[2] = synthetic;
	
	my.setComponents(components);
	System.out.println(my);
	
	my.priceOfBouquet();
	
	}
	
	

	
	
	
//		Object components[] =new Component[] {
//		new Ribbon(),
//		new Wild(),
//		new Synthetic(),
//};
		
//for (int i=0; components.
//	length >3; i++) {
//	if (components[i].getPrice() ==  20) {
//		System.out.println(components[i].getPrice());
//	}	
}



