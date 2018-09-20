package application;

import java.util.ArrayList;

public class CustomizePizza {
	static ArrayList<Pizza> order = new ArrayList<Pizza>();
	static int pizzaNumber = 0;
	
	public static void start() {
		order.add(new Pizza());
		pizzaNumber = pizzaNumber + 1;
		Main.stage2.show();
		Main.stage1.hide();
		System.out.println(pizzaNumber);
	}
	
}
