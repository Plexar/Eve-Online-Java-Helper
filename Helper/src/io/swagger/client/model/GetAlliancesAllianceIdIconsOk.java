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
public class GetAlliancesAllianceIdIconsOk {
  @SerializedName("px128x128")
  private String px128x128 = null;

  @SerializedName("px64x64")
  private String px64x64 = null;

  public GetAlliancesAllianceIdIconsOk px128x128(String px128x128) {
    this.px128x128 = px128x128;
    return this;
  }

   /**
   * px128x128 string
   * @return px128x128
  **/
  @ApiModelProperty(value = "px128x128 string")
  public String getPx128x128() {
    return px128x128;
  }

  public void setPx128x128(String px128x128) {
    this.px128x128 = px128x128;
  }

  public GetAlliancesAllianceIdIconsOk px64x64(String px64x64) {
    this.px64x64 = px64x64;
    return this;
  }

   /**
   * px64x64 string
   * @return px64x64
  **/
  @ApiModelProperty(value = "px64x64 string")
  public String getPx64x64() {
    return px64x64;
  }

  public void setPx64x64(String px64x64) {
    this.px64x64 = px64x64;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlliancesAllianceIdIconsOk getAlliancesAllianceIdIconsOk = (GetAlliancesAllianceIdIconsOk) o;
    return Objects.equals(this.px128x128, getAlliancesAllianceIdIconsOk.px128x128) &&
        Objects.equals(this.px64x64, getAlliancesAllianceIdIconsOk.px64x64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(px128x128, px64x64);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlliancesAllianceIdIconsOk {\n");
    
    sb.append("    px128x128: ").append(toIndentedString(px128x128)).append("\n");
    sb.append("    px64x64: ").append(toIndentedString(px64x64)).append("\n");
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

