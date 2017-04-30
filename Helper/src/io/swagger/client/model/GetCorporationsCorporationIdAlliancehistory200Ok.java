package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetCorporationsCorporationIdAlliancehistoryAlliance;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCorporationsCorporationIdAlliancehistory200Ok {
  @SerializedName("alliance")
  private GetCorporationsCorporationIdAlliancehistoryAlliance alliance = null;

  @SerializedName("record_id")
  private Integer recordId = null;

  @SerializedName("start_date")
  private DateTime startDate = null;

  public GetCorporationsCorporationIdAlliancehistory200Ok alliance(GetCorporationsCorporationIdAlliancehistoryAlliance alliance) {
    this.alliance = alliance;
    return this;
  }

   /**
   * Get alliance
   * @return alliance
  **/
  @ApiModelProperty(value = "")
  public GetCorporationsCorporationIdAlliancehistoryAlliance getAlliance() {
    return alliance;
  }

  public void setAlliance(GetCorporationsCorporationIdAlliancehistoryAlliance alliance) {
    this.alliance = alliance;
  }

  public GetCorporationsCorporationIdAlliancehistory200Ok recordId(Integer recordId) {
    this.recordId = recordId;
    return this;
  }

   /**
   * An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous
   * @return recordId
  **/
  @ApiModelProperty(required = true, value = "An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous")
  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }

  public GetCorporationsCorporationIdAlliancehistory200Ok startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * start_date string
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "start_date string")
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
    GetCorporationsCorporationIdAlliancehistory200Ok getCorporationsCorporationIdAlliancehistory200Ok = (GetCorporationsCorporationIdAlliancehistory200Ok) o;
    return Objects.equals(this.alliance, getCorporationsCorporationIdAlliancehistory200Ok.alliance) &&
        Objects.equals(this.recordId, getCorporationsCorporationIdAlliancehistory200Ok.recordId) &&
        Objects.equals(this.startDate, getCorporationsCorporationIdAlliancehistory200Ok.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alliance, recordId, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdAlliancehistory200Ok {\n");
    
    sb.append("    alliance: ").append(toIndentedString(alliance)).append("\n");
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

