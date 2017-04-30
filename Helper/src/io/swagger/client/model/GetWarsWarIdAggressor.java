package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The aggressor corporation or alliance that declared this war, only contains either corporation_id or alliance_id
 */
@ApiModel(description = "The aggressor corporation or alliance that declared this war, only contains either corporation_id or alliance_id")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetWarsWarIdAggressor {
  @SerializedName("alliance_id")
  private Integer allianceId = null;

  @SerializedName("corporation_id")
  private Integer corporationId = null;

  @SerializedName("isk_destroyed")
  private Float iskDestroyed = null;

  @SerializedName("ships_killed")
  private Integer shipsKilled = null;

  public GetWarsWarIdAggressor allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

   /**
   * Alliance ID if and only if the aggressor is an alliance
   * @return allianceId
  **/
  @ApiModelProperty(value = "Alliance ID if and only if the aggressor is an alliance")
  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetWarsWarIdAggressor corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

   /**
   * Corporation ID if and only if the aggressor is a corporation
   * @return corporationId
  **/
  @ApiModelProperty(value = "Corporation ID if and only if the aggressor is a corporation")
  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetWarsWarIdAggressor iskDestroyed(Float iskDestroyed) {
    this.iskDestroyed = iskDestroyed;
    return this;
  }

   /**
   * ISK value of ships the aggressor has destroyed
   * @return iskDestroyed
  **/
  @ApiModelProperty(required = true, value = "ISK value of ships the aggressor has destroyed")
  public Float getIskDestroyed() {
    return iskDestroyed;
  }

  public void setIskDestroyed(Float iskDestroyed) {
    this.iskDestroyed = iskDestroyed;
  }

  public GetWarsWarIdAggressor shipsKilled(Integer shipsKilled) {
    this.shipsKilled = shipsKilled;
    return this;
  }

   /**
   * The number of ships the aggressor has killed
   * @return shipsKilled
  **/
  @ApiModelProperty(required = true, value = "The number of ships the aggressor has killed")
  public Integer getShipsKilled() {
    return shipsKilled;
  }

  public void setShipsKilled(Integer shipsKilled) {
    this.shipsKilled = shipsKilled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWarsWarIdAggressor getWarsWarIdAggressor = (GetWarsWarIdAggressor) o;
    return Objects.equals(this.allianceId, getWarsWarIdAggressor.allianceId) &&
        Objects.equals(this.corporationId, getWarsWarIdAggressor.corporationId) &&
        Objects.equals(this.iskDestroyed, getWarsWarIdAggressor.iskDestroyed) &&
        Objects.equals(this.shipsKilled, getWarsWarIdAggressor.shipsKilled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, corporationId, iskDestroyed, shipsKilled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarsWarIdAggressor {\n");
    
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    iskDestroyed: ").append(toIndentedString(iskDestroyed)).append("\n");
    sb.append("    shipsKilled: ").append(toIndentedString(shipsKilled)).append("\n");
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

