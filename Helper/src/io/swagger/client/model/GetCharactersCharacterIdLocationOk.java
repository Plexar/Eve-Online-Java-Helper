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
public class GetCharactersCharacterIdLocationOk {
  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("station_id")
  private Integer stationId = null;

  @SerializedName("structure_id")
  private Long structureId = null;

  public GetCharactersCharacterIdLocationOk solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * solar_system_id integer
   * @return solarSystemId
  **/
  @ApiModelProperty(required = true, value = "solar_system_id integer")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetCharactersCharacterIdLocationOk stationId(Integer stationId) {
    this.stationId = stationId;
    return this;
  }

   /**
   * station_id integer
   * @return stationId
  **/
  @ApiModelProperty(value = "station_id integer")
  public Integer getStationId() {
    return stationId;
  }

  public void setStationId(Integer stationId) {
    this.stationId = stationId;
  }

  public GetCharactersCharacterIdLocationOk structureId(Long structureId) {
    this.structureId = structureId;
    return this;
  }

   /**
   * structure_id integer
   * @return structureId
  **/
  @ApiModelProperty(value = "structure_id integer")
  public Long getStructureId() {
    return structureId;
  }

  public void setStructureId(Long structureId) {
    this.structureId = structureId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdLocationOk getCharactersCharacterIdLocationOk = (GetCharactersCharacterIdLocationOk) o;
    return Objects.equals(this.solarSystemId, getCharactersCharacterIdLocationOk.solarSystemId) &&
        Objects.equals(this.stationId, getCharactersCharacterIdLocationOk.stationId) &&
        Objects.equals(this.structureId, getCharactersCharacterIdLocationOk.structureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solarSystemId, stationId, structureId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdLocationOk {\n");
    
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
    sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
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

