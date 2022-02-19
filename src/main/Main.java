package main;

import control.BoxController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Password;

public class Main extends Application{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			// TODO Auto-generated method stub
			Password.pass.add("110647");
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Box.fxml"));
			loader.setController(new BoxController());
			Parent parent = (Parent) loader.load();
			Scene scene = new Scene(parent);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		}

}
