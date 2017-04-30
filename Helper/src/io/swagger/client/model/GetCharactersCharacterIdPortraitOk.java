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
public class GetCharactersCharacterIdPortraitOk {
  @SerializedName("128x128")
  private String _128x128 = null;

  @SerializedName("256x256")
  private String _256x256 = null;

  @SerializedName("512x512")
  private String _512x512 = null;

  @SerializedName("64x64")
  private String _64x64 = null;

  public GetCharactersCharacterIdPortraitOk _128x128(String _128x128) {
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

  public GetCharactersCharacterIdPortraitOk _256x256(String _256x256) {
    this._256x256 = _256x256;
    return this;
  }

   /**
   * 256x256 string
   * @return _256x256
  **/
  @ApiModelProperty(value = "256x256 string")
  public String get256x256() {
    return _256x256;
  }

  public void set256x256(String _256x256) {
    this._256x256 = _256x256;
  }

  public GetCharactersCharacterIdPortraitOk _512x512(String _512x512) {
    this._512x512 = _512x512;
    return this;
  }

   /**
   * 512x512 string
   * @return _512x512
  **/
  @ApiModelProperty(value = "512x512 string")
  public String get512x512() {
    return _512x512;
  }

  public void set512x512(String _512x512) {
    this._512x512 = _512x512;
  }

  public GetCharactersCharacterIdPortraitOk _64x64(String _64x64) {
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
    GetCharactersCharacterIdPortraitOk getCharactersCharacterIdPortraitOk = (GetCharactersCharacterIdPortraitOk) o;
    return Objects.equals(this._128x128, getCharactersCharacterIdPortraitOk._128x128) &&
        Objects.equals(this._256x256, getCharactersCharacterIdPortraitOk._256x256) &&
        Objects.equals(this._512x512, getCharactersCharacterIdPortraitOk._512x512) &&
        Objects.equals(this._64x64, getCharactersCharacterIdPortraitOk._64x64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_128x128, _256x256, _512x512, _64x64);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPortraitOk {\n");
    
    sb.append("    _128x128: ").append(toIndentedString(_128x128)).append("\n");
    sb.append("    _256x256: ").append(toIndentedString(_256x256)).append("\n");
    sb.append("    _512x512: ").append(toIndentedString(_512x512)).append("\n");
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

