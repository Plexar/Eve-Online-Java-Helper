package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetCharactersCharacterIdFittingsItem;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdFittings200Ok {
  @SerializedName("description")
  private String description = null;

  @SerializedName("fitting_id")
  private Integer fittingId = null;

  @SerializedName("items")
  private List<GetCharactersCharacterIdFittingsItem> items = new ArrayList<GetCharactersCharacterIdFittingsItem>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("ship_type_id")
  private Integer shipTypeId = null;

  public GetCharactersCharacterIdFittings200Ok description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description string
   * @return description
  **/
  @ApiModelProperty(required = true, value = "description string")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetCharactersCharacterIdFittings200Ok fittingId(Integer fittingId) {
    this.fittingId = fittingId;
    return this;
  }

   /**
   * fitting_id integer
   * @return fittingId
  **/
  @ApiModelProperty(required = true, value = "fitting_id integer")
  public Integer getFittingId() {
    return fittingId;
  }

  public void setFittingId(Integer fittingId) {
    this.fittingId = fittingId;
  }

  public GetCharactersCharacterIdFittings200Ok items(List<GetCharactersCharacterIdFittingsItem> items) {
    this.items = items;
    return this;
  }

  public GetCharactersCharacterIdFittings200Ok addItemsItem(GetCharactersCharacterIdFittingsItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * items array
   * @return items
  **/
  @ApiModelProperty(required = true, value = "items array")
  public List<GetCharactersCharacterIdFittingsItem> getItems() {
    return items;
  }

  public void setItems(List<GetCharactersCharacterIdFittingsItem> items) {
    this.items = items;
  }

  public GetCharactersCharacterIdFittings200Ok name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCharactersCharacterIdFittings200Ok shipTypeId(Integer shipTypeId) {
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
    GetCharactersCharacterIdFittings200Ok getCharactersCharacterIdFittings200Ok = (GetCharactersCharacterIdFittings200Ok) o;
    return Objects.equals(this.description, getCharactersCharacterIdFittings200Ok.description) &&
        Objects.equals(this.fittingId, getCharactersCharacterIdFittings200Ok.fittingId) &&
        Objects.equals(this.items, getCharactersCharacterIdFittings200Ok.items) &&
        Objects.equals(this.name, getCharactersCharacterIdFittings200Ok.name) &&
        Objects.equals(this.shipTypeId, getCharactersCharacterIdFittings200Ok.shipTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fittingId, items, name, shipTypeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdFittings200Ok {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fittingId: ").append(toIndentedString(fittingId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

