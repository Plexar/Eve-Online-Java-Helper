package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetCharactersCharacterIdBookmarksCoordinates;
import io.swagger.client.model.GetCharactersCharacterIdBookmarksItem;

/**
 * target object
 */
@ApiModel(description = "target object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdBookmarksTarget {
  @SerializedName("coordinates")
  private GetCharactersCharacterIdBookmarksCoordinates coordinates = null;

  @SerializedName("item")
  private GetCharactersCharacterIdBookmarksItem item = null;

  @SerializedName("location_id")
  private Long locationId = null;

  public GetCharactersCharacterIdBookmarksTarget coordinates(GetCharactersCharacterIdBookmarksCoordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(value = "")
  public GetCharactersCharacterIdBookmarksCoordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(GetCharactersCharacterIdBookmarksCoordinates coordinates) {
    this.coordinates = coordinates;
  }

  public GetCharactersCharacterIdBookmarksTarget item(GetCharactersCharacterIdBookmarksItem item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(value = "")
  public GetCharactersCharacterIdBookmarksItem getItem() {
    return item;
  }

  public void setItem(GetCharactersCharacterIdBookmarksItem item) {
    this.item = item;
  }

  public GetCharactersCharacterIdBookmarksTarget locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * location_id integer
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "location_id integer")
  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdBookmarksTarget getCharactersCharacterIdBookmarksTarget = (GetCharactersCharacterIdBookmarksTarget) o;
    return Objects.equals(this.coordinates, getCharactersCharacterIdBookmarksTarget.coordinates) &&
        Objects.equals(this.item, getCharactersCharacterIdBookmarksTarget.item) &&
        Objects.equals(this.locationId, getCharactersCharacterIdBookmarksTarget.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, item, locationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdBookmarksTarget {\n");
    
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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

