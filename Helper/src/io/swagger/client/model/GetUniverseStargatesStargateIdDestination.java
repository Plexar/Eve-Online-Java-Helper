package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * destination object
 */
@ApiModel(description = "destination object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetUniverseStargatesStargateIdDestination {
  @SerializedName("stargate_id")
  private Integer stargateId = null;

  @SerializedName("system_id")
  private Integer systemId = null;

  public GetUniverseStargatesStargateIdDestination stargateId(Integer stargateId) {
    this.stargateId = stargateId;
    return this;
  }

   /**
   * The stargate this stargate connects to
   * @return stargateId
  **/
  @ApiModelProperty(required = true, value = "The stargate this stargate connects to")
  public Integer getStargateId() {
    return stargateId;
  }

  public void setStargateId(Integer stargateId) {
    this.stargateId = stargateId;
  }

  public GetUniverseStargatesStargateIdDestination systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * The solar system this stargate connects to
   * @return systemId
  **/
  @ApiModelProperty(required = true, value = "The solar system this stargate connects to")
  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseStargatesStargateIdDestination getUniverseStargatesStargateIdDestination = (GetUniverseStargatesStargateIdDestination) o;
    return Objects.equals(this.stargateId, getUniverseStargatesStargateIdDestination.stargateId) &&
        Objects.equals(this.systemId, getUniverseStargatesStargateIdDestination.systemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stargateId, systemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseStargatesStargateIdDestination {\n");
    
    sb.append("    stargateId: ").append(toIndentedString(stargateId)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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

