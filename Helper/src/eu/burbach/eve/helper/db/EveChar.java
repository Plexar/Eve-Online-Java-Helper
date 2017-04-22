package eu.burbach.eve.helper.db;

import javafx.beans.property.SimpleStringProperty;

public class EveChar {
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