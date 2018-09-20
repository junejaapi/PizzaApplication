package application;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Pizza {
	
	private String size;
	private String crust;
	private ArrayList<String> toppings = new ArrayList<String>();
	private String instructions;
	private static double price = 0;
	private ArrayList<String> money = new ArrayList<String>();
	private DecimalFormat d2 = new DecimalFormat(".##");
	
	public Pizza() {
		Pizza.price = 0;
		this.crust = "";
		this.toppings.clear();
		this.instructions = "";
		this.size= "";
		this.money.clear();
		Main.customizeControl.getPizza().getChildren().clear();
		Main.customizeControl.getPizza().getChildren().add(Main.customizeControl.getBase());
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public ArrayList<String> getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings.add(toppings);
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public void setPrice(double charge) {
		if(charge==0) {
			Pizza.price=0;
		}
		if(!(Pizza.price==charge)) {
			price = price + charge;
			money.add(0, d2.format(price) + "");
		}
	}
	
	public static double getPrice() {
		return price;
	}
	
//	@Override
//	public String toString() {
////		return "                         Sheridan Pizza                   " +System.getProperty("line.separator")+ "                      1430 Trafalgar Rd " +System.getProperty("line.separator")+ "                          Oakvile, ON " +System.getProperty("line.separator")+ "                            L6H2L1" +System.getProperty("line.separator")+System.getProperty("line.separator")+ "*********************************************************** " +System.getProperty("line.separator")+ " " +this.getSize()+"                                     " +d2.format(Pizza.getPrice())+System.getProperty("line.separator")+ " **" +CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getCrust()+ System.getProperty("line.separator") +this.toppingsReceipt() + " @"+ CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getInstructions()+ System.getProperty("line.separator")+ "*********************************************************** " +System.getProperty("line.separator")+   "Subtotal                                              " +d2.format(CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getPrice()))+ System.getProperty("line.separator") +"Taxes(13%)                                            " +d2.format(Pizza.getPrice()*0.13)+ System.getProperty("line.separator") + "Total                                                " +d2.format(Pizza.getPrice()*1.13);
//		return " ";
//		
//	}

	public String toppingsReceipt() {
		String toppings = "";
		for(int i=0;i<this.toppings.size();i++) 
			toppings = toppings + ">" +this.getToppings()+ System.getProperty("line.separator");
		System.out.println(toppings);
		return toppings;
	}
	
	public ArrayList<String> getMoney() {
		return money;
	}
	
}
