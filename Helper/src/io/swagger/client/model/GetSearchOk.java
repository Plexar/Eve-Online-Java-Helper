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
public class GetSearchOk {
  @SerializedName("agent")
  private List<Integer> agent = new ArrayList<Integer>();

  @SerializedName("alliance")
  private List<Integer> alliance = new ArrayList<Integer>();

  @SerializedName("character")
  private List<Integer> character = new ArrayList<Integer>();

  @SerializedName("constellation")
  private List<Integer> constellation = new ArrayList<Integer>();

  @SerializedName("corporation")
  private List<Integer> corporation = new ArrayList<Integer>();

  @SerializedName("faction")
  private List<Integer> faction = new ArrayList<Integer>();

  @SerializedName("inventorytype")
  private List<Integer> inventorytype = new ArrayList<Integer>();

  @SerializedName("region")
  private List<Integer> region = new ArrayList<Integer>();

  @SerializedName("solarsystem")
  private List<Integer> solarsystem = new ArrayList<Integer>();

  @SerializedName("station")
  private List<Integer> station = new ArrayList<Integer>();

  @SerializedName("wormhole")
  private List<Integer> wormhole = new ArrayList<Integer>();

  public GetSearchOk agent(List<Integer> agent) {
    this.agent = agent;
    return this;
  }

  public GetSearchOk addAgentItem(Integer agentItem) {
    this.agent.add(agentItem);
    return this;
  }

   /**
   * agent array
   * @return agent
  **/
  @ApiModelProperty(value = "agent array")
  public List<Integer> getAgent() {
    return agent;
  }

  public void setAgent(List<Integer> agent) {
    this.agent = agent;
  }

  public GetSearchOk alliance(List<Integer> alliance) {
    this.alliance = alliance;
    return this;
  }

  public GetSearchOk addAllianceItem(Integer allianceItem) {
    this.alliance.add(allianceItem);
    return this;
  }

   /**
   * alliance array
   * @return alliance
  **/
  @ApiModelProperty(value = "alliance array")
  public List<Integer> getAlliance() {
    return alliance;
  }

  public void setAlliance(List<Integer> alliance) {
    this.alliance = alliance;
  }

  public GetSearchOk character(List<Integer> character) {
    this.character = character;
    return this;
  }

  public GetSearchOk addCharacterItem(Integer characterItem) {
    this.character.add(characterItem);
    return this;
  }

   /**
   * character array
   * @return character
  **/
  @ApiModelProperty(value = "character array")
  public List<Integer> getCharacter() {
    return character;
  }

  public void setCharacter(List<Integer> character) {
    this.character = character;
  }

  public GetSearchOk constellation(List<Integer> constellation) {
    this.constellation = constellation;
    return this;
  }

  public GetSearchOk addConstellationItem(Integer constellationItem) {
    this.constellation.add(constellationItem);
    return this;
  }

   /**
   * constellation array
   * @return constellation
  **/
  @ApiModelProperty(value = "constellation array")
  public List<Integer> getConstellation() {
    return constellation;
  }

  public void setConstellation(List<Integer> constellation) {
    this.constellation = constellation;
  }

  public GetSearchOk corporation(List<Integer> corporation) {
    this.corporation = corporation;
    return this;
  }

  public GetSearchOk addCorporationItem(Integer corporationItem) {
    this.corporation.add(corporationItem);
    return this;
  }

   /**
   * corporation array
   * @return corporation
  **/
  @ApiModelProperty(value = "corporation array")
  public List<Integer> getCorporation() {
    return corporation;
  }

  public void setCorporation(List<Integer> corporation) {
    this.corporation = corporation;
  }

  public GetSearchOk faction(List<Integer> faction) {
    this.faction = faction;
    return this;
  }

  public GetSearchOk addFactionItem(Integer factionItem) {
    this.faction.add(factionItem);
    return this;
  }

   /**
   * faction array
   * @return faction
  **/
  @ApiModelProperty(value = "faction array")
  public List<Integer> getFaction() {
    return faction;
  }

  public void setFaction(List<Integer> faction) {
    this.faction = faction;
  }

