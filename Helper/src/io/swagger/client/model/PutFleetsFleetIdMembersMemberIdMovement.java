package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * movement object
 */
@ApiModel(description = "movement object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class PutFleetsFleetIdMembersMemberIdMovement {
  /**
   * - If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified - If a character is moved to the `wing_commander` role, only `wing_id` should be specified - If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified - If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified 
   */
  public enum RoleEnum {
    @SerializedName("fleet_commander")
    FLEET_COMMANDER("fleet_commander"),
    
    @SerializedName("wing_commander")
    WING_COMMANDER("wing_commander"),
    
    @SerializedName("squad_commander")
    SQUAD_COMMANDER("squad_commander"),
    
    @SerializedName("squad_member")
    SQUAD_MEMBER("squad_member");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("role")
  private RoleEnum role = null;

  @SerializedName("squad_id")
  private Long squadId = null;

  @SerializedName("wing_id")
  private Long wingId = null;

  public PutFleetsFleetIdMembersMemberIdMovement role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * - If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified - If a character is moved to the `wing_commander` role, only `wing_id` should be specified - If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified - If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified 
   * @return role
  **/
  @ApiModelProperty(required = true, value = "- If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified - If a character is moved to the `wing_commander` role, only `wing_id` should be specified - If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified - If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified ")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public PutFleetsFleetIdMembersMemberIdMovement squadId(Long squadId) {
    this.squadId = squadId;
    return this;
  }

   /**
   * squad_id integer
   * minimum: 0
   * @return squadId
  **/
  @ApiModelProperty(value = "squad_id integer")
  public Long getSquadId() {
    return squadId;
  }

  public void setSquadId(Long squadId) {
    this.squadId = squadId;
  }

  public PutFleetsFleetIdMembersMemberIdMovement wingId(Long wingId) {
    this.wingId = wingId;
    return this;
  }

   /**
   * wing_id integer
   * minimum: 0
   * @return wingId
  **/
  @ApiModelProperty(value = "wing_id integer")
  public Long getWingId() {
    return wingId;
  }

  public void setWingId(Long wingId) {
    this.wingId = wingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutFleetsFleetIdMembersMemberIdMovement putFleetsFleetIdMembersMemberIdMovement = (PutFleetsFleetIdMembersMemberIdMovement) o;
    return Objects.equals(this.role, putFleetsFleetIdMembersMemberIdMovement.role) &&
        Objects.equals(this.squadId, putFleetsFleetIdMembersMemberIdMovement.squadId) &&
        Objects.equals(this.wingId, putFleetsFleetIdMembersMemberIdMovement.wingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, squadId, wingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutFleetsFleetIdMembersMemberIdMovement {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    squadId: ").append(toIndentedString(squadId)).append("\n");
    sb.append("    wingId: ").append(toIndentedString(wingId)).append("\n");
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

