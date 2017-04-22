package eu.burbach.eve.helper.gui;

import java.util.Collections;
import java.util.List;
import java.util.prefs.Preferences;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import eu.burbach.eve.api.EveXmlApiAdapter;
import eu.burbach.eve.helper.db.EveChar;
import eu.burbach.eve.helper.db.EveCharSkill;

public class FormMainController {
	@FXML TextField keyid;
	@FXML TextField vcode;
	
	@FXML TabPane tabPane;
	@FXML Tab tabChars;
	@FXML Tab tabSkill;
	
	@FXML TableView<EveChar> charTable;
	@FXML TableColumn<EveChar,String> namecol;
	@FXML TableColumn<EveChar,String> realcol;
	
	@FXML TableView<EveCharSkill> charSkillTable;
	@FXML TableColumn<EveCharSkill,String> queuecol;
	@FXML TableColumn<EveCharSkill,String> typeidcol;
	@FXML TableColumn<EveCharSkill,String> levelcol;
	@FXML TableColumn<EveCharSkill,String> startcol;
	@FXML TableColumn<EveCharSkill,String> endcol;
	
	EveXmlApiAdapter eve;
	
	@FXML protected void initialize() {
		Preferences pref= Preferences.userRoot().node("/eu/burbach/eve/helper");
		keyid.setText(pref.get("keyid", ""));
		vcode.setText(pref.get("vcode", ""));

		namecol.setCellValueFactory(
                new PropertyValueFactory<EveChar,String>("name"));		
		realcol.setCellValueFactory(
                new PropertyValueFactory<EveChar,String>("realName"));
		
		queuecol.setCellValueFactory(
                new PropertyValueFactory<EveCharSkill,String>("queuePosition"));		
		typeidcol.setCellValueFactory(
                new PropertyValueFactory<EveCharSkill,String>("typeId"));		
		levelcol.setCellValueFactory(
                new PropertyValueFactory<EveCharSkill,String>("level"));		
		startcol.setCellValueFactory(
                new PropertyValueFactory<EveCharSkill,String>("startTime"));		
		endcol.setCellValueFactory(
                new PropertyValueFactory<EveCharSkill,String>("endTime"));		
		
		eve= new EveXmlApiAdapter(keyid.getText(), vcode.getText());
		
		commandPlayerCharsLaden(null);
	}
	
    @FXML protected void commandEnde(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML protected void commandPlayerCharsLaden(ActionEvent event) {
    	try {
    		Preferences pref= Preferences.userRoot().node("/eu/burbach/eve/helper");
    		String k= keyid.getText();
    		String v= vcode.getText();
    		if (k==null || k.trim().length()<=0 || v==null || v.trim().length()<=0)
    			return;
    		pref.put("keyid", k);
    		pref.put("vcode", v);
    		List<String> names= eve.getCharacterNames();
    		Collections.sort(names);
    		ObservableList<EveChar> list= FXCollections.observableArrayList();
    		for (String i: names)
    			list.add(new EveChar(i,""));
    		charTable.setItems(list);
    		charSkillTable.setItems(FXCollections.observableArrayList());
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @FXML protected void commandCorpCharsLaden(ActionEvent event) {
    	try {
    		Preferences pref= Preferences.userRoot().node("/eu/burbach/eve/helper");
    		String k= keyid.getText();
    		String v= vcode.getText();
    		if (k==null || k.trim().length()<=0 || v==null || v.trim().length()<=0)
    			return;
    		pref.put("keyid", k);
    		pref.put("vcode", v);
    		List<String> names= eve.getMemberNames();
    		Collections.sort(names);
    		ObservableList<EveChar> list= FXCollections.observableArrayList();
    		for (String i: names)
    			list.add(new EveChar(i,""));
    		charTable.setItems(list);
    		charSkillTable.setItems(FXCollections.observableArrayList());
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @FXML protected void tableCharacterSelected(MouseEvent event) {
    	ObservableList<TablePosition> cells = ((TableView<EveChar>)event.getSource()).getSelectionModel().getSelectedCells();
        if (cells==null || cells.size()<=0)
        	return;
    	
    	List<String> skills= eve.getSkillQueue(eve.charName2Id(namecol.getCellData(cells.get(0).getRow()).toString()));
    	ObservableList<EveCharSkill> list= FXCollections.observableArrayList();
    	for(int i=0; i<skills.size(); i+=5) 
    		list.add(new EveCharSkill(skills.get(i),skills.get(i+1),skills.get(i+2),skills.get(i+3),skills.get(i+4)));
    	charSkillTable.setItems(list);
    	tabPane.getSelectionModel().select(1);
    }

    @FXML protected void commandAbout(ActionEvent event) {
    	FormAboutController.getPopup().show(FxMain.getStage());
    }
        
    @FXML protected void commandHelp(ActionEvent event) {
    	FormHelpController.getPopup().show(FxMain.getStage());   	
    }
}

