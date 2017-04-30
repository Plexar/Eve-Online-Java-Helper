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
public class GetUniverseSystemJumps200Ok {
  @SerializedName("ship_jumps")
  private Integer shipJumps = null;

  @SerializedName("system_id")
  private Integer systemId = null;

  public GetUniverseSystemJumps200Ok shipJumps(Integer shipJumps) {
    this.shipJumps = shipJumps;
    return this;
  }

   /**
   * ship_jumps integer
   * @return shipJumps
  **/
  @ApiModelProperty(required = true, value = "ship_jumps integer")
  public Integer getShipJumps() {
    return shipJumps;
  }

  public void setShipJumps(Integer shipJumps) {
    this.shipJumps = shipJumps;
  }

  public GetUniverseSystemJumps200Ok systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * system_id integer
   * @return systemId
  **/
  @ApiModelProperty(required = true, value = "system_id integer")
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
    GetUniverseSystemJumps200Ok getUniverseSystemJumps200Ok = (GetUniverseSystemJumps200Ok) o;
    return Objects.equals(this.shipJumps, getUniverseSystemJumps200Ok.shipJumps) &&
        Objects.equals(this.systemId, getUniverseSystemJumps200Ok.systemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipJumps, systemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseSystemJumps200Ok {\n");
    
    sb.append("    shipJumps: ").append(toIndentedString(shipJumps)).append("\n");
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

