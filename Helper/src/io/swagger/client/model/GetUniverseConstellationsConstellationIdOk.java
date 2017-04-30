package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetUniverseConstellationsConstellationIdPosition;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetUniverseConstellationsConstellationIdOk {
  @SerializedName("constellation_id")
  private Integer constellationId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("position")
  private GetUniverseConstellationsConstellationIdPosition position = null;

  @SerializedName("region_id")
  private Integer regionId = null;

  @SerializedName("systems")
  private List<Integer> systems = new ArrayList<Integer>();

  public GetUniverseConstellationsConstellationIdOk constellationId(Integer constellationId) {
    this.constellationId = constellationId;
    return this;
  }

   /**
   * constellation_id integer
   * @return constellationId
  **/
  @ApiModelProperty(required = true, value = "constellation_id integer")
  public Integer getConstellationId() {
    return constellationId;
  }

  public void setConstellationId(Integer constellationId) {
    this.constellationId = constellationId;
  }

  public GetUniverseConstellationsConstellationIdOk name(String name) {
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

  public GetUniverseConstellationsConstellationIdOk position(GetUniverseConstellationsConstellationIdPosition position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public GetUniverseConstellationsConstellationIdPosition getPosition() {
    return position;
  }

  public void setPosition(GetUniverseConstellationsConstellationIdPosition position) {
    this.position = position;
  }

  public GetUniverseConstellationsConstellationIdOk regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * The region this constellation is in
   * @return regionId
  **/
  @ApiModelProperty(required = true, value = "The region this constellation is in")
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public GetUniverseConstellationsConstellationIdOk systems(List<Integer> systems) {
    this.systems = systems;
    return this;
  }

  public GetUniverseConstellationsConstellationIdOk addSystemsItem(Integer systemsItem) {
    this.systems.add(systemsItem);
    return this;
  }

   /**
   * systems array
   * @return systems
  **/
  @ApiModelProperty(required = true, value = "systems array")
  public List<Integer> getSystems() {
    return systems;
  }

  public void setSystems(List<Integer> systems) {
    this.systems = systems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseConstellationsConstellationIdOk getUniverseConstellationsConstellationIdOk = (GetUniverseConstellationsConstellationIdOk) o;
    return Objects.equals(this.constellationId, getUniverseConstellationsConstellationIdOk.constellationId) &&
        Objects.equals(this.name, getUniverseConstellationsConstellationIdOk.name) &&
        Objects.equals(this.position, getUniverseConstellationsConstellationIdOk.position) &&
        Objects.equals(this.regionId, getUniverseConstellationsConstellationIdOk.regionId) &&
        Objects.equals(this.systems, getUniverseConstellationsConstellationIdOk.systems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constellationId, name, position, regionId, systems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseConstellationsConstellationIdOk {\n");
    
    sb.append("    constellationId: ").append(toIndentedString(constellationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    systems: ").append(toIndentedString(systems)).append("\n");
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

