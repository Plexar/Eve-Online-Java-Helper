package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails;
import io.swagger.client.model.GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails;
import org.joda.time.DateTime;

/**
 * pin object
 */
@ApiModel(description = "pin object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdPlanetsPlanetIdPin {
  @SerializedName("expiry_time")
  private DateTime expiryTime = null;

  @SerializedName("extractor_details")
  private GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails extractorDetails = null;

  @SerializedName("factory_details")
  private GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails factoryDetails = null;

  @SerializedName("install_time")
  private DateTime installTime = null;

  @SerializedName("last_cycle_start")
  private DateTime lastCycleStart = null;

  @SerializedName("latitude")
  private Float latitude = null;

  @SerializedName("longitude")
  private Float longitude = null;

  @SerializedName("pin_id")
  private Long pinId = null;

  @SerializedName("schematic_id")
  private Integer schematicId = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetCharactersCharacterIdPlanetsPlanetIdPin expiryTime(DateTime expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

   /**
   * expiry_time string
   * @return expiryTime
  **/
  @ApiModelProperty(value = "expiry_time string")
  public DateTime getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(DateTime expiryTime) {
    this.expiryTime = expiryTime;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin extractorDetails(GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails extractorDetails) {
    this.extractorDetails = extractorDetails;
    return this;
  }

   /**
   * Get extractorDetails
   * @return extractorDetails
  **/
  @ApiModelProperty(value = "")
  public GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails getExtractorDetails() {
    return extractorDetails;
  }

  public void setExtractorDetails(GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails extractorDetails) {
    this.extractorDetails = extractorDetails;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin factoryDetails(GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails factoryDetails) {
    this.factoryDetails = factoryDetails;
    return this;
  }

   /**
   * Get factoryDetails
   * @return factoryDetails
  **/
  @ApiModelProperty(value = "")
  public GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails getFactoryDetails() {
    return factoryDetails;
  }

  public void setFactoryDetails(GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails factoryDetails) {
    this.factoryDetails = factoryDetails;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin installTime(DateTime installTime) {
    this.installTime = installTime;
    return this;
  }

   /**
   * install_time string
   * @return installTime
  **/
  @ApiModelProperty(value = "install_time string")
  public DateTime getInstallTime() {
    return installTime;
  }

  public void setInstallTime(DateTime installTime) {
    this.installTime = installTime;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin lastCycleStart(DateTime lastCycleStart) {
    this.lastCycleStart = lastCycleStart;
    return this;
  }

   /**
   * last_cycle_start string
   * @return lastCycleStart
  **/
  @ApiModelProperty(value = "last_cycle_start string")
  public DateTime getLastCycleStart() {
    return lastCycleStart;
  }

  public void setLastCycleStart(DateTime lastCycleStart) {
    this.lastCycleStart = lastCycleStart;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * latitude number
   * @return latitude
  **/
  @ApiModelProperty(required = true, value = "latitude number")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * longitude number
   * @return longitude
  **/
  @ApiModelProperty(required = true, value = "longitude number")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin pinId(Long pinId) {
    this.pinId = pinId;
    return this;
  }

   /**
   * pin_id integer
   * @return pinId
  **/
  @ApiModelProperty(required = true, value = "pin_id integer")
  public Long getPinId() {
    return pinId;
  }

  public void setPinId(Long pinId) {
    this.pinId = pinId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin schematicId(Integer schematicId) {
    this.schematicId = schematicId;
    return this;
  }

   /**
   * schematic_id integer
   * @return schematicId
  **/
  @ApiModelProperty(value = "schematic_id integer")
  public Integer getSchematicId() {
    return schematicId;
  }

  public void setSchematicId(Integer schematicId) {
    this.schematicId = schematicId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin typeId(Integer typeId) {
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
    GetCharactersCharacterIdPlanetsPlanetIdPin getCharactersCharacterIdPlanetsPlanetIdPin = (GetCharactersCharacterIdPlanetsPlanetIdPin) o;
    return Objects.equals(this.expiryTime, getCharactersCharacterIdPlanetsPlanetIdPin.expiryTime) &&
        Objects.equals(this.extractorDetails, getCharactersCharacterIdPlanetsPlanetIdPin.extractorDetails) &&
        Objects.equals(this.factoryDetails, getCharactersCharacterIdPlanetsPlanetIdPin.factoryDetails) &&
        Objects.equals(this.installTime, getCharactersCharacterIdPlanetsPlanetIdPin.installTime) &&
        Objects.equals(this.lastCycleStart, getCharactersCharacterIdPlanetsPlanetIdPin.lastCycleStart) &&
        Objects.equals(this.latitude, getCharactersCharacterIdPlanetsPlanetIdPin.latitude) &&
        Objects.equals(this.longitude, getCharactersCharacterIdPlanetsPlanetIdPin.longitude) &&
        Objects.equals(this.pinId, getCharactersCharacterIdPlanetsPlanetIdPin.pinId) &&
        Objects.equals(this.schematicId, getCharactersCharacterIdPlanetsPlanetIdPin.schematicId) &&
        Objects.equals(this.typeId, getCharactersCharacterIdPlanetsPlanetIdPin.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryTime, extractorDetails, factoryDetails, installTime, lastCycleStart, latitude, longitude, pinId, schematicId, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdPin {\n");
    
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    extractorDetails: ").append(toIndentedString(extractorDetails)).append("\n");
    sb.append("    factoryDetails: ").append(toIndentedString(factoryDetails)).append("\n");
    sb.append("    installTime: ").append(toIndentedString(installTime)).append("\n");
    sb.append("    lastCycleStart: ").append(toIndentedString(lastCycleStart)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    schematicId: ").append(toIndentedString(schematicId)).append("\n");
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

