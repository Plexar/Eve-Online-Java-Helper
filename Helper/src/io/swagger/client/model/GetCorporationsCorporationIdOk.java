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
public class GetCorporationsCorporationIdOk {
  @SerializedName("alliance_id")
  private Integer allianceId = null;

  @SerializedName("ceo_id")
  private Integer ceoId = null;

  @SerializedName("corporation_name")
  private String corporationName = null;

  @SerializedName("member_count")
  private Integer memberCount = null;

  @SerializedName("ticker")
  private String ticker = null;

  public GetCorporationsCorporationIdOk allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

   /**
   * id of alliance that corporation is a member of, if any
   * @return allianceId
  **/
  @ApiModelProperty(value = "id of alliance that corporation is a member of, if any")
  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetCorporationsCorporationIdOk ceoId(Integer ceoId) {
    this.ceoId = ceoId;
    return this;
  }

   /**
   * ceo_id integer
   * @return ceoId
  **/
  @ApiModelProperty(required = true, value = "ceo_id integer")
  public Integer getCeoId() {
    return ceoId;
  }

  public void setCeoId(Integer ceoId) {
    this.ceoId = ceoId;
  }

  public GetCorporationsCorporationIdOk corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

   /**
   * the full name of the corporation
   * @return corporationName
  **/
  @ApiModelProperty(required = true, value = "the full name of the corporation")
  public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }

  public GetCorporationsCorporationIdOk memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * member_count integer
   * @return memberCount
  **/
  @ApiModelProperty(required = true, value = "member_count integer")
  public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public GetCorporationsCorporationIdOk ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * the short name of the corporation
   * @return ticker
  **/
  @ApiModelProperty(required = true, value = "the short name of the corporation")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdOk getCorporationsCorporationIdOk = (GetCorporationsCorporationIdOk) o;
    return Objects.equals(this.allianceId, getCorporationsCorporationIdOk.allianceId) &&
        Objects.equals(this.ceoId, getCorporationsCorporationIdOk.ceoId) &&
        Objects.equals(this.corporationName, getCorporationsCorporationIdOk.corporationName) &&
        Objects.equals(this.memberCount, getCorporationsCorporationIdOk.memberCount) &&
        Objects.equals(this.ticker, getCorporationsCorporationIdOk.ticker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, ceoId, corporationName, memberCount, ticker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdOk {\n");
    
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    ceoId: ").append(toIndentedString(ceoId)).append("\n");
    sb.append("    corporationName: ").append(toIndentedString(corporationName)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
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

