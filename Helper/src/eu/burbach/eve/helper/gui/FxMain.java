package eu.burbach.eve.helper.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxMain extends Application {
	
	public static final String VERSION="22.04.2017";

	public static Stage st=null;
	
	@Override
	public void start(Stage stage) throws Exception {
        FXMLLoader.load(getClass().getResource("/eu/burbach/eve/helper/gui/FormAbout.fxml"));

		Parent root = FXMLLoader.load(getClass().getResource("/eu/burbach/eve/helper/gui/FormMain.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Simple Eve Helper "+VERSION);
        stage.setScene(scene);
        stage.show();
        st= stage;
	}
	
	public static Stage getStage() {
		return st;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
