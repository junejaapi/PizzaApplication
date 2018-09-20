package application;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController {
	
	private JFileChooser imageFile;
	private String filePath;

    @FXML
    private ImageView image;

    @FXML
    private Label path;

    @FXML
    private Group finalPizza;

    @FXML
    private ImageView user;

    @FXML
    void login(ActionEvent event) {

    }

    @FXML
    void changeImage() throws IOException {
    	imageFile = new JFileChooser();
    	if(JFileChooser.APPROVE_OPTION == imageFile.showOpenDialog(null)) {
    		java.io.File file = imageFile.getSelectedFile();
	    	this.filePath = file.getPath();
	    	image.setImage(new Image("file:///" + this.filePath));
	    	image.preserveRatioProperty();
	    	image.setFitHeight(250);
	    	image.setFitWidth(270);
	    	System.out.println(this.filePath);
	    	path.setText(this.filePath);
    	}
    }

    @FXML
    void mainPage() {
    	Main.again();
    }
    
    @FXML
    void uploadImage(ActionEvent event) {
    	Main.dialogControl.getUser().updateProfile(Main.dialogControl.getEmail().getText(), this.filePath);
    	user.setImage(new Image("file:///" + this.filePath));
    	user.setFitHeight(76);
    	user.setFitWidth(57);
    	Main.customizeControl.getUser().setImage(new Image("file:///" + this.filePath));
    	Main.indexControl.getUser().setImage(new Image("file:///" + this.filePath));
    }

}
