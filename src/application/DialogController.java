package application;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;

public class DialogController {

    @FXML
    private TextField email;
    
    @FXML
    private Button google;
    
    @FXML
    private Label bug;
    
    private ImageView signin = new ImageView(new Image("file:C:\\Project_AshishJuneja_Eclipse\\Images\\google.png"));
    private ArrayList<String> coupons = new ArrayList<String>();
    
    private DataBase user = new DataBase();
    
    public void setup() {
    	addCouponCode();
    	signin.setFitHeight(48);
    	signin.setFitWidth(200);
    	google.setLayoutX(150);
    	google.setLayoutY(148);
    	google.setGraphic(signin);
    }

    @FXML
    void sendCode(ActionEvent event) {
    	
    	if(email.getText().matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
        	sendEmail();
        	user.profile(email.getText(), couponGenerator(), "");
        	coupons.remove(0);
        	Main.d.close();
    	}
    	else {
    		bug.setText("Email id entered does not matches the regular expression");
    	}
    }
    
    @FXML
    void closeDialog(ActionEvent event) {
    	Main.d.close();
    }
    
    @FXML
    void removeLabel() {
    	bug.setText("");
    }
    
    public String couponGenerator() {
    	String coupon = coupons.get(0);
    	return coupon;
    }

	public void sendEmail() {
		try{
			Properties props = new Properties();
			props.put("mail.transport.protocol", "smtps");
			props.put("mail.smtps.host", "smtp.gmail.com");
			props.put("mail.smtps.port", "465");
			props.put("mail.smtps.auth", "true");
			props.put("mail.smtps.quitwait", "false");
			
			Session session = Session.getDefaultInstance(props);
			
			Message message = new MimeMessage(session);
			message.setSubject("THANKYOU!");
			message.setText(couponGenerator());
			
			Address fromAddress = new InternetAddress("sheridanpizza@gmail.com");
			Address toAddress = new InternetAddress(Main.dialogControl.email.getText());
			message.setFrom(fromAddress);
			message.setRecipient(Message.RecipientType.TO, toAddress);
			
			Transport transport = session.getTransport();
			transport.connect("sheridanpizza@gmail.com", "sheridan1234");
			transport.sendMessage(message, message.getAllRecipients());
		}catch(MessagingException e) {
			System.out.println("message not sent");
			System.out.println(e);
		}
	}
	
	public void addCouponCode() {
		coupons.add("X6RgzCXb");
		coupons.add("aPnRRTF8");
		coupons.add("AuBVwynK");
		coupons.add("jLZP5GMJ");
		coupons.add("jb5WqStj");
	}
	
	public DataBase getUser() {
		return user;
	}

	public TextField getEmail() {
		return email;
	}

}
