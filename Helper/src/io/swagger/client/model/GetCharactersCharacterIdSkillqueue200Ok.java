package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdSkillqueue200Ok {
  @SerializedName("finish_date")
  private DateTime finishDate = null;

  @SerializedName("finished_level")
  private Integer finishedLevel = null;

  @SerializedName("level_end_sp")
  private Integer levelEndSp = null;

  @SerializedName("level_start_sp")
  private Integer levelStartSp = null;

  @SerializedName("queue_position")
  private Integer queuePosition = null;

  @SerializedName("skill_id")
  private Integer skillId = null;

  @SerializedName("start_date")
  private DateTime startDate = null;

  @SerializedName("training_start_sp")
  private Integer trainingStartSp = null;

  public GetCharactersCharacterIdSkillqueue200Ok finishDate(DateTime finishDate) {
    this.finishDate = finishDate;
    return this;
  }

   /**
   * finish_date string
   * @return finishDate
  **/
  @ApiModelProperty(value = "finish_date string")
  public DateTime getFinishDate() {
    return finishDate;
  }

  public void setFinishDate(DateTime finishDate) {
    this.finishDate = finishDate;
  }

  public GetCharactersCharacterIdSkillqueue200Ok finishedLevel(Integer finishedLevel) {
    this.finishedLevel = finishedLevel;
    return this;
  }

   /**
   * finished_level integer
   * minimum: 0
   * maximum: 5
   * @return finishedLevel
  **/
  @ApiModelProperty(required = true, value = "finished_level integer")
  public Integer getFinishedLevel() {
    return finishedLevel;
  }

  public void setFinishedLevel(Integer finishedLevel) {
    this.finishedLevel = finishedLevel;
  }

  public GetCharactersCharacterIdSkillqueue200Ok levelEndSp(Integer levelEndSp) {
    this.levelEndSp = levelEndSp;
    return this;
  }

   /**
   * level_end_sp integer
   * @return levelEndSp
  **/
  @ApiModelProperty(value = "level_end_sp integer")
  public Integer getLevelEndSp() {
    return levelEndSp;
  }

  public void setLevelEndSp(Integer levelEndSp) {
    this.levelEndSp = levelEndSp;
  }

  public GetCharactersCharacterIdSkillqueue200Ok levelStartSp(Integer levelStartSp) {
    this.levelStartSp = levelStartSp;
    return this;
  }

   /**
   * Amount of SP that was in the skill when it started training it's current level. Used to calculate % of current level complete.
   * @return levelStartSp
  **/
  @ApiModelProperty(value = "Amount of SP that was in the skill when it started training it's current level. Used to calculate % of current level complete.")
  public Integer getLevelStartSp() {
    return levelStartSp;
  }

  public void setLevelStartSp(Integer levelStartSp) {
    this.levelStartSp = levelStartSp;
  }

  public GetCharactersCharacterIdSkillqueue200Ok queuePosition(Integer queuePosition) {
    this.queuePosition = queuePosition;
    return this;
  }

   /**
   * queue_position integer
   * @return queuePosition
  **/
  @ApiModelProperty(required = true, value = "queue_position integer")
  public Integer getQueuePosition() {
    return queuePosition;
  }

  public void setQueuePosition(Integer queuePosition) {
    this.queuePosition = queuePosition;
  }

  public GetCharactersCharacterIdSkillqueue200Ok skillId(Integer skillId) {
    this.skillId = skillId;
    return this;
  }

   /**
   * skill_id integer
   * @return skillId
  **/
  @ApiModelProperty(required = true, value = "skill_id integer")
  public Integer getSkillId() {
    return skillId;
  }

  public void setSkillId(Integer skillId) {
    this.skillId = skillId;
  }

  public GetCharactersCharacterIdSkillqueue200Ok startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * start_date string
   * @return startDate
  **/
  @ApiModelProperty(value = "start_date string")
  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }

  public GetCharactersCharacterIdSkillqueue200Ok trainingStartSp(Integer trainingStartSp) {
    this.trainingStartSp = trainingStartSp;
    return this;
  }

   /**
   * training_start_sp integer
   * @return trainingStartSp
  **/
  @ApiModelProperty(value = "training_start_sp integer")
  public Integer getTrainingStartSp() {
    return trainingStartSp;
  }

  public void setTrainingStartSp(Integer trainingStartSp) {
    this.trainingStartSp = trainingStartSp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdSkillqueue200Ok getCharactersCharacterIdSkillqueue200Ok = (GetCharactersCharacterIdSkillqueue200Ok) o;
    return Objects.equals(this.finishDate, getCharactersCharacterIdSkillqueue200Ok.finishDate) &&
        Objects.equals(this.finishedLevel, getCharactersCharacterIdSkillqueue200Ok.finishedLevel) &&
        Objects.equals(this.levelEndSp, getCharactersCharacterIdSkillqueue200Ok.levelEndSp) &&
        Objects.equals(this.levelStartSp, getCharactersCharacterIdSkillqueue200Ok.levelStartSp) &&
        Objects.equals(this.queuePosition, getCharactersCharacterIdSkillqueue200Ok.queuePosition) &&
        Objects.equals(this.skillId, getCharactersCharacterIdSkillqueue200Ok.skillId) &&
        Objects.equals(this.startDate, getCharactersCharacterIdSkillqueue200Ok.startDate) &&
        Objects.equals(this.trainingStartSp, getCharactersCharacterIdSkillqueue200Ok.trainingStartSp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishDate, finishedLevel, levelEndSp, levelStartSp, queuePosition, skillId, startDate, trainingStartSp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdSkillqueue200Ok {\n");
    
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
    sb.append("    finishedLevel: ").append(toIndentedString(finishedLevel)).append("\n");
    sb.append("    levelEndSp: ").append(toIndentedString(levelEndSp)).append("\n");
    sb.append("    levelStartSp: ").append(toIndentedString(levelStartSp)).append("\n");
    sb.append("    queuePosition: ").append(toIndentedString(queuePosition)).append("\n");
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    trainingStartSp: ").append(toIndentedString(trainingStartSp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

