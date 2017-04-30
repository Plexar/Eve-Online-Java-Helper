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
public class GetCharactersCharacterIdAgentsResearch200Ok {
  @SerializedName("agent_id")
  private Integer agentId = null;

  @SerializedName("points_per_day")
  private Float pointsPerDay = null;

  @SerializedName("remainder_points")
  private Float remainderPoints = null;

  @SerializedName("skill_type_id")
  private Integer skillTypeId = null;

  @SerializedName("started_at")
  private DateTime startedAt = null;

  public GetCharactersCharacterIdAgentsResearch200Ok agentId(Integer agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * agent_id integer
   * @return agentId
  **/
  @ApiModelProperty(required = true, value = "agent_id integer")
  public Integer getAgentId() {
    return agentId;
  }

  public void setAgentId(Integer agentId) {
    this.agentId = agentId;
  }

  public GetCharactersCharacterIdAgentsResearch200Ok pointsPerDay(Float pointsPerDay) {
    this.pointsPerDay = pointsPerDay;
    return this;
  }

   /**
   * points_per_day number
   * @return pointsPerDay
  **/
  @ApiModelProperty(required = true, value = "points_per_day number")
  public Float getPointsPerDay() {
    return pointsPerDay;
  }

  public void setPointsPerDay(Float pointsPerDay) {
    this.pointsPerDay = pointsPerDay;
  }

  public GetCharactersCharacterIdAgentsResearch200Ok remainderPoints(Float remainderPoints) {
    this.remainderPoints = remainderPoints;
    return this;
  }

   /**
   * remainder_points number
   * @return remainderPoints
  **/
  @ApiModelProperty(required = true, value = "remainder_points number")
  public Float getRemainderPoints() {
    return remainderPoints;
  }

  public void setRemainderPoints(Float remainderPoints) {
    this.remainderPoints = remainderPoints;
  }

  public GetCharactersCharacterIdAgentsResearch200Ok skillTypeId(Integer skillTypeId) {
    this.skillTypeId = skillTypeId;
    return this;
  }

   /**
   * skill_type_id integer
   * @return skillTypeId
  **/
  @ApiModelProperty(required = true, value = "skill_type_id integer")
  public Integer getSkillTypeId() {
    return skillTypeId;
  }

  public void setSkillTypeId(Integer skillTypeId) {
    this.skillTypeId = skillTypeId;
  }

  public GetCharactersCharacterIdAgentsResearch200Ok startedAt(DateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * started_at string
   * @return startedAt
  **/
  @ApiModelProperty(required = true, value = "started_at string")
  public DateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(DateTime startedAt) {
    this.startedAt = startedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdAgentsResearch200Ok getCharactersCharacterIdAgentsResearch200Ok = (GetCharactersCharacterIdAgentsResearch200Ok) o;
    return Objects.equals(this.agentId, getCharactersCharacterIdAgentsResearch200Ok.agentId) &&
        Objects.equals(this.pointsPerDay, getCharactersCharacterIdAgentsResearch200Ok.pointsPerDay) &&
        Objects.equals(this.remainderPoints, getCharactersCharacterIdAgentsResearch200Ok.remainderPoints) &&
        Objects.equals(this.skillTypeId, getCharactersCharacterIdAgentsResearch200Ok.skillTypeId) &&
        Objects.equals(this.startedAt, getCharactersCharacterIdAgentsResearch200Ok.startedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, pointsPerDay, remainderPoints, skillTypeId, startedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdAgentsResearch200Ok {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    pointsPerDay: ").append(toIndentedString(pointsPerDay)).append("\n");
    sb.append("    remainderPoints: ").append(toIndentedString(remainderPoints)).append("\n");
    sb.append("    skillTypeId: ").append(toIndentedString(skillTypeId)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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

