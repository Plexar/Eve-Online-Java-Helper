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
public class GetCorporationsNames200Ok {
  @SerializedName("corporation_id")
  private Integer corporationId = null;

  @SerializedName("corporation_name")
  private String corporationName = null;

  public GetCorporationsNames200Ok corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

   /**
   * corporation_id integer
   * @return corporationId
  **/
  @ApiModelProperty(required = true, value = "corporation_id integer")
  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetCorporationsNames200Ok corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

   /**
   * corporation_name string
   * @return corporationName
  **/
  @ApiModelProperty(required = true, value = "corporation_name string")
  public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsNames200Ok getCorporationsNames200Ok = (GetCorporationsNames200Ok) o;
    return Objects.equals(this.corporationId, getCorporationsNames200Ok.corporationId) &&
        Objects.equals(this.corporationName, getCorporationsNames200Ok.corporationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationId, corporationName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsNames200Ok {\n");
    
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    corporationName: ").append(toIndentedString(corporationName)).append("\n");
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

