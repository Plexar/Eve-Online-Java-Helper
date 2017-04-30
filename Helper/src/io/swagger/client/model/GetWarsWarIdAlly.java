package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ally object
 */
@ApiModel(description = "ally object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetWarsWarIdAlly {
  @SerializedName("alliance_id")
  private Integer allianceId = null;

  @SerializedName("corporation_id")
  private Integer corporationId = null;

  public GetWarsWarIdAlly allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

   /**
   * Alliance ID if and only if this ally is an alliance
   * @return allianceId
  **/
  @ApiModelProperty(value = "Alliance ID if and only if this ally is an alliance")
  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetWarsWarIdAlly corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

   /**
   * Corporation ID if and only if this ally is a corporation
   * @return corporationId
  **/
  @ApiModelProperty(value = "Corporation ID if and only if this ally is a corporation")
  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWarsWarIdAlly getWarsWarIdAlly = (GetWarsWarIdAlly) o;
    return Objects.equals(this.allianceId, getWarsWarIdAlly.allianceId) &&
        Objects.equals(this.corporationId, getWarsWarIdAlly.corporationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, corporationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarsWarIdAlly {\n");
    
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
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

