package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetWarsWarIdAggressor;
import io.swagger.client.model.GetWarsWarIdAlly;
import io.swagger.client.model.GetWarsWarIdDefender;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetWarsWarIdOk {
  @SerializedName("aggressor")
  private GetWarsWarIdAggressor aggressor = null;

  @SerializedName("allies")
  private List<GetWarsWarIdAlly> allies = new ArrayList<GetWarsWarIdAlly>();

  @SerializedName("declared")
  private DateTime declared = null;

  @SerializedName("defender")
  private GetWarsWarIdDefender defender = null;

  @SerializedName("finished")
  private DateTime finished = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("mutual")
  private Boolean mutual = null;

  @SerializedName("open_for_allies")
  private Boolean openForAllies = null;

  @SerializedName("retracted")
  private DateTime retracted = null;

  @SerializedName("started")
  private DateTime started = null;

  public GetWarsWarIdOk aggressor(GetWarsWarIdAggressor aggressor) {
    this.aggressor = aggressor;
    return this;
  }

   /**
   * Get aggressor
   * @return aggressor
  **/
  @ApiModelProperty(value = "")
  public GetWarsWarIdAggressor getAggressor() {
    return aggressor;
  }

  public void setAggressor(GetWarsWarIdAggressor aggressor) {
    this.aggressor = aggressor;
  }

  public GetWarsWarIdOk allies(List<GetWarsWarIdAlly> allies) {
    this.allies = allies;
    return this;
  }

  public GetWarsWarIdOk addAlliesItem(GetWarsWarIdAlly alliesItem) {
    this.allies.add(alliesItem);
    return this;
  }

   /**
   * allied corporations or alliances, each object contains either corporation_id or alliance_id
   * @return allies
  **/
  @ApiModelProperty(value = "allied corporations or alliances, each object contains either corporation_id or alliance_id")
  public List<GetWarsWarIdAlly> getAllies() {
    return allies;
  }

  public void setAllies(List<GetWarsWarIdAlly> allies) {
    this.allies = allies;
  }

  public GetWarsWarIdOk declared(DateTime declared) {
    this.declared = declared;
    return this;
  }

   /**
   * Time that the war was declared
   * @return declared
  **/
  @ApiModelProperty(required = true, value = "Time that the war was declared")
  public DateTime getDeclared() {
    return declared;
  }

  public void setDeclared(DateTime declared) {
    this.declared = declared;
  }

  public GetWarsWarIdOk defender(GetWarsWarIdDefender defender) {
    this.defender = defender;
    return this;
  }

   /**
   * Get defender
   * @return defender
  **/
  @ApiModelProperty(value = "")
  public GetWarsWarIdDefender getDefender() {
    return defender;
  }

  public void setDefender(GetWarsWarIdDefender defender) {
    this.defender = defender;
  }

  public GetWarsWarIdOk finished(DateTime finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Time the war ended and shooting was no longer allowed
   * @return finished
  **/
  @ApiModelProperty(value = "Time the war ended and shooting was no longer allowed")
  public DateTime getFinished() {
    return finished;
  }

  public void setFinished(DateTime finished) {
    this.finished = finished;
  }

  public GetWarsWarIdOk id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the specified war
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID of the specified war")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetWarsWarIdOk mutual(Boolean mutual) {
    this.mutual = mutual;
    return this;
  }

   /**
   * Was the war declared mutual by both parties
   * @return mutual
  **/
  @ApiModelProperty(required = true, value = "Was the war declared mutual by both parties")
  public Boolean getMutual() {
    return mutual;
  }

  public void setMutual(Boolean mutual) {
    this.mutual = mutual;
  }

  public GetWarsWarIdOk openForAllies(Boolean openForAllies) {
    this.openForAllies = openForAllies;
    return this;
  }

   /**
   * Is the war currently open for allies or not
   * @return openForAllies
  **/
  @ApiModelProperty(required = true, value = "Is the war currently open for allies or not")
  public Boolean getOpenForAllies() {
    return openForAllies;
  }

  public void setOpenForAllies(Boolean openForAllies) {
    this.openForAllies = openForAllies;
  }

  public GetWarsWarIdOk retracted(DateTime retracted) {
    this.retracted = retracted;
    return this;
  }

   /**
   * Time the war was retracted but both sides could still shoot each other
   * @return retracted
  **/
  @ApiModelProperty(value = "Time the war was retracted but both sides could still shoot each other")
  public DateTime getRetracted() {
    return retracted;
  }

  public void setRetracted(DateTime retracted) {
    this.retracted = retracted;
  }

  public GetWarsWarIdOk started(DateTime started) {
    this.started = started;
    return this;
  }

   /**
   * Time when the war started and both sides could shoot each other
   * @return started
  **/
  @ApiModelProperty(value = "Time when the war started and both sides could shoot each other")
  public DateTime getStarted() {
    return started;
  }

  public void setStarted(DateTime started) {
    this.started = started;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWarsWarIdOk getWarsWarIdOk = (GetWarsWarIdOk) o;
    return Objects.equals(this.aggressor, getWarsWarIdOk.aggressor) &&
        Objects.equals(this.allies, getWarsWarIdOk.allies) &&
        Objects.equals(this.declared, getWarsWarIdOk.declared) &&
        Objects.equals(this.defender, getWarsWarIdOk.defender) &&
        Objects.equals(this.finished, getWarsWarIdOk.finished) &&
        Objects.equals(this.id, getWarsWarIdOk.id) &&
        Objects.equals(this.mutual, getWarsWarIdOk.mutual) &&
        Objects.equals(this.openForAllies, getWarsWarIdOk.openForAllies) &&
        Objects.equals(this.retracted, getWarsWarIdOk.retracted) &&
        Objects.equals(this.started, getWarsWarIdOk.started);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggressor, allies, declared, defender, finished, id, mutual, openForAllies, retracted, started);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarsWarIdOk {\n");
    
    sb.append("    aggressor: ").append(toIndentedString(aggressor)).append("\n");
    sb.append("    allies: ").append(toIndentedString(allies)).append("\n");
    sb.append("    declared: ").append(toIndentedString(declared)).append("\n");
    sb.append("    defender: ").append(toIndentedString(defender)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mutual: ").append(toIndentedString(mutual)).append("\n");
    sb.append("    openForAllies: ").append(toIndentedString(openForAllies)).append("\n");
    sb.append("    retracted: ").append(toIndentedString(retracted)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
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

