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

public class ChangePasswordController {

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
    private TextField firstTF1;

    @FXML
    private TextField secondTF1;

    @FXML
    private TextField thirtTF1;

    @FXML
    private TextField foutrTF1;

    @FXML
    private TextField fiveTF1;

    @FXML
    private TextField sixTF1;
    
    @FXML
    private Button closeBUT;

    @FXML
    void close(ActionEvent event) throws IOException{
    	showStart();
    	Stage stage = (Stage) closeBUT.getScene().getWindow();
		stage.close();
    }

    @FXML
    void verifyKEY(ActionEvent event) throws PasswordNotEqualsException, IOException {
    	String writed = "";
    	TextField[] arrayTF = {firstTF,secondTF,thirtTF,foutrTF,fiveTF,sixTF};
    	for(int i = 0; i<arrayTF.length;i++) {
    		writed+=arrayTF[i].getText();
    	}
    	String newPassWord = "";
    	TextField[] arrayTF1 = {firstTF1,secondTF1,thirtTF1,foutrTF1,fiveTF1,sixTF1};
    	for(int i = 0; i<arrayTF1.length;i++) {
    		newPassWord+=arrayTF1[i].getText();
    	}
    	if(writed.equals(Password.pass.get(0))) {
    		Password.pass.set(0, newPassWord);
    		showStart();
    		Stage stage = (Stage) enterBUT.getScene().getWindow();
    		stage.close();
    	}else {
    		throw new PasswordNotEqualsException();
    	}
    }
    
    public void showStart() throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Box.fxml"));
		loader.setController(new BoxController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }

}
