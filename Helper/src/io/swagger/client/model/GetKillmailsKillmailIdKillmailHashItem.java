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
public class GetKillmailsKillmailIdKillmailHashItem {
  @SerializedName("flag")
  private Integer flag = null;

  @SerializedName("item_type_id")
  private Integer itemTypeId = null;

  @SerializedName("quantity_destroyed")
  private Long quantityDestroyed = null;

  @SerializedName("quantity_dropped")
  private Long quantityDropped = null;

  @SerializedName("singleton")
  private Integer singleton = null;

  public GetKillmailsKillmailIdKillmailHashItem flag(Integer flag) {
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

  public GetKillmailsKillmailIdKillmailHashItem itemTypeId(Integer itemTypeId) {
    this.itemTypeId = itemTypeId;
    return this;
  }

   /**
   * item_type_id integer
   * @return itemTypeId
  **/
  @ApiModelProperty(required = true, value = "item_type_id integer")
  public Integer getItemTypeId() {
    return itemTypeId;
  }

  public void setItemTypeId(Integer itemTypeId) {
    this.itemTypeId = itemTypeId;
  }

  public GetKillmailsKillmailIdKillmailHashItem quantityDestroyed(Long quantityDestroyed) {
    this.quantityDestroyed = quantityDestroyed;
    return this;
  }

   /**
   * quantity_destroyed integer
   * @return quantityDestroyed
  **/
  @ApiModelProperty(value = "quantity_destroyed integer")
  public Long getQuantityDestroyed() {
    return quantityDestroyed;
  }

  public void setQuantityDestroyed(Long quantityDestroyed) {
    this.quantityDestroyed = quantityDestroyed;
  }

  public GetKillmailsKillmailIdKillmailHashItem quantityDropped(Long quantityDropped) {
    this.quantityDropped = quantityDropped;
    return this;
  }

   /**
   * quantity_dropped integer
   * @return quantityDropped
  **/
  @ApiModelProperty(value = "quantity_dropped integer")
  public Long getQuantityDropped() {
    return quantityDropped;
  }

  public void setQuantityDropped(Long quantityDropped) {
    this.quantityDropped = quantityDropped;
  }

  public GetKillmailsKillmailIdKillmailHashItem singleton(Integer singleton) {
    this.singleton = singleton;
    return this;
  }

   /**
   * singleton integer
   * @return singleton
  **/
  @ApiModelProperty(required = true, value = "singleton integer")
  public Integer getSingleton() {
    return singleton;
  }

  public void setSingleton(Integer singleton) {
    this.singleton = singleton;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKillmailsKillmailIdKillmailHashItem getKillmailsKillmailIdKillmailHashItem = (GetKillmailsKillmailIdKillmailHashItem) o;
    return Objects.equals(this.flag, getKillmailsKillmailIdKillmailHashItem.flag) &&
        Objects.equals(this.itemTypeId, getKillmailsKillmailIdKillmailHashItem.itemTypeId) &&
        Objects.equals(this.quantityDestroyed, getKillmailsKillmailIdKillmailHashItem.quantityDestroyed) &&
        Objects.equals(this.quantityDropped, getKillmailsKillmailIdKillmailHashItem.quantityDropped) &&
        Objects.equals(this.singleton, getKillmailsKillmailIdKillmailHashItem.singleton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, itemTypeId, quantityDestroyed, quantityDropped, singleton);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashItem {\n");
    
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    itemTypeId: ").append(toIndentedString(itemTypeId)).append("\n");
    sb.append("    quantityDestroyed: ").append(toIndentedString(quantityDestroyed)).append("\n");
    sb.append("    quantityDropped: ").append(toIndentedString(quantityDropped)).append("\n");
    sb.append("    singleton: ").append(toIndentedString(singleton)).append("\n");
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

