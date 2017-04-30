package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetIncursions200Ok {
  @SerializedName("constellation_id")
  private Integer constellationId = null;

  @SerializedName("faction_id")
  private Integer factionId = null;

  @SerializedName("has_boss")
  private Boolean hasBoss = null;

  @SerializedName("infested_solar_systems")
  private List<Integer> infestedSolarSystems = new ArrayList<Integer>();

  @SerializedName("influence")
  private Float influence = null;

  @SerializedName("staging_solar_system_id")
  private Integer stagingSolarSystemId = null;

  /**
   * The state of this incursion
   */
  public enum StateEnum {
    @SerializedName("withdrawing")
    WITHDRAWING("withdrawing"),
    
    @SerializedName("mobilizing")
    MOBILIZING("mobilizing"),
    
    @SerializedName("established")
    ESTABLISHED("established");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("type")
  private String type = null;

  public GetIncursions200Ok constellationId(Integer constellationId) {
    this.constellationId = constellationId;
    return this;
  }

   /**
   * The constellation id in which this incursion takes place
   * @return constellationId
  **/
  @ApiModelProperty(required = true, value = "The constellation id in which this incursion takes place")
  public Integer getConstellationId() {
    return constellationId;
  }

  public void setConstellationId(Integer constellationId) {
    this.constellationId = constellationId;
  }

  public GetIncursions200Ok factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

   /**
   * The attacking faction's id
   * @return factionId
  **/
  @ApiModelProperty(required = true, value = "The attacking faction's id")
  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetIncursions200Ok hasBoss(Boolean hasBoss) {
    this.hasBoss = hasBoss;
    return this;
  }

   /**
   * Whether the final encounter has boss or not
   * @return hasBoss
  **/
  @ApiModelProperty(required = true, value = "Whether the final encounter has boss or not")
  public Boolean getHasBoss() {
    return hasBoss;
  }

  public void setHasBoss(Boolean hasBoss) {
    this.hasBoss = hasBoss;
  }

  public GetIncursions200Ok infestedSolarSystems(List<Integer> infestedSolarSystems) {
    this.infestedSolarSystems = infestedSolarSystems;
    return this;
  }

  public GetIncursions200Ok addInfestedSolarSystemsItem(Integer infestedSolarSystemsItem) {
    this.infestedSolarSystems.add(infestedSolarSystemsItem);
    return this;
  }

   /**
   * A list of infested solar system ids that are a part of this incursion
   * @return infestedSolarSystems
  **/
  @ApiModelProperty(required = true, value = "A list of infested solar system ids that are a part of this incursion")
  public List<Integer> getInfestedSolarSystems() {
    return infestedSolarSystems;
  }

  public void setInfestedSolarSystems(List<Integer> infestedSolarSystems) {
    this.infestedSolarSystems = infestedSolarSystems;
  }

  public GetIncursions200Ok influence(Float influence) {
    this.influence = influence;
    return this;
  }

   /**
   * Influence of this incursion as a float from 0 to 1
   * @return influence
  **/
  @ApiModelProperty(required = true, value = "Influence of this incursion as a float from 0 to 1")
  public Float getInfluence() {
    return influence;
  }

  public void setInfluence(Float influence) {
    this.influence = influence;
  }

  public GetIncursions200Ok stagingSolarSystemId(Integer stagingSolarSystemId) {
    this.stagingSolarSystemId = stagingSolarSystemId;
    return this;
  }

   /**
   * Staging solar system for this incursion
   * @return stagingSolarSystemId
  **/
  @ApiModelProperty(required = true, value = "Staging solar system for this incursion")
  public Integer getStagingSolarSystemId() {
    return stagingSolarSystemId;
  }

  public void setStagingSolarSystemId(Integer stagingSolarSystemId) {
    this.stagingSolarSystemId = stagingSolarSystemId;
  }

  public GetIncursions200Ok state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of this incursion
   * @return state
  **/
  @ApiModelProperty(required = true, value = "The state of this incursion")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public GetIncursions200Ok type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of this incursion
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of this incursion")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIncursions200Ok getIncursions200Ok = (GetIncursions200Ok) o;
    return Objects.equals(this.constellationId, getIncursions200Ok.constellationId) &&
        Objects.equals(this.factionId, getIncursions200Ok.factionId) &&
        Objects.equals(this.hasBoss, getIncursions200Ok.hasBoss) &&
        Objects.equals(this.infestedSolarSystems, getIncursions200Ok.infestedSolarSystems) &&
        Objects.equals(this.influence, getIncursions200Ok.influence) &&
        Objects.equals(this.stagingSolarSystemId, getIncursions200Ok.stagingSolarSystemId) &&
        Objects.equals(this.state, getIncursions200Ok.state) &&
        Objects.equals(this.type, getIncursions200Ok.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constellationId, factionId, hasBoss, infestedSolarSystems, influence, stagingSolarSystemId, state, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIncursions200Ok {\n");
    
    sb.append("    constellationId: ").append(toIndentedString(constellationId)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    hasBoss: ").append(toIndentedString(hasBoss)).append("\n");
    sb.append("    infestedSolarSystems: ").append(toIndentedString(infestedSolarSystems)).append("\n");
    sb.append("    influence: ").append(toIndentedString(influence)).append("\n");
    sb.append("    stagingSolarSystemId: ").append(toIndentedString(stagingSolarSystemId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

