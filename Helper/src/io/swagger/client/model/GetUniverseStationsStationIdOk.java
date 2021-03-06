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
public class GetUniverseStationsStationIdOk {
  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("station_name")
  private String stationName = null;

  public GetUniverseStationsStationIdOk solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * solar_system_id integer
   * @return solarSystemId
  **/
  @ApiModelProperty(value = "solar_system_id integer")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetUniverseStationsStationIdOk stationName(String stationName) {
    this.stationName = stationName;
    return this;
  }

   /**
   * the full name of the station
   * @return stationName
  **/
  @ApiModelProperty(value = "the full name of the station")
  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseStationsStationIdOk getUniverseStationsStationIdOk = (GetUniverseStationsStationIdOk) o;
    return Objects.equals(this.solarSystemId, getUniverseStationsStationIdOk.solarSystemId) &&
        Objects.equals(this.stationName, getUniverseStationsStationIdOk.stationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solarSystemId, stationName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseStationsStationIdOk {\n");
    
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    stationName: ").append(toIndentedString(stationName)).append("\n");
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