  public GetSearchOk inventorytype(List<Integer> inventorytype) {
    this.inventorytype = inventorytype;
    return this;
  }

  public GetSearchOk addInventorytypeItem(Integer inventorytypeItem) {
    this.inventorytype.add(inventorytypeItem);
    return this;
  }

   /**
   * inventorytype array
   * @return inventorytype
  **/
  @ApiModelProperty(value = "inventorytype array")
  public List<Integer> getInventorytype() {
    return inventorytype;
  }

  public void setInventorytype(List<Integer> inventorytype) {
    this.inventorytype = inventorytype;
  }

  public GetSearchOk region(List<Integer> region) {
    this.region = region;
    return this;
  }

  public GetSearchOk addRegionItem(Integer regionItem) {
    this.region.add(regionItem);
    return this;
  }

   /**
   * region array
   * @return region
  **/
  @ApiModelProperty(value = "region array")
  public List<Integer> getRegion() {
    return region;
  }

  public void setRegion(List<Integer> region) {
    this.region = region;
  }

  public GetSearchOk solarsystem(List<Integer> solarsystem) {
    this.solarsystem = solarsystem;
    return this;
  }

  public GetSearchOk addSolarsystemItem(Integer solarsystemItem) {
    this.solarsystem.add(solarsystemItem);
    return this;
  }

   /**
   * solarsystem array
   * @return solarsystem
  **/
  @ApiModelProperty(value = "solarsystem array")
  public List<Integer> getSolarsystem() {
    return solarsystem;
  }

  public void setSolarsystem(List<Integer> solarsystem) {
    this.solarsystem = solarsystem;
  }

  public GetSearchOk station(List<Integer> station) {
    this.station = station;
    return this;
  }

  public GetSearchOk addStationItem(Integer stationItem) {
    this.station.add(stationItem);
    return this;
  }

   /**
   * station array
   * @return station
  **/
  @ApiModelProperty(value = "station array")
  public List<Integer> getStation() {
    return station;
  }

  public void setStation(List<Integer> station) {
    this.station = station;
  }

  public GetSearchOk wormhole(List<Integer> wormhole) {
    this.wormhole = wormhole;
    return this;
  }

  public GetSearchOk addWormholeItem(Integer wormholeItem) {
    this.wormhole.add(wormholeItem);
    return this;
  }

   /**
   * wormhole array
   * @return wormhole
  **/
  @ApiModelProperty(value = "wormhole array")
  public List<Integer> getWormhole() {
    return wormhole;
  }

  public void setWormhole(List<Integer> wormhole) {
    this.wormhole = wormhole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSearchOk getSearchOk = (GetSearchOk) o;
    return Objects.equals(this.agent, getSearchOk.agent) &&
        Objects.equals(this.alliance, getSearchOk.alliance) &&
        Objects.equals(this.character, getSearchOk.character) &&
        Objects.equals(this.constellation, getSearchOk.constellation) &&
        Objects.equals(this.corporation, getSearchOk.corporation) &&
        Objects.equals(this.faction, getSearchOk.faction) &&
        Objects.equals(this.inventorytype, getSearchOk.inventorytype) &&
        Objects.equals(this.region, getSearchOk.region) &&
        Objects.equals(this.solarsystem, getSearchOk.solarsystem) &&
        Objects.equals(this.station, getSearchOk.station) &&
        Objects.equals(this.wormhole, getSearchOk.wormhole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, alliance, character, constellation, corporation, faction, inventorytype, region, solarsystem, station, wormhole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSearchOk {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    alliance: ").append(toIndentedString(alliance)).append("\n");
    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    constellation: ").append(toIndentedString(constellation)).append("\n");
    sb.append("    corporation: ").append(toIndentedString(corporation)).append("\n");
    sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
    sb.append("    inventorytype: ").append(toIndentedString(inventorytype)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    solarsystem: ").append(toIndentedString(solarsystem)).append("\n");
    sb.append("    station: ").append(toIndentedString(station)).append("\n");
    sb.append("    wormhole: ").append(toIndentedString(wormhole)).append("\n");
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

