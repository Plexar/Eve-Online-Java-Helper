package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * waypoint object
 */
@ApiModel(description = "waypoint object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdPlanetsPlanetIdWaypoint {
  @SerializedName("order")
  private Integer order = null;

  @SerializedName("pin_id")
  private Long pinId = null;

  public GetCharactersCharacterIdPlanetsPlanetIdWaypoint order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * order integer
   * minimum: 1
   * maximum: 5
   * @return order
  **/
  @ApiModelProperty(required = true, value = "order integer")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdWaypoint pinId(Long pinId) {
    this.pinId = pinId;
    return this;
  }

   /**
   * pin_id integer
   * @return pinId
  **/
  @ApiModelProperty(required = true, value = "pin_id integer")
  public Long getPinId() {
    return pinId;
  }

  public void setPinId(Long pinId) {
    this.pinId = pinId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdWaypoint getCharactersCharacterIdPlanetsPlanetIdWaypoint = (GetCharactersCharacterIdPlanetsPlanetIdWaypoint) o;
    return Objects.equals(this.order, getCharactersCharacterIdPlanetsPlanetIdWaypoint.order) &&
        Objects.equals(this.pinId, getCharactersCharacterIdPlanetsPlanetIdWaypoint.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, pinId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdWaypoint {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

