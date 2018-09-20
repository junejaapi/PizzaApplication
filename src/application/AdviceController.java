package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AdviceController {

    @FXML
    void addCoke(ActionEvent event) {
    	Main.advice.close();
    }
    
    @FXML
    void doNothing(ActionEvent event) {
    	Main.advice.close();
    }

}
