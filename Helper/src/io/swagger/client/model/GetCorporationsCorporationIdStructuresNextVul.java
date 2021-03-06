package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * next_vul object
 */
@ApiModel(description = "next_vul object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCorporationsCorporationIdStructuresNextVul {
  @SerializedName("day")
  private Integer day = null;

  @SerializedName("hour")
  private Integer hour = null;

  public GetCorporationsCorporationIdStructuresNextVul day(Integer day) {
    this.day = day;
    return this;
  }

   /**
   * day integer
   * @return day
  **/
  @ApiModelProperty(required = true, value = "day integer")
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public GetCorporationsCorporationIdStructuresNextVul hour(Integer hour) {
    this.hour = hour;
    return this;
  }

   /**
   * hour integer
   * @return hour
  **/
  @ApiModelProperty(required = true, value = "hour integer")
  public Integer getHour() {
    return hour;
  }

  public void setHour(Integer hour) {
    this.hour = hour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdStructuresNextVul getCorporationsCorporationIdStructuresNextVul = (GetCorporationsCorporationIdStructuresNextVul) o;
    return Objects.equals(this.day, getCorporationsCorporationIdStructuresNextVul.day) &&
        Objects.equals(this.hour, getCorporationsCorporationIdStructuresNextVul.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, hour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdStructuresNextVul {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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

