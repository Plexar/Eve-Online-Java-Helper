package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetKillmailsKillmailIdKillmailHashAttacker;
import io.swagger.client.model.GetKillmailsKillmailIdKillmailHashVictim;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetKillmailsKillmailIdKillmailHashOk {
  @SerializedName("attackers")
  private List<GetKillmailsKillmailIdKillmailHashAttacker> attackers = new ArrayList<GetKillmailsKillmailIdKillmailHashAttacker>();

  @SerializedName("killmail_id")
  private Integer killmailId = null;

  @SerializedName("killmail_time")
  private DateTime killmailTime = null;

  @SerializedName("moon_id")
  private Integer moonId = null;

  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("victim")
  private GetKillmailsKillmailIdKillmailHashVictim victim = null;

  @SerializedName("war_id")
  private Integer warId = null;

  public GetKillmailsKillmailIdKillmailHashOk attackers(List<GetKillmailsKillmailIdKillmailHashAttacker> attackers) {
    this.attackers = attackers;
    return this;
  }

  public GetKillmailsKillmailIdKillmailHashOk addAttackersItem(GetKillmailsKillmailIdKillmailHashAttacker attackersItem) {
    this.attackers.add(attackersItem);
    return this;
  }

   /**
   * attackers array
   * @return attackers
  **/
  @ApiModelProperty(required = true, value = "attackers array")
  public List<GetKillmailsKillmailIdKillmailHashAttacker> getAttackers() {
    return attackers;
  }

  public void setAttackers(List<GetKillmailsKillmailIdKillmailHashAttacker> attackers) {
    this.attackers = attackers;
  }

  public GetKillmailsKillmailIdKillmailHashOk killmailId(Integer killmailId) {
    this.killmailId = killmailId;
    return this;
  }

   /**
   * ID of the killmail
   * @return killmailId
  **/
  @ApiModelProperty(required = true, value = "ID of the killmail")
  public Integer getKillmailId() {
    return killmailId;
  }

  public void setKillmailId(Integer killmailId) {
    this.killmailId = killmailId;
  }

  public GetKillmailsKillmailIdKillmailHashOk killmailTime(DateTime killmailTime) {
    this.killmailTime = killmailTime;
    return this;
  }

   /**
   * Time that the victim was killed and the killmail generated 
   * @return killmailTime
  **/
  @ApiModelProperty(required = true, value = "Time that the victim was killed and the killmail generated ")
  public DateTime getKillmailTime() {
    return killmailTime;
  }

  public void setKillmailTime(DateTime killmailTime) {
    this.killmailTime = killmailTime;
  }

  public GetKillmailsKillmailIdKillmailHashOk moonId(Integer moonId) {
    this.moonId = moonId;
    return this;
  }

   /**
   * Moon if the kill took place at one
   * @return moonId
  **/
  @ApiModelProperty(value = "Moon if the kill took place at one")
  public Integer getMoonId() {
    return moonId;
  }

  public void setMoonId(Integer moonId) {
    this.moonId = moonId;
  }

  public GetKillmailsKillmailIdKillmailHashOk solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * Solar system that the kill took place in 
   * @return solarSystemId
  **/
  @ApiModelProperty(required = true, value = "Solar system that the kill took place in ")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetKillmailsKillmailIdKillmailHashOk victim(GetKillmailsKillmailIdKillmailHashVictim victim) {
    this.victim = victim;
    return this;
  }

   /**
   * Get victim
   * @return victim
  **/
  @ApiModelProperty(value = "")
  public GetKillmailsKillmailIdKillmailHashVictim getVictim() {
    return victim;
  }

  public void setVictim(GetKillmailsKillmailIdKillmailHashVictim victim) {
    this.victim = victim;
  }

  public GetKillmailsKillmailIdKillmailHashOk warId(Integer warId) {
    this.warId = warId;
    return this;
  }

   /**
   * War if the killmail is generated in relation to an official war 
   * @return warId
  **/
  @ApiModelProperty(value = "War if the killmail is generated in relation to an official war ")
  public Integer getWarId() {
    return warId;
  }

  public void setWarId(Integer warId) {
    this.warId = warId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKillmailsKillmailIdKillmailHashOk getKillmailsKillmailIdKillmailHashOk = (GetKillmailsKillmailIdKillmailHashOk) o;
    return Objects.equals(this.attackers, getKillmailsKillmailIdKillmailHashOk.attackers) &&
        Objects.equals(this.killmailId, getKillmailsKillmailIdKillmailHashOk.killmailId) &&
        Objects.equals(this.killmailTime, getKillmailsKillmailIdKillmailHashOk.killmailTime) &&
        Objects.equals(this.moonId, getKillmailsKillmailIdKillmailHashOk.moonId) &&
        Objects.equals(this.solarSystemId, getKillmailsKillmailIdKillmailHashOk.solarSystemId) &&
        Objects.equals(this.victim, getKillmailsKillmailIdKillmailHashOk.victim) &&
        Objects.equals(this.warId, getKillmailsKillmailIdKillmailHashOk.warId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attackers, killmailId, killmailTime, moonId, solarSystemId, victim, warId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashOk {\n");
    
    sb.append("    attackers: ").append(toIndentedString(attackers)).append("\n");
    sb.append("    killmailId: ").append(toIndentedString(killmailId)).append("\n");
    sb.append("    killmailTime: ").append(toIndentedString(killmailTime)).append("\n");
    sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    victim: ").append(toIndentedString(victim)).append("\n");
    sb.append("    warId: ").append(toIndentedString(warId)).append("\n");
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

