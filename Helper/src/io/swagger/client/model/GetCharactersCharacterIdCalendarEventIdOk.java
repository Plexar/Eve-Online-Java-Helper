package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * Full details of a specific event
 */
@ApiModel(description = "Full details of a specific event")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdCalendarEventIdOk {
  @SerializedName("duration_in_minutes")
  private Integer durationInMinutes = null;

  @SerializedName("event_date")
  private DateTime eventDate = null;

  @SerializedName("event_id")
  private Integer eventId = null;

  @SerializedName("event_response")
  private String eventResponse = null;

  @SerializedName("event_text")
  private String eventText = null;

  @SerializedName("importance")
  private Integer importance = null;

  @SerializedName("owner_id")
  private Integer ownerId = null;

  @SerializedName("owner_name")
  private String ownerName = null;

  @SerializedName("owner_type_id")
  private Integer ownerTypeId = null;

  @SerializedName("title")
  private String title = null;

  public GetCharactersCharacterIdCalendarEventIdOk durationInMinutes(Integer durationInMinutes) {
    this.durationInMinutes = durationInMinutes;
    return this;
  }

   /**
   * duration_in_minutes integer
   * @return durationInMinutes
  **/
  @ApiModelProperty(value = "duration_in_minutes integer")
  public Integer getDurationInMinutes() {
    return durationInMinutes;
  }

  public void setDurationInMinutes(Integer durationInMinutes) {
    this.durationInMinutes = durationInMinutes;
  }

  public GetCharactersCharacterIdCalendarEventIdOk eventDate(DateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * event_date string
   * @return eventDate
  **/
  @ApiModelProperty(value = "event_date string")
  public DateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(DateTime eventDate) {
    this.eventDate = eventDate;
  }

  public GetCharactersCharacterIdCalendarEventIdOk eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * event_id integer
   * @return eventId
  **/
  @ApiModelProperty(value = "event_id integer")
  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public GetCharactersCharacterIdCalendarEventIdOk eventResponse(String eventResponse) {
    this.eventResponse = eventResponse;
    return this;
  }

   /**
   * event_response string
   * @return eventResponse
  **/
  @ApiModelProperty(value = "event_response string")
  public String getEventResponse() {
    return eventResponse;
  }

  public void setEventResponse(String eventResponse) {
    this.eventResponse = eventResponse;
  }

  public GetCharactersCharacterIdCalendarEventIdOk eventText(String eventText) {
    this.eventText = eventText;
    return this;
  }

   /**
   * event_text string
   * @return eventText
  **/
  @ApiModelProperty(value = "event_text string")
  public String getEventText() {
    return eventText;
  }

  public void setEventText(String eventText) {
    this.eventText = eventText;
  }

  public GetCharactersCharacterIdCalendarEventIdOk importance(Integer importance) {
    this.importance = importance;
    return this;
  }

   /**
   * importance integer
   * @return importance
  **/
  @ApiModelProperty(value = "importance integer")
  public Integer getImportance() {
    return importance;
  }

  public void setImportance(Integer importance) {
    this.importance = importance;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * owner_id integer
   * @return ownerId
  **/
  @ApiModelProperty(value = "owner_id integer")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * owner_name string
   * @return ownerName
  **/
  @ApiModelProperty(value = "owner_name string")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerTypeId(Integer ownerTypeId) {
    this.ownerTypeId = ownerTypeId;
    return this;
  }

   /**
   * owner_type_id integer
   * @return ownerTypeId
  **/
  @ApiModelProperty(value = "owner_type_id integer")
  public Integer getOwnerTypeId() {
    return ownerTypeId;
  }

  public void setOwnerTypeId(Integer ownerTypeId) {
    this.ownerTypeId = ownerTypeId;
  }

  public GetCharactersCharacterIdCalendarEventIdOk title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title string
   * @return title
  **/
  @ApiModelProperty(value = "title string")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdCalendarEventIdOk getCharactersCharacterIdCalendarEventIdOk = (GetCharactersCharacterIdCalendarEventIdOk) o;
    return Objects.equals(this.durationInMinutes, getCharactersCharacterIdCalendarEventIdOk.durationInMinutes) &&
        Objects.equals(this.eventDate, getCharactersCharacterIdCalendarEventIdOk.eventDate) &&
        Objects.equals(this.eventId, getCharactersCharacterIdCalendarEventIdOk.eventId) &&
        Objects.equals(this.eventResponse, getCharactersCharacterIdCalendarEventIdOk.eventResponse) &&
        Objects.equals(this.eventText, getCharactersCharacterIdCalendarEventIdOk.eventText) &&
        Objects.equals(this.importance, getCharactersCharacterIdCalendarEventIdOk.importance) &&
        Objects.equals(this.ownerId, getCharactersCharacterIdCalendarEventIdOk.ownerId) &&
        Objects.equals(this.ownerName, getCharactersCharacterIdCalendarEventIdOk.ownerName) &&
        Objects.equals(this.ownerTypeId, getCharactersCharacterIdCalendarEventIdOk.ownerTypeId) &&
        Objects.equals(this.title, getCharactersCharacterIdCalendarEventIdOk.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationInMinutes, eventDate, eventId, eventResponse, eventText, importance, ownerId, ownerName, ownerTypeId, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdCalendarEventIdOk {\n");
    
    sb.append("    durationInMinutes: ").append(toIndentedString(durationInMinutes)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventResponse: ").append(toIndentedString(eventResponse)).append("\n");
    sb.append("    eventText: ").append(toIndentedString(eventText)).append("\n");
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerTypeId: ").append(toIndentedString(ownerTypeId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

