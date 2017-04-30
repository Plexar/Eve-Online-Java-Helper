package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetUniverseStructuresStructureIdPosition;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetUniverseStructuresStructureIdOk {
  @SerializedName("name")
  private String name = null;

  @SerializedName("position")
  private GetUniverseStructuresStructureIdPosition position = null;

  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetUniverseStructuresStructureIdOk name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The full name of the structure
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The full name of the structure")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetUniverseStructuresStructureIdOk position(GetUniverseStructuresStructureIdPosition position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public GetUniverseStructuresStructureIdPosition getPosition() {
    return position;
  }

  public void setPosition(GetUniverseStructuresStructureIdPosition position) {
    this.position = position;
  }

  public GetUniverseStructuresStructureIdOk solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * solar_system_id integer
   * @return solarSystemId
  **/
  @ApiModelProperty(required = true, value = "solar_system_id integer")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetUniverseStructuresStructureIdOk typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * type_id integer
   * @return typeId
  **/
  @ApiModelProperty(value = "type_id integer")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseStructuresStructureIdOk getUniverseStructuresStructureIdOk = (GetUniverseStructuresStructureIdOk) o;
    return Objects.equals(this.name, getUniverseStructuresStructureIdOk.name) &&
        Objects.equals(this.position, getUniverseStructuresStructureIdOk.position) &&
        Objects.equals(this.solarSystemId, getUniverseStructuresStructureIdOk.solarSystemId) &&
        Objects.equals(this.typeId, getUniverseStructuresStructureIdOk.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, position, solarSystemId, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseStructuresStructureIdOk {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

