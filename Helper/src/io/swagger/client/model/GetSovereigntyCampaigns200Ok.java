package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetSovereigntyCampaignsParticipant;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetSovereigntyCampaigns200Ok {
  @SerializedName("attackers_score")
  private Float attackersScore = null;

  @SerializedName("campaign_id")
  private Integer campaignId = null;

  @SerializedName("constellation_id")
  private Integer constellationId = null;

  @SerializedName("defender_id")
  private Integer defenderId = null;

  @SerializedName("defender_score")
  private Float defenderScore = null;

  /**
   * Type of event this campaign is for. tcu_defense, ihub_defense and station_defense are referred to as \"Defense Events\", station_freeport as \"Freeport Events\". 
   */
  public enum EventTypeEnum {
    @SerializedName("tcu_defense")
    TCU_DEFENSE("tcu_defense"),
    
    @SerializedName("ihub_defense")
    IHUB_DEFENSE("ihub_defense"),
    
    @SerializedName("station_defense")
    STATION_DEFENSE("station_defense"),
    
    @SerializedName("station_freeport")
    STATION_FREEPORT("station_freeport");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("event_type")
  private EventTypeEnum eventType = null;

  @SerializedName("participants")
  private List<GetSovereigntyCampaignsParticipant> participants = new ArrayList<GetSovereigntyCampaignsParticipant>();

  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("start_time")
  private DateTime startTime = null;

  @SerializedName("structure_id")
  private Long structureId = null;

  public GetSovereigntyCampaigns200Ok attackersScore(Float attackersScore) {
    this.attackersScore = attackersScore;
    return this;
  }

   /**
   * Score for all attacking parties, only present in Defense Events. 
   * @return attackersScore
  **/
  @ApiModelProperty(value = "Score for all attacking parties, only present in Defense Events. ")
  public Float getAttackersScore() {
    return attackersScore;
  }

  public void setAttackersScore(Float attackersScore) {
    this.attackersScore = attackersScore;
  }

  public GetSovereigntyCampaigns200Ok campaignId(Integer campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Unique ID for this campaign.
   * @return campaignId
  **/
  @ApiModelProperty(required = true, value = "Unique ID for this campaign.")
  public Integer getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }

  public GetSovereigntyCampaigns200Ok constellationId(Integer constellationId) {
    this.constellationId = constellationId;
    return this;
  }

   /**
   * The constellation in which the campaign will take place. 
   * @return constellationId
  **/
  @ApiModelProperty(required = true, value = "The constellation in which the campaign will take place. ")
  public Integer getConstellationId() {
    return constellationId;
  }

  public void setConstellationId(Integer constellationId) {
    this.constellationId = constellationId;
  }

  public GetSovereigntyCampaigns200Ok defenderId(Integer defenderId) {
    this.defenderId = defenderId;
    return this;
  }

   /**
   * Defending alliance, only present in Defense Events 
   * @return defenderId
  **/
  @ApiModelProperty(value = "Defending alliance, only present in Defense Events ")
  public Integer getDefenderId() {
    return defenderId;
  }

  public void setDefenderId(Integer defenderId) {
    this.defenderId = defenderId;
  }

  public GetSovereigntyCampaigns200Ok defenderScore(Float defenderScore) {
    this.defenderScore = defenderScore;
    return this;
  }

   /**
   * Score for the defending alliance, only present in Defense Events. 
   * @return defenderScore
  **/
  @ApiModelProperty(value = "Score for the defending alliance, only present in Defense Events. ")
  public Float getDefenderScore() {
    return defenderScore;
  }

  public void setDefenderScore(Float defenderScore) {
    this.defenderScore = defenderScore;
  }

  public GetSovereigntyCampaigns200Ok eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Type of event this campaign is for. tcu_defense, ihub_defense and station_defense are referred to as \"Defense Events\", station_freeport as \"Freeport Events\". 
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "Type of event this campaign is for. tcu_defense, ihub_defense and station_defense are referred to as \"Defense Events\", station_freeport as \"Freeport Events\". ")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public GetSovereigntyCampaigns200Ok participants(List<GetSovereigntyCampaignsParticipant> participants) {
    this.participants = participants;
    return this;
  }

  public GetSovereigntyCampaigns200Ok addParticipantsItem(GetSovereigntyCampaignsParticipant participantsItem) {
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * Alliance participating and their respective scores, only present in Freeport Events. 
   * @return participants
  **/
  @ApiModelProperty(value = "Alliance participating and their respective scores, only present in Freeport Events. ")
  public List<GetSovereigntyCampaignsParticipant> getParticipants() {
    return participants;
  }

  public void setParticipants(List<GetSovereigntyCampaignsParticipant> participants) {
    this.participants = participants;
  }

  public GetSovereigntyCampaigns200Ok solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * The solar system the structure is located in. 
   * @return solarSystemId
  **/
  @ApiModelProperty(required = true, value = "The solar system the structure is located in. ")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetSovereigntyCampaigns200Ok startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Time the event is scheduled to start. 
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "Time the event is scheduled to start. ")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public GetSovereigntyCampaigns200Ok structureId(Long structureId) {
    this.structureId = structureId;
    return this;
  }

   /**
   * The structure item ID that is related to this campaign. 
   * @return structureId
  **/
  @ApiModelProperty(required = true, value = "The structure item ID that is related to this campaign. ")
  public Long getStructureId() {
    return structureId;
  }

  public void setStructureId(Long structureId) {
    this.structureId = structureId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSovereigntyCampaigns200Ok getSovereigntyCampaigns200Ok = (GetSovereigntyCampaigns200Ok) o;
    return Objects.equals(this.attackersScore, getSovereigntyCampaigns200Ok.attackersScore) &&
        Objects.equals(this.campaignId, getSovereigntyCampaigns200Ok.campaignId) &&
        Objects.equals(this.constellationId, getSovereigntyCampaigns200Ok.constellationId) &&
        Objects.equals(this.defenderId, getSovereigntyCampaigns200Ok.defenderId) &&
        Objects.equals(this.defenderScore, getSovereigntyCampaigns200Ok.defenderScore) &&
        Objects.equals(this.eventType, getSovereigntyCampaigns200Ok.eventType) &&
        Objects.equals(this.participants, getSovereigntyCampaigns200Ok.participants) &&
        Objects.equals(this.solarSystemId, getSovereigntyCampaigns200Ok.solarSystemId) &&
        Objects.equals(this.startTime, getSovereigntyCampaigns200Ok.startTime) &&
        Objects.equals(this.structureId, getSovereigntyCampaigns200Ok.structureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attackersScore, campaignId, constellationId, defenderId, defenderScore, eventType, participants, solarSystemId, startTime, structureId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSovereigntyCampaigns200Ok {\n");
    
    sb.append("    attackersScore: ").append(toIndentedString(attackersScore)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    constellationId: ").append(toIndentedString(constellationId)).append("\n");
    sb.append("    defenderId: ").append(toIndentedString(defenderId)).append("\n");
    sb.append("    defenderScore: ").append(toIndentedString(defenderScore)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
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

