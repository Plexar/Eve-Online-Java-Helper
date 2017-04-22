package eu.burbach.eve.helper.gui;

import java.util.Collections;
import java.util.List;
import java.util.prefs.Preferences;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import eu.burbach.eve.api.EveXmlApiAdapter;

public class FormMainController {
	@FXML TextField keyid;
	@FXML TextField vcode;
	
	@FXML TableView<EveChar> charTable;
	@FXML TableColumn<EveChar,String> namecol;
	@FXML TableColumn<EveChar,String> realcol;
		
	public static class EveChar {
		private final SimpleStringProperty name;
		private final SimpleStringProperty realName;
		
		public EveChar(String name, String realName) {
			this.name = new SimpleStringProperty(name);
			this.realName = new SimpleStringProperty(realName);
		}

		public String getName() {
			return name.get();
		}
		
		public void setName(String s) {
			name.set(s);
		}

		public String getRealName() {
			return realName.get();
		}
		
		public void setRealName(String s) {
			realName.set(s);
		}
	}
	
	@FXML protected void initialize() {
		Preferences pref= Preferences.userRoot().node("/eu/burbach/eve/helper");
		keyid.setText(pref.get("keyid", ""));
		vcode.setText(pref.get("vcode", ""));

		namecol.setCellValueFactory(
                new PropertyValueFactory<EveChar,String>("name"));		
		realcol.setCellValueFactory(
                new PropertyValueFactory<EveChar,String>("realName"));		
	}
	
    @FXML protected void commandEnde(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML protected void commandDatenLaden(ActionEvent event) {
    	try {
    		Preferences pref= Preferences.userRoot().node("/eu/burbach/eve/helper");
    		pref.put("keyid", keyid.getText());
    		pref.put("vcode", vcode.getText());
    		EveXmlApiAdapter eve= new EveXmlApiAdapter(keyid.getText(), vcode.getText());
    		List<String> names= eve.getCharacterNames();
    		Collections.sort(names);
    		ObservableList<EveChar> list= FXCollections.observableArrayList();
    		for (String i: names)
    			list.add(new EveChar(i,""));
    		charTable.setItems(list);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

    @FXML protected void commandAbout(ActionEvent event) {
    	FormAboutController.getPopup().show(FxMain.getStage());
    }
        
    @FXML protected void commandHelp(ActionEvent event) {
    	
    }
}

