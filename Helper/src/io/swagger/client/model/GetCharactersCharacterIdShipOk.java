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
public class GetCharactersCharacterIdShipOk {
  @SerializedName("ship_item_id")
  private Long shipItemId = null;

  @SerializedName("ship_name")
  private String shipName = null;

  @SerializedName("ship_type_id")
  private Integer shipTypeId = null;

  public GetCharactersCharacterIdShipOk shipItemId(Long shipItemId) {
    this.shipItemId = shipItemId;
    return this;
  }

   /**
   * Item id's are unique to a ship and persist until it is repackaged. This value can be used to track repeated uses of a ship, or detect when a pilot changes into a different instance of the same ship type.
   * @return shipItemId
  **/
  @ApiModelProperty(required = true, value = "Item id's are unique to a ship and persist until it is repackaged. This value can be used to track repeated uses of a ship, or detect when a pilot changes into a different instance of the same ship type.")
  public Long getShipItemId() {
    return shipItemId;
  }

  public void setShipItemId(Long shipItemId) {
    this.shipItemId = shipItemId;
  }

  public GetCharactersCharacterIdShipOk shipName(String shipName) {
    this.shipName = shipName;
    return this;
  }

   /**
   * ship_name string
   * @return shipName
  **/
  @ApiModelProperty(required = true, value = "ship_name string")
  public String getShipName() {
    return shipName;
  }

  public void setShipName(String shipName) {
    this.shipName = shipName;
  }

  public GetCharactersCharacterIdShipOk shipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
    return this;
  }

   /**
   * ship_type_id integer
   * @return shipTypeId
  **/
  @ApiModelProperty(required = true, value = "ship_type_id integer")
  public Integer getShipTypeId() {
    return shipTypeId;
  }

  public void setShipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdShipOk getCharactersCharacterIdShipOk = (GetCharactersCharacterIdShipOk) o;
    return Objects.equals(this.shipItemId, getCharactersCharacterIdShipOk.shipItemId) &&
        Objects.equals(this.shipName, getCharactersCharacterIdShipOk.shipName) &&
        Objects.equals(this.shipTypeId, getCharactersCharacterIdShipOk.shipTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipItemId, shipName, shipTypeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdShipOk {\n");
    
    sb.append("    shipItemId: ").append(toIndentedString(shipItemId)).append("\n");
    sb.append("    shipName: ").append(toIndentedString(shipName)).append("\n");
    sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
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

