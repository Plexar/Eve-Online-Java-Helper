package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetMarketsStructuresStructureId200Ok {
  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("is_buy_order")
  private Boolean isBuyOrder = null;

  @SerializedName("issued")
  private DateTime issued = null;

  @SerializedName("location_id")
  private Long locationId = null;

  @SerializedName("min_volume")
  private Integer minVolume = null;

  @SerializedName("order_id")
  private Long orderId = null;

  @SerializedName("price")
  private Float price = null;

  /**
   * range string
   */
  public enum RangeEnum {
    @SerializedName("station")
    STATION("station"),
    
    @SerializedName("region")
    REGION("region"),
    
    @SerializedName("solarsystem")
    SOLARSYSTEM("solarsystem"),
    
    @SerializedName("1")
    _1("1"),
    
    @SerializedName("2")
    _2("2"),
    
    @SerializedName("3")
    _3("3"),
    
    @SerializedName("4")
    _4("4"),
    
    @SerializedName("5")
    _5("5"),
    
    @SerializedName("10")
    _10("10"),
    
    @SerializedName("20")
    _20("20"),
    
    @SerializedName("30")
    _30("30"),
    
    @SerializedName("40")
    _40("40");

    private String value;

    RangeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("range")
  private RangeEnum range = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  @SerializedName("volume_remain")
  private Integer volumeRemain = null;

  @SerializedName("volume_total")
  private Integer volumeTotal = null;

  public GetMarketsStructuresStructureId200Ok duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * duration integer
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "duration integer")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public GetMarketsStructuresStructureId200Ok isBuyOrder(Boolean isBuyOrder) {
    this.isBuyOrder = isBuyOrder;
    return this;
  }

   /**
   * is_buy_order boolean
   * @return isBuyOrder
  **/
  @ApiModelProperty(required = true, value = "is_buy_order boolean")
  public Boolean getIsBuyOrder() {
    return isBuyOrder;
  }

  public void setIsBuyOrder(Boolean isBuyOrder) {
    this.isBuyOrder = isBuyOrder;
  }

  public GetMarketsStructuresStructureId200Ok issued(DateTime issued) {
    this.issued = issued;
    return this;
  }

   /**
   * issued string
   * @return issued
  **/
  @ApiModelProperty(required = true, value = "issued string")
  public DateTime getIssued() {
    return issued;
  }

  public void setIssued(DateTime issued) {
    this.issued = issued;
  }

  public GetMarketsStructuresStructureId200Ok locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * location_id integer
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "location_id integer")
  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetMarketsStructuresStructureId200Ok minVolume(Integer minVolume) {
    this.minVolume = minVolume;
    return this;
  }

   /**
   * min_volume integer
   * @return minVolume
  **/
  @ApiModelProperty(required = true, value = "min_volume integer")
  public Integer getMinVolume() {
    return minVolume;
  }

  public void setMinVolume(Integer minVolume) {
    this.minVolume = minVolume;
  }

  public GetMarketsStructuresStructureId200Ok orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * order_id integer
   * @return orderId
  **/
  @ApiModelProperty(required = true, value = "order_id integer")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public GetMarketsStructuresStructureId200Ok price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * price number
   * @return price
  **/
  @ApiModelProperty(required = true, value = "price number")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public GetMarketsStructuresStructureId200Ok range(RangeEnum range) {
    this.range = range;
    return this;
  }

   /**
   * range string
   * @return range
  **/
  @ApiModelProperty(required = true, value = "range string")
  public RangeEnum getRange() {
    return range;
  }

  public void setRange(RangeEnum range) {
    this.range = range;
  }

  public GetMarketsStructuresStructureId200Ok typeId(Integer typeId) {
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

  public GetMarketsStructuresStructureId200Ok volumeRemain(Integer volumeRemain) {
    this.volumeRemain = volumeRemain;
    return this;
  }

   /**
   * volume_remain integer
   * @return volumeRemain
  **/
  @ApiModelProperty(required = true, value = "volume_remain integer")
  public Integer getVolumeRemain() {
    return volumeRemain;
  }

  public void setVolumeRemain(Integer volumeRemain) {
    this.volumeRemain = volumeRemain;
  }

  public GetMarketsStructuresStructureId200Ok volumeTotal(Integer volumeTotal) {
    this.volumeTotal = volumeTotal;
    return this;
  }

   /**
   * volume_total integer
   * @return volumeTotal
  **/
  @ApiModelProperty(required = true, value = "volume_total integer")
  public Integer getVolumeTotal() {
    return volumeTotal;
  }

  public void setVolumeTotal(Integer volumeTotal) {
    this.volumeTotal = volumeTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMarketsStructuresStructureId200Ok getMarketsStructuresStructureId200Ok = (GetMarketsStructuresStructureId200Ok) o;
    return Objects.equals(this.duration, getMarketsStructuresStructureId200Ok.duration) &&
        Objects.equals(this.isBuyOrder, getMarketsStructuresStructureId200Ok.isBuyOrder) &&
        Objects.equals(this.issued, getMarketsStructuresStructureId200Ok.issued) &&
        Objects.equals(this.locationId, getMarketsStructuresStructureId200Ok.locationId) &&
        Objects.equals(this.minVolume, getMarketsStructuresStructureId200Ok.minVolume) &&
        Objects.equals(this.orderId, getMarketsStructuresStructureId200Ok.orderId) &&
        Objects.equals(this.price, getMarketsStructuresStructureId200Ok.price) &&
        Objects.equals(this.range, getMarketsStructuresStructureId200Ok.range) &&
        Objects.equals(this.typeId, getMarketsStructuresStructureId200Ok.typeId) &&
        Objects.equals(this.volumeRemain, getMarketsStructuresStructureId200Ok.volumeRemain) &&
        Objects.equals(this.volumeTotal, getMarketsStructuresStructureId200Ok.volumeTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, isBuyOrder, issued, locationId, minVolume, orderId, price, range, typeId, volumeRemain, volumeTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMarketsStructuresStructureId200Ok {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    isBuyOrder: ").append(toIndentedString(isBuyOrder)).append("\n");
    sb.append("    issued: ").append(toIndentedString(issued)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    minVolume: ").append(toIndentedString(minVolume)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    volumeRemain: ").append(toIndentedString(volumeRemain)).append("\n");
    sb.append("    volumeTotal: ").append(toIndentedString(volumeTotal)).append("\n");
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

