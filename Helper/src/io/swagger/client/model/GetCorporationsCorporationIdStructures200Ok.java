package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetCorporationsCorporationIdStructuresCurrentVul;
import io.swagger.client.model.GetCorporationsCorporationIdStructuresNextVul;
import io.swagger.client.model.GetCorporationsCorporationIdStructuresService;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCorporationsCorporationIdStructures200Ok {
  @SerializedName("corporation_id")
  private Integer corporationId = null;

  @SerializedName("current_vul")
  private List<GetCorporationsCorporationIdStructuresCurrentVul> currentVul = new ArrayList<GetCorporationsCorporationIdStructuresCurrentVul>();

  @SerializedName("fuel_expires")
  private LocalDate fuelExpires = null;

  @SerializedName("next_vul")
  private List<GetCorporationsCorporationIdStructuresNextVul> nextVul = new ArrayList<GetCorporationsCorporationIdStructuresNextVul>();

  @SerializedName("profile_id")
  private Integer profileId = null;

  @SerializedName("services")
  private List<GetCorporationsCorporationIdStructuresService> services = new ArrayList<GetCorporationsCorporationIdStructuresService>();

  @SerializedName("state_timer_end")
  private LocalDate stateTimerEnd = null;

  @SerializedName("state_timer_start")
  private LocalDate stateTimerStart = null;

  @SerializedName("structure_id")
  private Long structureId = null;

  @SerializedName("system_id")
  private Integer systemId = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  @SerializedName("unanchors_at")
  private LocalDate unanchorsAt = null;

  public GetCorporationsCorporationIdStructures200Ok corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

   /**
   * ID of the corporation that owns the structure
   * @return corporationId
  **/
  @ApiModelProperty(required = true, value = "ID of the corporation that owns the structure")
  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetCorporationsCorporationIdStructures200Ok currentVul(List<GetCorporationsCorporationIdStructuresCurrentVul> currentVul) {
    this.currentVul = currentVul;
    return this;
  }

  public GetCorporationsCorporationIdStructures200Ok addCurrentVulItem(GetCorporationsCorporationIdStructuresCurrentVul currentVulItem) {
    this.currentVul.add(currentVulItem);
    return this;
  }

   /**
   * This week's vulnerability windows, Monday is day 0
   * @return currentVul
  **/
  @ApiModelProperty(required = true, value = "This week's vulnerability windows, Monday is day 0")
  public List<GetCorporationsCorporationIdStructuresCurrentVul> getCurrentVul() {
    return currentVul;
  }

  public void setCurrentVul(List<GetCorporationsCorporationIdStructuresCurrentVul> currentVul) {
    this.currentVul = currentVul;
  }

  public GetCorporationsCorporationIdStructures200Ok fuelExpires(LocalDate fuelExpires) {
    this.fuelExpires = fuelExpires;
    return this;
  }

   /**
   * Date on which the structure will run out of fuel
   * @return fuelExpires
  **/
  @ApiModelProperty(value = "Date on which the structure will run out of fuel")
  public LocalDate getFuelExpires() {
    return fuelExpires;
  }

  public void setFuelExpires(LocalDate fuelExpires) {
    this.fuelExpires = fuelExpires;
  }

  public GetCorporationsCorporationIdStructures200Ok nextVul(List<GetCorporationsCorporationIdStructuresNextVul> nextVul) {
    this.nextVul = nextVul;
    return this;
  }

  public GetCorporationsCorporationIdStructures200Ok addNextVulItem(GetCorporationsCorporationIdStructuresNextVul nextVulItem) {
    this.nextVul.add(nextVulItem);
    return this;
  }

   /**
   * Next week's vulnerability windows, Monday is day 0
   * @return nextVul
  **/
  @ApiModelProperty(required = true, value = "Next week's vulnerability windows, Monday is day 0")
  public List<GetCorporationsCorporationIdStructuresNextVul> getNextVul() {
    return nextVul;
  }

  public void setNextVul(List<GetCorporationsCorporationIdStructuresNextVul> nextVul) {
    this.nextVul = nextVul;
  }

  public GetCorporationsCorporationIdStructures200Ok profileId(Integer profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * The id of the ACL profile for this citadel
   * @return profileId
  **/
  @ApiModelProperty(required = true, value = "The id of the ACL profile for this citadel")
  public Integer getProfileId() {
    return profileId;
  }

  public void setProfileId(Integer profileId) {
    this.profileId = profileId;
  }

  public GetCorporationsCorporationIdStructures200Ok services(List<GetCorporationsCorporationIdStructuresService> services) {
    this.services = services;
    return this;
  }

  public GetCorporationsCorporationIdStructures200Ok addServicesItem(GetCorporationsCorporationIdStructuresService servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Contains a list of service upgrades, and their state
   * @return services
  **/
  @ApiModelProperty(value = "Contains a list of service upgrades, and their state")
  public List<GetCorporationsCorporationIdStructuresService> getServices() {
    return services;
  }

  public void setServices(List<GetCorporationsCorporationIdStructuresService> services) {
    this.services = services;
  }

  public GetCorporationsCorporationIdStructures200Ok stateTimerEnd(LocalDate stateTimerEnd) {
    this.stateTimerEnd = stateTimerEnd;
    return this;
  }

   /**
   * Date at which the structure will move to it's next state
   * @return stateTimerEnd
  **/
  @ApiModelProperty(value = "Date at which the structure will move to it's next state")
  public LocalDate getStateTimerEnd() {
    return stateTimerEnd;
  }

  public void setStateTimerEnd(LocalDate stateTimerEnd) {
    this.stateTimerEnd = stateTimerEnd;
  }

  public GetCorporationsCorporationIdStructures200Ok stateTimerStart(LocalDate stateTimerStart) {
    this.stateTimerStart = stateTimerStart;
    return this;
  }

   /**
   * Date at which the structure entered it's current state
   * @return stateTimerStart
  **/
  @ApiModelProperty(value = "Date at which the structure entered it's current state")
  public LocalDate getStateTimerStart() {
    return stateTimerStart;
  }

  public void setStateTimerStart(LocalDate stateTimerStart) {
    this.stateTimerStart = stateTimerStart;
  }

  public GetCorporationsCorporationIdStructures200Ok structureId(Long structureId) {
    this.structureId = structureId;
    return this;
  }

   /**
   * The Item ID of the structure
   * @return structureId
  **/
  @ApiModelProperty(required = true, value = "The Item ID of the structure")
  public Long getStructureId() {
    return structureId;
  }

  public void setStructureId(Long structureId) {
    this.structureId = structureId;
  }

  public GetCorporationsCorporationIdStructures200Ok systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * The solar system the structure is in
   * @return systemId
  **/
  @ApiModelProperty(required = true, value = "The solar system the structure is in")
  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }

  public GetCorporationsCorporationIdStructures200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * The type id of the structure
   * @return typeId
  **/
  @ApiModelProperty(required = true, value = "The type id of the structure")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public GetCorporationsCorporationIdStructures200Ok unanchorsAt(LocalDate unanchorsAt) {
    this.unanchorsAt = unanchorsAt;
    return this;
  }

   /**
   * Date at which the structure will unanchor
   * @return unanchorsAt
  **/
  @ApiModelProperty(value = "Date at which the structure will unanchor")
  public LocalDate getUnanchorsAt() {
    return unanchorsAt;
  }

  public void setUnanchorsAt(LocalDate unanchorsAt) {
    this.unanchorsAt = unanchorsAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdStructures200Ok getCorporationsCorporationIdStructures200Ok = (GetCorporationsCorporationIdStructures200Ok) o;
    return Objects.equals(this.corporationId, getCorporationsCorporationIdStructures200Ok.corporationId) &&
        Objects.equals(this.currentVul, getCorporationsCorporationIdStructures200Ok.currentVul) &&
        Objects.equals(this.fuelExpires, getCorporationsCorporationIdStructures200Ok.fuelExpires) &&
        Objects.equals(this.nextVul, getCorporationsCorporationIdStructures200Ok.nextVul) &&
        Objects.equals(this.profileId, getCorporationsCorporationIdStructures200Ok.profileId) &&
        Objects.equals(this.services, getCorporationsCorporationIdStructures200Ok.services) &&
        Objects.equals(this.stateTimerEnd, getCorporationsCorporationIdStructures200Ok.stateTimerEnd) &&
        Objects.equals(this.stateTimerStart, getCorporationsCorporationIdStructures200Ok.stateTimerStart) &&
        Objects.equals(this.structureId, getCorporationsCorporationIdStructures200Ok.structureId) &&
        Objects.equals(this.systemId, getCorporationsCorporationIdStructures200Ok.systemId) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdStructures200Ok.typeId) &&
        Objects.equals(this.unanchorsAt, getCorporationsCorporationIdStructures200Ok.unanchorsAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationId, currentVul, fuelExpires, nextVul, profileId, services, stateTimerEnd, stateTimerStart, structureId, systemId, typeId, unanchorsAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdStructures200Ok {\n");
    
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    currentVul: ").append(toIndentedString(currentVul)).append("\n");
    sb.append("    fuelExpires: ").append(toIndentedString(fuelExpires)).append("\n");
    sb.append("    nextVul: ").append(toIndentedString(nextVul)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    stateTimerEnd: ").append(toIndentedString(stateTimerEnd)).append("\n");
    sb.append("    stateTimerStart: ").append(toIndentedString(stateTimerStart)).append("\n");
    sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    unanchorsAt: ").append(toIndentedString(unanchorsAt)).append("\n");
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

