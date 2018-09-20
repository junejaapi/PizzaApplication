package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class CustomizeController {
	
	private DecimalFormat d2 = new DecimalFormat(".##");

	@FXML
    private MenuItem pepper;

    @FXML
    private Button add;

    @FXML
    private MenuItem bc;

    @FXML
    private Button minus;

    @FXML
    private TextField quantity;

    @FXML
    private SplitMenuButton pizzasize;

    @FXML
    private MenuItem beef;

    @FXML
    private Button cart;

    @FXML
    private MenuItem mush;

    @FXML
    private Button plus;

    @FXML
    private MenuItem cheese;

    @FXML
    private MenuItem br;

    @FXML
    private MenuItem sc;

    @FXML
    private MenuItem ar;

    @FXML
    private MenuItem bacon;

    @FXML
    private Group pizza;
    
    @FXML
    private ImageView base;
    
    public ImageView p = new ImageView(new Image("file:C:\\Project_AshishJuneja_Eclipse\\Images\\pepper.png"));
    public ImageView a = new ImageView(new Image("file:C:\\Project_AshishJuneja_Eclipse\\Images\\ar.png"));
    public ImageView c = new ImageView(new Image("file:C:\\Project_AshishJuneja_Eclipse\\Images\\bc.png"));
    public ImageView be = new ImageView(new Image("file:C:\\Project_AshishJuneja_Eclipse\\Images\\beef.png"));
    public ImageView b = new ImageView(new Image("file:C:\\Project_AshishJuneja_Eclipse\\Images\\br.png"));
    public ImageView s = new ImageView(new Image("file:C:\\Project_AshishJuneja_Eclipse\\Images\\sc.png"));
    public ImageView h = new ImageView(new Image("file:C:\\Project_AshishJuneja_Eclipse\\Images\\ham.png"));
    public ImageView m = new ImageView(new Image("file:C:\\Project_AshishJuneja_Eclipse\\Images\\mushrooms.png"));
    public ImageView o = new ImageView(new Image("file:C:\\Project_AshishJuneja_Eclipse\\Images\\olives.png"));
    

    @FXML
    private MenuItem olives;

    @FXML
    private ImageView user;
    
    @FXML
    public Label price;
    
    @FXML
    private SplitMenuButton crust, instruction;
    
    private double cartPrice = 0;
    
    @FXML
    private Label bug;
    
    private int q = 0;
    
    @FXML
    void small(ActionEvent event) {
    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setSize("Small Pizza");
    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(0);
    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(7.50);
    	price.setText("$" + d2.format(Pizza.getPrice()));
    	
    }
    

	@FXML
    void medium(ActionEvent event) {
		CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setSize("Medium Pizza");
		CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(0);
		CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(8.95);
		price.setText("$" + d2.format(Pizza.getPrice()));
    }
    
    @FXML
    void large(ActionEvent event) {
    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setSize("Large Pizza");
    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(0);
    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(10.95);
    	price.setText("$" + d2.format(Pizza.getPrice()));
    }
    
    @FXML
    void xlarge(ActionEvent event) {
    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setSize("Extra Large Pizza");
    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(0);
    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(13.95);
    	price.setText("$" + d2.format(Pizza.getPrice()));
    }
    
    public boolean checkTopping(String t) {
    	for(String a : CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getToppings()) {
    		if(a==t) {
    			return true;
    		}
    	}
    	return false;
    }

    @FXML
    void addArtichokes(ActionEvent event) {
    	if(checkTopping("Veggie, Artichokes, 0Cals")) {
    			
    	}else {
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setToppings("Veggie, Artichokes, 0Cals");
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(1.45);
	    	price.setText("$" + d2.format(Pizza.getPrice()));
	    	a.setFitWidth(375);
	    	a.setFitHeight(393);
	    	a.setLayoutX(-163);
	    	a.setLayoutY(-183);
	    	pizza.getChildren().add(a);
    	}
    }

    @FXML
    void addOlives(ActionEvent event) {
    	if(checkTopping("Veggie, Kalamata Olives, 10Cals")) {
			
    	}else {
    		CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setToppings("Veggie, Kalamata Olives, 10Cals");
    		CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(1.45);
    		price.setText("$" + d2.format(Pizza.getPrice()));
    		o.setFitWidth(375);
	    	o.setFitHeight(393);
	    	o.setLayoutX(-163);
	    	o.setLayoutY(-183);
	    	pizza.getChildren().add(o);
    	}
    }

    @FXML
    void addBroccoli(ActionEvent event) {
    	if(checkTopping("Veggie, Broccoli, 5Cals")) {
    		
    	} else {
    		CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setToppings("Veggie, Broccoli, 5Cals");
    		CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(1.45);
    		price.setText("$" + d2.format(Pizza.getPrice()));
    		b.setFitWidth(375);
	    	b.setFitHeight(393);
	    	b.setLayoutX(-163);
	    	b.setLayoutY(-183);
	    	pizza.getChildren().add(b);
    	}
    }

    @FXML
    void addMushrooms(ActionEvent event) {
    	if(checkTopping("Veggie, Mushrooms, 5Cals")) {
    		
    	} else {
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setToppings("Veggie, Mushrooms, 5Cals");
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(1.45);
	    	price.setText("$" + d2.format(Pizza.getPrice()));
	    	m.setFitWidth(375);
	    	m.setFitHeight(393);
	    	m.setLayoutX(-163);
	    	m.setLayoutY(-183);
	    	pizza.getChildren().add(m);
    	}
    }

    @FXML
    void addSChicken(ActionEvent event) {
    	if(checkTopping("Meat, Sriracha Chicken, 15Cals")) {
    		
    	} else {
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setToppings("Meat, Sriracha Chicken, 15Cals");
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(2.45);
	    	price.setText("$" + d2.format(Pizza.getPrice()));
	    	s.setFitWidth(375);
	    	s.setFitHeight(393);
	    	s.setLayoutX(-163);
	    	s.setLayoutY(-183);
	    	pizza.getChildren().add(s);
    	}
    }

    @FXML
    void addBChicken(ActionEvent event) {
    	if(checkTopping("Meat, Buffalo Chicken, 20Cals")) {
    		
    	} else {
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setToppings("Meat, Buffalo Chicken, 20Cals");
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(2.45);
	    	price.setText("$" + d2.format(Pizza.getPrice()));
	    	c.setFitWidth(375);
	    	c.setFitHeight(393);
	    	c.setLayoutX(-163);
	    	c.setLayoutY(-183);
	    	pizza.getChildren().add(c);
    	}
    }

    @FXML
    void addBacon(ActionEvent event) {
    	if(checkTopping("Meat, Bacon Strips, 20Cals")) {
    		
    	} else {
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setToppings("Meat, Bacon Strips, 20Cals");
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(2.45);
	    	price.setText("$" + d2.format(Pizza.getPrice()));
    	}
    }

    @FXML
    void addBeef(ActionEvent event) {
    	if(checkTopping("Meat, Ground Beef, 25Cals")) {
    		
    	} else {
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setToppings("Meat, Ground Beef, 25Cals");
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(2.45);
	    	price.setText("$" + d2.format(Pizza.getPrice()));
	    	be.setFitWidth(375);
	    	be.setFitHeight(393);
	    	be.setLayoutX(-163);
	    	be.setLayoutY(-183);
	    	pizza.getChildren().add(be);
    	}
    }
    
	
    @FXML
    void addPepperoni(ActionEvent event) {
    	if(checkTopping("Meat, Pepperoni, 30Cals")) {
    		
    	} else {
	    	System.out.println(CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getToppings());
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setToppings("Meat, Pepperoni, 30Cals");
	    	System.out.println(CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getToppings());
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(2.45);
	    	price.setText("$" + d2.format(Pizza.getPrice()));
	    	p.setFitWidth(375);
	    	p.setFitHeight(393);
	    	p.setLayoutX(-163);
	    	p.setLayoutY(-183);
	    	pizza.getChildren().add(p);
	    }
    }


    @FXML
    void addHam(ActionEvent event) {
    	if(checkTopping("Meat, Ham, 5Cals")) {
    		
    	} else {
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setToppings("Meat, Ham, 5Cals");
	    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setPrice(2.45);
	    	price.setText("$" + d2.format(Pizza.getPrice()));
	    	h.setFitWidth(375);
	    	h.setFitHeight(393);
	    	h.setLayoutX(-163);
	    	h.setLayoutY(-183);
	    	h.setOpacity(50);
	    	h.toFront();
	    	pizza.getChildren().add(h);
    	}
    }
    

    @FXML
    void plusOne(ActionEvent event) {
    	this.q++;
    	quantity.setText(q + "");
    }

    @FXML
    void minusOne(ActionEvent event) {
    	if(q <= 0) {
    		
    	}else {
        	this.q = q-1;
    		quantity.setText(q + "");
    	}
    }

    @FXML
    void addPizza(ActionEvent event) {
    	try {
    		if(CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getCrust() == "" || CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getInstructions() == "" || CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getSize() == "" || CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getToppings().get(0) == null)  {
    			bug.setText("Choose all the options to proceed");
    		} else {
		    	cartPrice = Double.parseDouble(CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getMoney().get(0))*Integer.parseInt(quantity.getText()) + cartPrice;
				cart.setText("CHECK OUT \n (" + cartPrice + ")");
		    	Main.indexControl.getButton().setText("CHECK OUT \n (" +cartPrice + ")");
		    	CustomizePizza.start();
		    	bug.setText("");
		    	loadDatabase();
    		}
    	}catch(Exception e) {
    		System.out.println("select option");
    	}
    }
    
    
    public void loadDatabase() {
		Main.dialogControl.getUser().customerOrder(Main.dialogControl.getEmail().getText(), CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getCrust(), CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getToppings().toString(), CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getSize(), CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getInstructions(), CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).getPrice(), 0.0, 0.0);
	}


	@FXML
    void checkOut() {
    	Main.loadAdviceBox();
    	Main.end();
    }
    
    @FXML
    void addCrust() {
    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setCrust(crust.getItems().get(0).getText());
    }
    
    @FXML
    void addInstructions() {
    	System.out.println(instruction.getItems().get(2).getText());
    	CustomizePizza.order.get(CustomizePizza.pizzaNumber-1).setInstructions(instruction.getItems().get(2).getText());
    }
    
    @FXML
    void goBack() {
    	Main.again();
    }
    
    public Group getPizza() {
    	return pizza;
    }
    
    public ImageView getBase() {
    	return base;
    }
    
    @FXML
    void normal() {
    	quantity.setText("0");
    }
    
    public ImageView getUser() {
    	return user;
    }
    

    
    
    
  

}


