package control;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import main.Main;

public class ConteinController {

    @FXML
    private Button changePassBUT;

    @FXML
    private Button closeBUT;

    @FXML
    private TextArea tA;

    @FXML
    void changePass(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/ChangePassword.fxml"));
		loader.setController(new ChangePasswordController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		stage = (Stage) changePassBUT.getScene().getWindow();
		stage.close();
    }

    @FXML
    void close(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Box.fxml"));
		loader.setController(new BoxController());
		Parent parent = (Parent) loader.load();
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    	stage = (Stage) closeBUT.getScene().getWindow();
		stage.close();
    }

}
