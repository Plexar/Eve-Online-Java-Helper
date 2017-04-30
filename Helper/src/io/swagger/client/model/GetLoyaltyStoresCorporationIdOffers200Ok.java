package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetLoyaltyStoresCorporationIdOffersRequiredItem;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetLoyaltyStoresCorporationIdOffers200Ok {
  @SerializedName("isk_cost")
  private BigDecimal iskCost = null;

  @SerializedName("lp_cost")
  private Integer lpCost = null;

  @SerializedName("offer_id")
  private Integer offerId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("required_items")
  private List<GetLoyaltyStoresCorporationIdOffersRequiredItem> requiredItems = new ArrayList<GetLoyaltyStoresCorporationIdOffersRequiredItem>();

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetLoyaltyStoresCorporationIdOffers200Ok iskCost(BigDecimal iskCost) {
    this.iskCost = iskCost;
    return this;
  }

   /**
   * isk_cost number
   * @return iskCost
  **/
  @ApiModelProperty(required = true, value = "isk_cost number")
  public BigDecimal getIskCost() {
    return iskCost;
  }

  public void setIskCost(BigDecimal iskCost) {
    this.iskCost = iskCost;
  }

  public GetLoyaltyStoresCorporationIdOffers200Ok lpCost(Integer lpCost) {
    this.lpCost = lpCost;
    return this;
  }

   /**
   * lp_cost integer
   * @return lpCost
  **/
  @ApiModelProperty(required = true, value = "lp_cost integer")
  public Integer getLpCost() {
    return lpCost;
  }

  public void setLpCost(Integer lpCost) {
    this.lpCost = lpCost;
  }

  public GetLoyaltyStoresCorporationIdOffers200Ok offerId(Integer offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * offer_id integer
   * @return offerId
  **/
  @ApiModelProperty(required = true, value = "offer_id integer")
  public Integer getOfferId() {
    return offerId;
  }

  public void setOfferId(Integer offerId) {
    this.offerId = offerId;
  }

  public GetLoyaltyStoresCorporationIdOffers200Ok quantity(Integer quantity) {
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

  public GetLoyaltyStoresCorporationIdOffers200Ok requiredItems(List<GetLoyaltyStoresCorporationIdOffersRequiredItem> requiredItems) {
    this.requiredItems = requiredItems;
    return this;
  }

  public GetLoyaltyStoresCorporationIdOffers200Ok addRequiredItemsItem(GetLoyaltyStoresCorporationIdOffersRequiredItem requiredItemsItem) {
    this.requiredItems.add(requiredItemsItem);
    return this;
  }

   /**
   * required_items array
   * @return requiredItems
  **/
  @ApiModelProperty(required = true, value = "required_items array")
  public List<GetLoyaltyStoresCorporationIdOffersRequiredItem> getRequiredItems() {
    return requiredItems;
  }

  public void setRequiredItems(List<GetLoyaltyStoresCorporationIdOffersRequiredItem> requiredItems) {
    this.requiredItems = requiredItems;
  }

  public GetLoyaltyStoresCorporationIdOffers200Ok typeId(Integer typeId) {
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
    GetLoyaltyStoresCorporationIdOffers200Ok getLoyaltyStoresCorporationIdOffers200Ok = (GetLoyaltyStoresCorporationIdOffers200Ok) o;
    return Objects.equals(this.iskCost, getLoyaltyStoresCorporationIdOffers200Ok.iskCost) &&
        Objects.equals(this.lpCost, getLoyaltyStoresCorporationIdOffers200Ok.lpCost) &&
        Objects.equals(this.offerId, getLoyaltyStoresCorporationIdOffers200Ok.offerId) &&
        Objects.equals(this.quantity, getLoyaltyStoresCorporationIdOffers200Ok.quantity) &&
        Objects.equals(this.requiredItems, getLoyaltyStoresCorporationIdOffers200Ok.requiredItems) &&
        Objects.equals(this.typeId, getLoyaltyStoresCorporationIdOffers200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iskCost, lpCost, offerId, quantity, requiredItems, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoyaltyStoresCorporationIdOffers200Ok {\n");
    
    sb.append("    iskCost: ").append(toIndentedString(iskCost)).append("\n");
    sb.append("    lpCost: ").append(toIndentedString(lpCost)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    requiredItems: ").append(toIndentedString(requiredItems)).append("\n");
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

