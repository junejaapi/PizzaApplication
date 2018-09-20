package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class IndexController {
	private DecimalFormat d2 = new DecimalFormat(".##");
	
	@FXML
	private Button slider;
	
	@FXML
	private ImageView drinks;
	
	@FXML
	private ImageView wings;
	
	@FXML
	private ImageView order;
	
	@FXML
	private Button cart;
	
	@FXML
	private ImageView slideright;
	
	@FXML
	private ImageView slideleft;
	
	@FXML
	private ImageView user;
	
	private int r;
	
	public void ButtonSetups() {
		ImageView img = new ImageView(new Image("file:C:\\Assignment1_Ashish_Juneja_Eclipse\\Images\\xlpizza.png"));
		img.setFitWidth(463);
		img.setFitHeight(232);
		slider.setGraphic(img);
	}
	
	public Button getButton() {
		return cart;
	}
	
	public void changeCartPrice() {
		cart.setText("CHECKOUT");
	}
	
	@FXML
	public void buyDrinks() {

	}
	
	@FXML
	public void buyWings() {
		
	}
	
	@FXML
	public void customizePizza() {
		Main.changeScene();
	}
	
	@FXML
	void checkOut() {

	}
	
	@FXML
	public void slideRight() {
		System.out.println(r);
		ImageView img = new ImageView(new Image("file:"+slider(randomGenerator())));
		img.setFitWidth(463);
		img.setFitHeight(232);
		slider.setGraphic(img);
		
	}
	
	@FXML
	public void slideLeft() {
		System.out.println(r);
		ImageView img = new ImageView(new Image("file:"+slider(randomGenerator())));
		img.setFitWidth(463);
		img.setFitHeight(232);
		slider.setGraphic(img);
	}
	
	
	public String slider(int num) {
		if(num >=1 && num <5 ) 
			return "C:\\Assignment1_Ashish_Juneja_Eclipse\\Images\\cauliflower.png";
		else if(num >=5 && num <10)
			return "C:\\Assignment1_Ashish_Juneja_Eclipse\\Images\\chicken.png";
		else if(num >=10 && num <15) 
			return "C:\\Assignment1_Ashish_Juneja_Eclipse\\Images\\offer1.png";
		else 
			return "C:\\Assignment1_Ashish_Juneja_Eclipse\\Images\\offer2.png";
	}
	
	@FXML
	public void login() {
		Main.userPage();
	}
	
	public int randomGenerator() {
		 r = new Random().nextInt((20 - 1) + 1) + 1;
		 return r;
	}
	
	public ImageView getUser() {
    	return user;
    }

	
}
