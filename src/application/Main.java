package application;
	
import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;



public class Main extends Application  {
	
	public static Stage stage1 = new Stage();
	public static Stage stage2 = new Stage();
	public static Dialog<ButtonType> d = new Dialog<ButtonType>();
	public static Dialog<ButtonType> advice = new Dialog<ButtonType>();
	public static Stage stage3 = new Stage();
	public static Stage stage4 = new Stage();
	
	public static IndexController indexControl;
	public static CustomizeController customizeControl;
	public static DialogController dialogControl;
	public static CheckOutController checkoutControl;
	public static AdviceController adviceControl;
	public static ImageController imageControl; 

	
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader index = new FXMLLoader(getClass().getResource("index.fxml"));
		FXMLLoader customize = new FXMLLoader(getClass().getResource("customize.fxml"));
		FXMLLoader dialog = new FXMLLoader(getClass().getResource("dialog.fxml"));
		FXMLLoader checkout = new FXMLLoader(getClass().getResource("checkout.fxml"));
		FXMLLoader recommendation  = new FXMLLoader(getClass().getResource("advice.fxml"));
		FXMLLoader image = new FXMLLoader(getClass().getResource("upload.fxml"));
		
		Parent root1 = index.load();
		Parent root2 = customize.load();
		Parent root3 = dialog.load();
		Parent root4 = checkout.load();
		Parent root5 =  recommendation.load();
		Parent root6 = image.load();
		
		indexControl = index.getController();
		customizeControl = customize.getController();
		dialogControl = dialog.getController();
		adviceControl = recommendation.getController();
		
		d.getDialogPane().setContent(root3);
		advice.getDialogPane().setContent(root5);
		
		Scene scene1 = new Scene(root1);
		stage1.setScene(scene1);
		Scene scene2 = new Scene(root2);
		stage2.setScene(scene2);
		Scene scene3 = new Scene(root4);
		stage3.setScene(scene3);
		Scene scene4 = new Scene(root6);
		stage4.setScene(scene4);
		
		kickOff();
		
		
	}
	
	public static void end() {
		stage3.show();
		stage1.hide();
		stage2.hide();
	}
	
	public static void kickOff() {
		stage1.show();
		stage2.hide();
		indexControl.ButtonSetups();
		loadDialogBox();
	}
	
	public static void again() {
		stage2.hide();
		stage3.hide();
		stage4.hide();
		indexControl.ButtonSetups();
		stage1.show();

	}
	
	public static void userPage() {
		stage1.hide();
		stage2.hide();
		stage4.show(); 
	}
	
	public static void loadDialogBox() {
		dialogControl.setup();
		d.initStyle(StageStyle.UNDECORATED);
		d.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
		d.getDialogPane().lookupButton(ButtonType.CLOSE).setVisible(false);
		d.showAndWait();
		
	}
	
	public static void loadAdviceBox() {
		advice.initStyle(StageStyle.UNDECORATED);
		advice.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
		advice.getDialogPane().lookupButton(ButtonType.CLOSE).setVisible(false);
		advice.showAndWait();
	}
	
	public static void changeScene() {
		if(CustomizePizza.pizzaNumber==0) {
			CustomizePizza.start();
		}
		else {
			Main.stage2.show();
			Main.stage1.hide();
			System.out.println(CustomizePizza.pizzaNumber);
		}
	}
	


	public static void main(String[] args) {
		launch(args);
		
	}
	
}
