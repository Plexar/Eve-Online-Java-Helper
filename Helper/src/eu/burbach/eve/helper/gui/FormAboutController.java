package eu.burbach.eve.helper.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Popup;

public class FormAboutController {

    static Popup popupAbout;
    @FXML AnchorPane about;
	@FXML TextArea textAreaAbout;

	@FXML protected void initialize() {
		popupAbout= new Popup();
    	popupAbout.getContent().addAll(about);
    	
    	textAreaAbout.setText("Simple Eve Helper "+FxMain.VERSION+"\n"+
    	        "Einfaches Unterstützungsprogramm für Eve Online\n"+
    			"Autor: Holger Burbach\n"+
    			"Lizenz: CC-BY-SA-NC 3.0");
    	
    	popupAbout.centerOnScreen();
	}
	
	@FXML protected void commandAboutClose(ActionEvent event) {
    	popupAbout.hide();
    }

	public static Popup getPopup() {
		return popupAbout;
	}
}
