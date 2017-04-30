package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * alliance object
 */
@ApiModel(description = "alliance object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCorporationsCorporationIdAlliancehistoryAlliance {
  @SerializedName("alliance_id")
  private Integer allianceId = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  public GetCorporationsCorporationIdAlliancehistoryAlliance allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

   /**
   * alliance_id integer
   * @return allianceId
  **/
  @ApiModelProperty(required = true, value = "alliance_id integer")
  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetCorporationsCorporationIdAlliancehistoryAlliance isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * True if the alliance has been deleted
   * @return isDeleted
  **/
  @ApiModelProperty(required = true, value = "True if the alliance has been deleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdAlliancehistoryAlliance getCorporationsCorporationIdAlliancehistoryAlliance = (GetCorporationsCorporationIdAlliancehistoryAlliance) o;
    return Objects.equals(this.allianceId, getCorporationsCorporationIdAlliancehistoryAlliance.allianceId) &&
        Objects.equals(this.isDeleted, getCorporationsCorporationIdAlliancehistoryAlliance.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, isDeleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdAlliancehistoryAlliance {\n");
    
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

