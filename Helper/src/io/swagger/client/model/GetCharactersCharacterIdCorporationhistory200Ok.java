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
public class GetCharactersCharacterIdCorporationhistory200Ok {
  @SerializedName("corporation_id")
  private Integer corporationId = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("record_id")
  private Integer recordId = null;

  @SerializedName("start_date")
  private DateTime startDate = null;

  public GetCharactersCharacterIdCorporationhistory200Ok corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

   /**
   * corporation_id integer
   * @return corporationId
  **/
  @ApiModelProperty(value = "corporation_id integer")
  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetCharactersCharacterIdCorporationhistory200Ok isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * True if the corporation has been deleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "True if the corporation has been deleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public GetCharactersCharacterIdCorporationhistory200Ok recordId(Integer recordId) {
    this.recordId = recordId;
    return this;
  }

   /**
   * An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous
   * @return recordId
  **/
  @ApiModelProperty(value = "An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous")
  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }

  public GetCharactersCharacterIdCorporationhistory200Ok startDate(DateTime startDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdCorporationhistory200Ok getCharactersCharacterIdCorporationhistory200Ok = (GetCharactersCharacterIdCorporationhistory200Ok) o;
    return Objects.equals(this.corporationId, getCharactersCharacterIdCorporationhistory200Ok.corporationId) &&
        Objects.equals(this.isDeleted, getCharactersCharacterIdCorporationhistory200Ok.isDeleted) &&
        Objects.equals(this.recordId, getCharactersCharacterIdCorporationhistory200Ok.recordId) &&
        Objects.equals(this.startDate, getCharactersCharacterIdCorporationhistory200Ok.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationId, isDeleted, recordId, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdCorporationhistory200Ok {\n");
    
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

