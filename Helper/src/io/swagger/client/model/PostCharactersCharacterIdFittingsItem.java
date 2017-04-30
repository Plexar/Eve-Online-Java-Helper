package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * item object
 */
@ApiModel(description = "item object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class PostCharactersCharacterIdFittingsItem {
  @SerializedName("flag")
  private Integer flag = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public PostCharactersCharacterIdFittingsItem flag(Integer flag) {
    this.flag = flag;
    return this;
  }

   /**
   * flag integer
   * @return flag
  **/
  @ApiModelProperty(required = true, value = "flag integer")
  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public PostCharactersCharacterIdFittingsItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity integer
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "quantity integer")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PostCharactersCharacterIdFittingsItem typeId(Integer typeId) {
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
    PostCharactersCharacterIdFittingsItem postCharactersCharacterIdFittingsItem = (PostCharactersCharacterIdFittingsItem) o;
    return Objects.equals(this.flag, postCharactersCharacterIdFittingsItem.flag) &&
        Objects.equals(this.quantity, postCharactersCharacterIdFittingsItem.quantity) &&
        Objects.equals(this.typeId, postCharactersCharacterIdFittingsItem.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, quantity, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdFittingsItem {\n");
    
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

