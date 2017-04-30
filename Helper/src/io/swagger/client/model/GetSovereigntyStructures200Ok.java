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
public class GetSovereigntyStructures200Ok {
  @SerializedName("alliance_id")
  private Integer allianceId = null;

  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("structure_id")
  private Long structureId = null;

  @SerializedName("structure_type_id")
  private Integer structureTypeId = null;

  @SerializedName("vulnerability_occupancy_level")
  private Float vulnerabilityOccupancyLevel = null;

  @SerializedName("vulnerable_end_time")
  private DateTime vulnerableEndTime = null;

  @SerializedName("vulnerable_start_time")
  private DateTime vulnerableStartTime = null;

  public GetSovereigntyStructures200Ok allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

   /**
   * The alliance that owns the structure. 
   * @return allianceId
  **/
  @ApiModelProperty(required = true, value = "The alliance that owns the structure. ")
  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetSovereigntyStructures200Ok solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * Solar system in which the structure is located. 
   * @return solarSystemId
  **/
  @ApiModelProperty(required = true, value = "Solar system in which the structure is located. ")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetSovereigntyStructures200Ok structureId(Long structureId) {
    this.structureId = structureId;
    return this;
  }

   /**
   * Unique item ID for this structure.
   * @return structureId
  **/
  @ApiModelProperty(required = true, value = "Unique item ID for this structure.")
  public Long getStructureId() {
    return structureId;
  }

  public void setStructureId(Long structureId) {
    this.structureId = structureId;
  }

  public GetSovereigntyStructures200Ok structureTypeId(Integer structureTypeId) {
    this.structureTypeId = structureTypeId;
    return this;
  }

   /**
   * A reference to the type of structure this is. 
   * @return structureTypeId
  **/
  @ApiModelProperty(required = true, value = "A reference to the type of structure this is. ")
  public Integer getStructureTypeId() {
    return structureTypeId;
  }

  public void setStructureTypeId(Integer structureTypeId) {
    this.structureTypeId = structureTypeId;
  }

  public GetSovereigntyStructures200Ok vulnerabilityOccupancyLevel(Float vulnerabilityOccupancyLevel) {
    this.vulnerabilityOccupancyLevel = vulnerabilityOccupancyLevel;
    return this;
  }

   /**
   * The occupancy level for the next or current vulnerability window. This takes into account all development indexes and capital system bonuses. Also known as Activity Defense Multiplier from in the client. It increases the time that attackers must spend using their entosis links on the structure. 
   * @return vulnerabilityOccupancyLevel
  **/
  @ApiModelProperty(value = "The occupancy level for the next or current vulnerability window. This takes into account all development indexes and capital system bonuses. Also known as Activity Defense Multiplier from in the client. It increases the time that attackers must spend using their entosis links on the structure. ")
  public Float getVulnerabilityOccupancyLevel() {
    return vulnerabilityOccupancyLevel;
  }

  public void setVulnerabilityOccupancyLevel(Float vulnerabilityOccupancyLevel) {
    this.vulnerabilityOccupancyLevel = vulnerabilityOccupancyLevel;
  }

  public GetSovereigntyStructures200Ok vulnerableEndTime(DateTime vulnerableEndTime) {
    this.vulnerableEndTime = vulnerableEndTime;
    return this;
  }

   /**
   * The time at which the next or current vulnerability window ends. At the end of a vulnerability window the next window is recalculated and locked in along with the vulnerabilityOccupancyLevel. If the structure is not in 100% entosis control of the defender, it will go in to 'overtime' and stay vulnerable for as long as that situation persists. Only once the defenders have 100% entosis control and has the vulnerableEndTime passed does the vulnerability interval expire and a new one is calculated. 
   * @return vulnerableEndTime
  **/
  @ApiModelProperty(value = "The time at which the next or current vulnerability window ends. At the end of a vulnerability window the next window is recalculated and locked in along with the vulnerabilityOccupancyLevel. If the structure is not in 100% entosis control of the defender, it will go in to 'overtime' and stay vulnerable for as long as that situation persists. Only once the defenders have 100% entosis control and has the vulnerableEndTime passed does the vulnerability interval expire and a new one is calculated. ")
  public DateTime getVulnerableEndTime() {
    return vulnerableEndTime;
  }

  public void setVulnerableEndTime(DateTime vulnerableEndTime) {
    this.vulnerableEndTime = vulnerableEndTime;
  }

  public GetSovereigntyStructures200Ok vulnerableStartTime(DateTime vulnerableStartTime) {
    this.vulnerableStartTime = vulnerableStartTime;
    return this;
  }

   /**
   * The next time at which the structure will become vulnerable. Or the start time of the current window if current time is between this and vulnerableEndTime. 
   * @return vulnerableStartTime
  **/
  @ApiModelProperty(value = "The next time at which the structure will become vulnerable. Or the start time of the current window if current time is between this and vulnerableEndTime. ")
  public DateTime getVulnerableStartTime() {
    return vulnerableStartTime;
  }

  public void setVulnerableStartTime(DateTime vulnerableStartTime) {
    this.vulnerableStartTime = vulnerableStartTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSovereigntyStructures200Ok getSovereigntyStructures200Ok = (GetSovereigntyStructures200Ok) o;
    return Objects.equals(this.allianceId, getSovereigntyStructures200Ok.allianceId) &&
        Objects.equals(this.solarSystemId, getSovereigntyStructures200Ok.solarSystemId) &&
        Objects.equals(this.structureId, getSovereigntyStructures200Ok.structureId) &&
        Objects.equals(this.structureTypeId, getSovereigntyStructures200Ok.structureTypeId) &&
        Objects.equals(this.vulnerabilityOccupancyLevel, getSovereigntyStructures200Ok.vulnerabilityOccupancyLevel) &&
        Objects.equals(this.vulnerableEndTime, getSovereigntyStructures200Ok.vulnerableEndTime) &&
        Objects.equals(this.vulnerableStartTime, getSovereigntyStructures200Ok.vulnerableStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, solarSystemId, structureId, structureTypeId, vulnerabilityOccupancyLevel, vulnerableEndTime, vulnerableStartTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSovereigntyStructures200Ok {\n");
    
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
    sb.append("    structureTypeId: ").append(toIndentedString(structureTypeId)).append("\n");
    sb.append("    vulnerabilityOccupancyLevel: ").append(toIndentedString(vulnerabilityOccupancyLevel)).append("\n");
    sb.append("    vulnerableEndTime: ").append(toIndentedString(vulnerableEndTime)).append("\n");
    sb.append("    vulnerableStartTime: ").append(toIndentedString(vulnerableStartTime)).append("\n");
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
