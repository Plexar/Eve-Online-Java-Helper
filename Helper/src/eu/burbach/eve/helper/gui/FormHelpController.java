package eu.burbach.eve.helper.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Popup;

public class FormHelpController {

    static Popup popup;
    @FXML AnchorPane anchorPane;
	@FXML TextArea textArea;

	@FXML protected void initialize() {
		popup= new Popup();
    	popup.getContent().addAll(anchorPane);
    	
    	textArea.setText("bisher keine Hilfe verfügbar");
    	
    	popup.centerOnScreen();
	}
	
	@FXML protected void commandClose(ActionEvent event) {
    	popup.hide();
    }

	public static Popup getPopup() {
		return popup;
	}
}
