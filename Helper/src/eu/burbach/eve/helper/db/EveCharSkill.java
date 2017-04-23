package eu.burbach.eve.helper.db;

import javafx.beans.property.SimpleStringProperty;

public class EveCharSkill {
	private final SimpleStringProperty queuePosition;
	private final SimpleStringProperty typeId;
	private final SimpleStringProperty level;
	private final SimpleStringProperty startTime;
	private final SimpleStringProperty endTime;
	private final SimpleStringProperty skillPoints;
	
	public EveCharSkill(String queuePosition, String typeId, String level, String startTime, String endTime) {
		this.queuePosition= new SimpleStringProperty(queuePosition);
		this.typeId= new SimpleStringProperty(typeId);
		this.level= new SimpleStringProperty(level);
		this.startTime= new SimpleStringProperty(startTime);
		this.endTime= new SimpleStringProperty(endTime);
		this.skillPoints= new SimpleStringProperty("");		
	}
	
	public EveCharSkill(String typeId, String level, String skillPoints) {
		this("",typeId,level,"","");
		this.skillPoints.set(skillPoints);
	}

	public String getQueuePosition() {
		return queuePosition.get();
	}
	
	public void setQueuePosition(String s) {
		queuePosition.set(s);
	}

	public String getTypeId() {
		return typeId.get();
	}

	public void setTypeId(String s) {
		typeId.set(s);
	}

	public String getLevel() {
		return level.get();
	}
	
	public void setLevel(String s) {
		level.set(s);
	}

	public String getStartTime() {
		return startTime.get();
	}
	
	public void setStartTime(String s) {
		startTime.set(s);
	}

	public String getEndTime() {
		return endTime.get();
	}
	
	public void setEndTime(String s) {
		endTime.set(s);
	}
	
	public String getSkillPoints() {
		return skillPoints.get();
	}
	
	public void setSkillPoints(String s) {
		skillPoints.set(s);
	}
}