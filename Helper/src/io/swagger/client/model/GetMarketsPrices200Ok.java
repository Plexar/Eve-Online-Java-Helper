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
public class GetMarketsPrices200Ok {
  @SerializedName("adjusted_price")
  private Float adjustedPrice = null;

  @SerializedName("average_price")
  private Float averagePrice = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetMarketsPrices200Ok adjustedPrice(Float adjustedPrice) {
    this.adjustedPrice = adjustedPrice;
    return this;
  }

   /**
   * adjusted_price number
   * @return adjustedPrice
  **/
  @ApiModelProperty(value = "adjusted_price number")
  public Float getAdjustedPrice() {
    return adjustedPrice;
  }

  public void setAdjustedPrice(Float adjustedPrice) {
    this.adjustedPrice = adjustedPrice;
  }

  public GetMarketsPrices200Ok averagePrice(Float averagePrice) {
    this.averagePrice = averagePrice;
    return this;
  }

   /**
   * average_price number
   * @return averagePrice
  **/
  @ApiModelProperty(value = "average_price number")
  public Float getAveragePrice() {
    return averagePrice;
  }

  public void setAveragePrice(Float averagePrice) {
    this.averagePrice = averagePrice;
  }

  public GetMarketsPrices200Ok typeId(Integer typeId) {
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
    GetMarketsPrices200Ok getMarketsPrices200Ok = (GetMarketsPrices200Ok) o;
    return Objects.equals(this.adjustedPrice, getMarketsPrices200Ok.adjustedPrice) &&
        Objects.equals(this.averagePrice, getMarketsPrices200Ok.averagePrice) &&
        Objects.equals(this.typeId, getMarketsPrices200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustedPrice, averagePrice, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMarketsPrices200Ok {\n");
    
    sb.append("    adjustedPrice: ").append(toIndentedString(adjustedPrice)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
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

