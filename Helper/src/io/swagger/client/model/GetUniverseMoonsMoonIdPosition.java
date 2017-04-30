package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * position object
 */
@ApiModel(description = "position object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetUniverseMoonsMoonIdPosition {
  @SerializedName("x")
  private Float x = null;

  @SerializedName("y")
  private Float y = null;

  @SerializedName("z")
  private Float z = null;

  public GetUniverseMoonsMoonIdPosition x(Float x) {
    this.x = x;
    return this;
  }

   /**
   * x number
   * @return x
  **/
  @ApiModelProperty(required = true, value = "x number")
  public Float getX() {
    return x;
  }

  public void setX(Float x) {
    this.x = x;
  }

  public GetUniverseMoonsMoonIdPosition y(Float y) {
    this.y = y;
    return this;
  }

   /**
   * y number
   * @return y
  **/
  @ApiModelProperty(required = true, value = "y number")
  public Float getY() {
    return y;
  }

  public void setY(Float y) {
    this.y = y;
  }

  public GetUniverseMoonsMoonIdPosition z(Float z) {
    this.z = z;
    return this;
  }

   /**
   * z number
   * @return z
  **/
  @ApiModelProperty(required = true, value = "z number")
  public Float getZ() {
    return z;
  }

  public void setZ(Float z) {
    this.z = z;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseMoonsMoonIdPosition getUniverseMoonsMoonIdPosition = (GetUniverseMoonsMoonIdPosition) o;
    return Objects.equals(this.x, getUniverseMoonsMoonIdPosition.x) &&
        Objects.equals(this.y, getUniverseMoonsMoonIdPosition.y) &&
        Objects.equals(this.z, getUniverseMoonsMoonIdPosition.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseMoonsMoonIdPosition {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

