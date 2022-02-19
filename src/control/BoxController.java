package control;

import java.io.IOException;

import exceptions.PasswordNotEqualsException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import model.Password;

public class BoxController{

    @FXML
    private Button enterBUT;

    @FXML
    private TextField firstTF;

    @FXML
    private TextField secondTF;

    @FXML
    private TextField thirtTF;

    @FXML
    private TextField foutrTF;

    @FXML
    private TextField fiveTF;

    @FXML
    private TextField sixTF;

    @FXML
    void verifyKEY(ActionEvent event) throws PasswordNotEqualsException, IOException {
    	String writed = "";
    	TextField[] arrayTF = {firstTF,secondTF,thirtTF,foutrTF,fiveTF,sixTF};
    	for(int i = 0; i<arrayTF.length;i++) {
    		writed+=arrayTF[i].getText();
    	}
    	if(writed.equals(Password.pass.get(0))) {
    		Stage stage = (Stage) enterBUT.getScene().getWindow();
    		showConteinWindow();
    		stage.close();
    	}else {
    		throw new PasswordNotEqualsException();
    	}
    }
    
    

	private void showConteinWindow() throws IOException {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Contein.fxml"));
		loader.setController(new ConteinController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
	
	

}
