package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetAlliancesAllianceIdLogoUrls;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetAlliancesAllianceIdOk {
  @SerializedName("alliance_name")
  private String allianceName = null;

  @SerializedName("date_founded")
  private DateTime dateFounded = null;

  @SerializedName("executor_corp")
  private Integer executorCorp = null;

  @SerializedName("logo_urls")
  private GetAlliancesAllianceIdLogoUrls logoUrls = null;

  @SerializedName("ticker")
  private String ticker = null;

  public GetAlliancesAllianceIdOk allianceName(String allianceName) {
    this.allianceName = allianceName;
    return this;
  }

   /**
   * the full name of the alliance
   * @return allianceName
  **/
  @ApiModelProperty(required = true, value = "the full name of the alliance")
  public String getAllianceName() {
    return allianceName;
  }

  public void setAllianceName(String allianceName) {
    this.allianceName = allianceName;
  }

  public GetAlliancesAllianceIdOk dateFounded(DateTime dateFounded) {
    this.dateFounded = dateFounded;
    return this;
  }

   /**
   * date_founded string
   * @return dateFounded
  **/
  @ApiModelProperty(required = true, value = "date_founded string")
  public DateTime getDateFounded() {
    return dateFounded;
  }

  public void setDateFounded(DateTime dateFounded) {
    this.dateFounded = dateFounded;
  }

  public GetAlliancesAllianceIdOk executorCorp(Integer executorCorp) {
    this.executorCorp = executorCorp;
    return this;
  }

   /**
   * the executor corporation ID, if this alliance is not closed
   * @return executorCorp
  **/
  @ApiModelProperty(value = "the executor corporation ID, if this alliance is not closed")
  public Integer getExecutorCorp() {
    return executorCorp;
  }

  public void setExecutorCorp(Integer executorCorp) {
    this.executorCorp = executorCorp;
  }

  public GetAlliancesAllianceIdOk logoUrls(GetAlliancesAllianceIdLogoUrls logoUrls) {
    this.logoUrls = logoUrls;
    return this;
  }

   /**
   * Get logoUrls
   * @return logoUrls
  **/
  @ApiModelProperty(value = "")
  public GetAlliancesAllianceIdLogoUrls getLogoUrls() {
    return logoUrls;
  }

  public void setLogoUrls(GetAlliancesAllianceIdLogoUrls logoUrls) {
    this.logoUrls = logoUrls;
  }

  public GetAlliancesAllianceIdOk ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * the short name of the alliance
   * @return ticker
  **/
  @ApiModelProperty(required = true, value = "the short name of the alliance")
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
    GetAlliancesAllianceIdOk getAlliancesAllianceIdOk = (GetAlliancesAllianceIdOk) o;
    return Objects.equals(this.allianceName, getAlliancesAllianceIdOk.allianceName) &&
        Objects.equals(this.dateFounded, getAlliancesAllianceIdOk.dateFounded) &&
        Objects.equals(this.executorCorp, getAlliancesAllianceIdOk.executorCorp) &&
        Objects.equals(this.logoUrls, getAlliancesAllianceIdOk.logoUrls) &&
        Objects.equals(this.ticker, getAlliancesAllianceIdOk.ticker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceName, dateFounded, executorCorp, logoUrls, ticker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlliancesAllianceIdOk {\n");
    
    sb.append("    allianceName: ").append(toIndentedString(allianceName)).append("\n");
    sb.append("    dateFounded: ").append(toIndentedString(dateFounded)).append("\n");
    sb.append("    executorCorp: ").append(toIndentedString(executorCorp)).append("\n");
    sb.append("    logoUrls: ").append(toIndentedString(logoUrls)).append("\n");
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

