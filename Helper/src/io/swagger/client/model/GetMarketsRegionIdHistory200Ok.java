package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetMarketsRegionIdHistory200Ok {
  @SerializedName("average")
  private Float average = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("highest")
  private Float highest = null;

  @SerializedName("lowest")
  private Float lowest = null;

  @SerializedName("order_count")
  private Long orderCount = null;

  @SerializedName("volume")
  private Long volume = null;

  public GetMarketsRegionIdHistory200Ok average(Float average) {
    this.average = average;
    return this;
  }

   /**
   * average number
   * @return average
  **/
  @ApiModelProperty(required = true, value = "average number")
  public Float getAverage() {
    return average;
  }

  public void setAverage(Float average) {
    this.average = average;
  }

  public GetMarketsRegionIdHistory200Ok date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date of this historical statistic entry
   * @return date
  **/
  @ApiModelProperty(required = true, value = "The date of this historical statistic entry")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public GetMarketsRegionIdHistory200Ok highest(Float highest) {
    this.highest = highest;
    return this;
  }

   /**
   * highest number
   * @return highest
  **/
  @ApiModelProperty(required = true, value = "highest number")
  public Float getHighest() {
    return highest;
  }

  public void setHighest(Float highest) {
    this.highest = highest;
  }

  public GetMarketsRegionIdHistory200Ok lowest(Float lowest) {
    this.lowest = lowest;
    return this;
  }

   /**
   * lowest number
   * @return lowest
  **/
  @ApiModelProperty(required = true, value = "lowest number")
  public Float getLowest() {
    return lowest;
  }

  public void setLowest(Float lowest) {
    this.lowest = lowest;
  }

  public GetMarketsRegionIdHistory200Ok orderCount(Long orderCount) {
    this.orderCount = orderCount;
    return this;
  }

   /**
   * Total number of orders happened that day
   * @return orderCount
  **/
  @ApiModelProperty(required = true, value = "Total number of orders happened that day")
  public Long getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Long orderCount) {
    this.orderCount = orderCount;
  }

  public GetMarketsRegionIdHistory200Ok volume(Long volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Total
   * @return volume
  **/
  @ApiModelProperty(required = true, value = "Total")
  public Long getVolume() {
    return volume;
  }

  public void setVolume(Long volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMarketsRegionIdHistory200Ok getMarketsRegionIdHistory200Ok = (GetMarketsRegionIdHistory200Ok) o;
    return Objects.equals(this.average, getMarketsRegionIdHistory200Ok.average) &&
        Objects.equals(this.date, getMarketsRegionIdHistory200Ok.date) &&
        Objects.equals(this.highest, getMarketsRegionIdHistory200Ok.highest) &&
        Objects.equals(this.lowest, getMarketsRegionIdHistory200Ok.lowest) &&
        Objects.equals(this.orderCount, getMarketsRegionIdHistory200Ok.orderCount) &&
        Objects.equals(this.volume, getMarketsRegionIdHistory200Ok.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, date, highest, lowest, orderCount, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMarketsRegionIdHistory200Ok {\n");
    
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    highest: ").append(toIndentedString(highest)).append("\n");
    sb.append("    lowest: ").append(toIndentedString(lowest)).append("\n");
    sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

