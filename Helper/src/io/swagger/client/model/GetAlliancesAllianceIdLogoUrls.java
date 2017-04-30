package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * logo_urls object
 */
@ApiModel(description = "logo_urls object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetAlliancesAllianceIdLogoUrls {
  @SerializedName("128x128")
  private String _128x128 = null;

  @SerializedName("64x64")
  private String _64x64 = null;

  public GetAlliancesAllianceIdLogoUrls _128x128(String _128x128) {
    this._128x128 = _128x128;
    return this;
  }

   /**
   * 128x128 string
   * @return _128x128
  **/
  @ApiModelProperty(value = "128x128 string")
  public String get128x128() {
    return _128x128;
  }

  public void set128x128(String _128x128) {
    this._128x128 = _128x128;
  }

  public GetAlliancesAllianceIdLogoUrls _64x64(String _64x64) {
    this._64x64 = _64x64;
    return this;
  }

   /**
   * 64x64 string
   * @return _64x64
  **/
  @ApiModelProperty(value = "64x64 string")
  public String get64x64() {
    return _64x64;
  }

  public void set64x64(String _64x64) {
    this._64x64 = _64x64;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlliancesAllianceIdLogoUrls getAlliancesAllianceIdLogoUrls = (GetAlliancesAllianceIdLogoUrls) o;
    return Objects.equals(this._128x128, getAlliancesAllianceIdLogoUrls._128x128) &&
        Objects.equals(this._64x64, getAlliancesAllianceIdLogoUrls._64x64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_128x128, _64x64);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlliancesAllianceIdLogoUrls {\n");
    
    sb.append("    _128x128: ").append(toIndentedString(_128x128)).append("\n");
    sb.append("    _64x64: ").append(toIndentedString(_64x64)).append("\n");
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

