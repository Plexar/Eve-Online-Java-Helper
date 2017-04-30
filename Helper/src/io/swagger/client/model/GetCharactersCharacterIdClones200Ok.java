package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdClones200Ok {
  @SerializedName("implants")
  private List<Integer> implants = new ArrayList<Integer>();

  @SerializedName("location_id")
  private Long locationId = null;

  /**
   * location_type string
   */
  public enum LocationTypeEnum {
    @SerializedName("station")
    STATION("station"),
    
    @SerializedName("structure")
    STRUCTURE("structure");

    private String value;

    LocationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("location_type")
  private LocationTypeEnum locationType = null;

  public GetCharactersCharacterIdClones200Ok implants(List<Integer> implants) {
    this.implants = implants;
    return this;
  }

  public GetCharactersCharacterIdClones200Ok addImplantsItem(Integer implantsItem) {
    this.implants.add(implantsItem);
    return this;
  }

   /**
   * implants array
   * @return implants
  **/
  @ApiModelProperty(value = "implants array")
  public List<Integer> getImplants() {
    return implants;
  }

  public void setImplants(List<Integer> implants) {
    this.implants = implants;
  }

  public GetCharactersCharacterIdClones200Ok locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * location_id integer
   * @return locationId
  **/
  @ApiModelProperty(value = "location_id integer")
  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCharactersCharacterIdClones200Ok locationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * location_type string
   * @return locationType
  **/
  @ApiModelProperty(value = "location_type string")
  public LocationTypeEnum getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdClones200Ok getCharactersCharacterIdClones200Ok = (GetCharactersCharacterIdClones200Ok) o;
    return Objects.equals(this.implants, getCharactersCharacterIdClones200Ok.implants) &&
        Objects.equals(this.locationId, getCharactersCharacterIdClones200Ok.locationId) &&
        Objects.equals(this.locationType, getCharactersCharacterIdClones200Ok.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(implants, locationId, locationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdClones200Ok {\n");
    
    sb.append("    implants: ").append(toIndentedString(implants)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
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

