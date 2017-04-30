package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * allowed object
 */
@ApiModel(description = "allowed object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdChatChannelsAllowed {
  @SerializedName("accessor_id")
  private Integer accessorId = null;

  /**
   * accessor_type string
   */
  public enum AccessorTypeEnum {
    @SerializedName("character")
    CHARACTER("character"),
    
    @SerializedName("corporation")
    CORPORATION("corporation"),
    
    @SerializedName("alliance")
    ALLIANCE("alliance");

    private String value;

    AccessorTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("accessor_type")
  private AccessorTypeEnum accessorType = null;

  public GetCharactersCharacterIdChatChannelsAllowed accessorId(Integer accessorId) {
    this.accessorId = accessorId;
    return this;
  }

   /**
   * ID of an allowed channel member
   * @return accessorId
  **/
  @ApiModelProperty(required = true, value = "ID of an allowed channel member")
  public Integer getAccessorId() {
    return accessorId;
  }

  public void setAccessorId(Integer accessorId) {
    this.accessorId = accessorId;
  }

  public GetCharactersCharacterIdChatChannelsAllowed accessorType(AccessorTypeEnum accessorType) {
    this.accessorType = accessorType;
    return this;
  }

   /**
   * accessor_type string
   * @return accessorType
  **/
  @ApiModelProperty(required = true, value = "accessor_type string")
  public AccessorTypeEnum getAccessorType() {
    return accessorType;
  }

  public void setAccessorType(AccessorTypeEnum accessorType) {
    this.accessorType = accessorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdChatChannelsAllowed getCharactersCharacterIdChatChannelsAllowed = (GetCharactersCharacterIdChatChannelsAllowed) o;
    return Objects.equals(this.accessorId, getCharactersCharacterIdChatChannelsAllowed.accessorId) &&
        Objects.equals(this.accessorType, getCharactersCharacterIdChatChannelsAllowed.accessorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorId, accessorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdChatChannelsAllowed {\n");
    
    sb.append("    accessorId: ").append(toIndentedString(accessorId)).append("\n");
    sb.append("    accessorType: ").append(toIndentedString(accessorType)).append("\n");
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

