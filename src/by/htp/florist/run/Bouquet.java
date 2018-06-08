package by.htp.florist.run;

import by.htp.florist.entity.Accessory;
import by.htp.florist.entity.Component;
import by.htp.florist.entity.Flower;
import by.htp.florist.entity.Ribbon;
import by.htp.florist.entity.Synthetic;
import by.htp.florist.entity.Wild;

public class Bouquet {
	public static void main(String[] args) {
		// Цветочница. Определить иерархию цветов. Создать несколько объек-
		// тов-цветов. Собрать букет (используя аксессуары) с определением его
		// стоимости. Провести сортировку цветов в букете на основе уровня све-
		// жести. Найти цветок в букете, соответствующий заданному диапазону
		// длин стеблей.

		Accessory ribbon = new Ribbon("red", 10, 20);
		Flower wild = new Wild("fresh", 10, 20, "red");
		Flower synthetic = new Synthetic("fresh", 11, 20, 5);

		

		Component[] components = new Component[3];
		Component my = new Component();

		components[0] = ribbon; //создать класс и положить туда части букета и добавлять через метод 
		components[1] = wild;
		components[2] = synthetic;

		my.setComponents(components);
		
		my.priceOfBouquet();
		my.showBouquet();
		
		Component[] mySortBoquet = my.sortByLengthOfStem(2, 20);
		Component mySort = new Component();
		mySort.setComponents(mySortBoquet);
		mySort.showBouquet();

	}


}
