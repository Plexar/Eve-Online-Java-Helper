package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetAlliancesNames200Ok {
  @SerializedName("alliance_id")
  private Integer allianceId = null;

  @SerializedName("alliance_name")
  private String allianceName = null;

  public GetAlliancesNames200Ok allianceId(Integer allianceId) {
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

  public GetAlliancesNames200Ok allianceName(String allianceName) {
    this.allianceName = allianceName;
    return this;
  }

   /**
   * alliance_name string
   * @return allianceName
  **/
  @ApiModelProperty(required = true, value = "alliance_name string")
  public String getAllianceName() {
    return allianceName;
  }

  public void setAllianceName(String allianceName) {
    this.allianceName = allianceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlliancesNames200Ok getAlliancesNames200Ok = (GetAlliancesNames200Ok) o;
    return Objects.equals(this.allianceId, getAlliancesNames200Ok.allianceId) &&
        Objects.equals(this.allianceName, getAlliancesNames200Ok.allianceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, allianceName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlliancesNames200Ok {\n");
    
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    allianceName: ").append(toIndentedString(allianceName)).append("\n");
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

