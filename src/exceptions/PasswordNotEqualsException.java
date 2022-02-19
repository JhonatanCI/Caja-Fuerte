package exceptions;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PasswordNotEqualsException extends Exception {
	
	public PasswordNotEqualsException() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Invalid Password");
		alert.setHeaderText("You didn't write corret password");
		alert.setContentText("The password is incorrect please try again!");

		alert.showAndWait();
	}


}
