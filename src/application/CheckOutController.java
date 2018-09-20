package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class CheckOutController {

    @FXML
    private Label total;

    @FXML
    private Group finalPizza;

    @FXML
    private TextField coupon;

    @FXML
    private Label subtotal;

    @FXML
    private ImageView emptyCart;

    @FXML
    private Label discount;

    @FXML
    private Label tax;

    @FXML
    private ImageView user;

    @FXML
    private Label noItems;

    @FXML
    void login(ActionEvent event) {

    }

    @FXML
    void validateCoupon(ActionEvent event) {

    }

    @FXML
    void pay(ActionEvent event) {
    	
    }

    @FXML
    void back(ActionEvent event) {

    }
    
    public ImageView getUser() {
    	return user;
    }

}
