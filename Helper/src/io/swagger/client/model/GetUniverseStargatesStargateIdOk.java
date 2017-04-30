package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetUniverseStargatesStargateIdDestination;
import io.swagger.client.model.GetUniverseStargatesStargateIdPosition;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetUniverseStargatesStargateIdOk {
  @SerializedName("destination")
  private GetUniverseStargatesStargateIdDestination destination = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("position")
  private GetUniverseStargatesStargateIdPosition position = null;

  @SerializedName("stargate_id")
  private Integer stargateId = null;

  @SerializedName("system_id")
  private Integer systemId = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetUniverseStargatesStargateIdOk destination(GetUniverseStargatesStargateIdDestination destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")
  public GetUniverseStargatesStargateIdDestination getDestination() {
    return destination;
  }

  public void setDestination(GetUniverseStargatesStargateIdDestination destination) {
    this.destination = destination;
  }

  public GetUniverseStargatesStargateIdOk name(String name) {
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

  public GetUniverseStargatesStargateIdOk position(GetUniverseStargatesStargateIdPosition position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public GetUniverseStargatesStargateIdPosition getPosition() {
    return position;
  }

  public void setPosition(GetUniverseStargatesStargateIdPosition position) {
    this.position = position;
  }

  public GetUniverseStargatesStargateIdOk stargateId(Integer stargateId) {
    this.stargateId = stargateId;
    return this;
  }

   /**
   * stargate_id integer
   * @return stargateId
  **/
  @ApiModelProperty(required = true, value = "stargate_id integer")
  public Integer getStargateId() {
    return stargateId;
  }

  public void setStargateId(Integer stargateId) {
    this.stargateId = stargateId;
  }

  public GetUniverseStargatesStargateIdOk systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * The solar system this stargate is in
   * @return systemId
  **/
  @ApiModelProperty(required = true, value = "The solar system this stargate is in")
  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }

  public GetUniverseStargatesStargateIdOk typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * type_id integer
   * @return typeId
  **/
  @ApiModelProperty(required = true, value = "type_id integer")
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
    GetUniverseStargatesStargateIdOk getUniverseStargatesStargateIdOk = (GetUniverseStargatesStargateIdOk) o;
    return Objects.equals(this.destination, getUniverseStargatesStargateIdOk.destination) &&
        Objects.equals(this.name, getUniverseStargatesStargateIdOk.name) &&
        Objects.equals(this.position, getUniverseStargatesStargateIdOk.position) &&
        Objects.equals(this.stargateId, getUniverseStargatesStargateIdOk.stargateId) &&
        Objects.equals(this.systemId, getUniverseStargatesStargateIdOk.systemId) &&
        Objects.equals(this.typeId, getUniverseStargatesStargateIdOk.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, name, position, stargateId, systemId, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseStargatesStargateIdOk {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    stargateId: ").append(toIndentedString(stargateId)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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

