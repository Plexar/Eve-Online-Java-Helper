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
public class GetCharactersCharacterIdLoyaltyPoints200Ok {
  @SerializedName("corporation_id")
  private Integer corporationId = null;

  @SerializedName("loyalty_points")
  private Integer loyaltyPoints = null;

  public GetCharactersCharacterIdLoyaltyPoints200Ok corporationId(Integer corporationId) {
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

  public GetCharactersCharacterIdLoyaltyPoints200Ok loyaltyPoints(Integer loyaltyPoints) {
    this.loyaltyPoints = loyaltyPoints;
    return this;
  }

   /**
   * loyalty_points integer
   * @return loyaltyPoints
  **/
  @ApiModelProperty(required = true, value = "loyalty_points integer")
  public Integer getLoyaltyPoints() {
    return loyaltyPoints;
  }

  public void setLoyaltyPoints(Integer loyaltyPoints) {
    this.loyaltyPoints = loyaltyPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdLoyaltyPoints200Ok getCharactersCharacterIdLoyaltyPoints200Ok = (GetCharactersCharacterIdLoyaltyPoints200Ok) o;
    return Objects.equals(this.corporationId, getCharactersCharacterIdLoyaltyPoints200Ok.corporationId) &&
        Objects.equals(this.loyaltyPoints, getCharactersCharacterIdLoyaltyPoints200Ok.loyaltyPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationId, loyaltyPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdLoyaltyPoints200Ok {\n");
    
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    loyaltyPoints: ").append(toIndentedString(loyaltyPoints)).append("\n");
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

