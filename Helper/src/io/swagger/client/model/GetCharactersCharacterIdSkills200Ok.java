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
public class GetCharactersCharacterIdSkills200Ok {
  @SerializedName("current_skill_level")
  private Integer currentSkillLevel = null;

  @SerializedName("skill_id")
  private Integer skillId = null;

  @SerializedName("skillpoints_in_skill")
  private Long skillpointsInSkill = null;

  public GetCharactersCharacterIdSkills200Ok currentSkillLevel(Integer currentSkillLevel) {
    this.currentSkillLevel = currentSkillLevel;
    return this;
  }

   /**
   * current_skill_level integer
   * @return currentSkillLevel
  **/
  @ApiModelProperty(value = "current_skill_level integer")
  public Integer getCurrentSkillLevel() {
    return currentSkillLevel;
  }

  public void setCurrentSkillLevel(Integer currentSkillLevel) {
    this.currentSkillLevel = currentSkillLevel;
  }

  public GetCharactersCharacterIdSkills200Ok skillId(Integer skillId) {
    this.skillId = skillId;
    return this;
  }

   /**
   * skill_id integer
   * @return skillId
  **/
  @ApiModelProperty(value = "skill_id integer")
  public Integer getSkillId() {
    return skillId;
  }

  public void setSkillId(Integer skillId) {
    this.skillId = skillId;
  }

  public GetCharactersCharacterIdSkills200Ok skillpointsInSkill(Long skillpointsInSkill) {
    this.skillpointsInSkill = skillpointsInSkill;
    return this;
  }

   /**
   * skillpoints_in_skill integer
   * @return skillpointsInSkill
  **/
  @ApiModelProperty(value = "skillpoints_in_skill integer")
  public Long getSkillpointsInSkill() {
    return skillpointsInSkill;
  }

  public void setSkillpointsInSkill(Long skillpointsInSkill) {
    this.skillpointsInSkill = skillpointsInSkill;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdSkills200Ok getCharactersCharacterIdSkills200Ok = (GetCharactersCharacterIdSkills200Ok) o;
    return Objects.equals(this.currentSkillLevel, getCharactersCharacterIdSkills200Ok.currentSkillLevel) &&
        Objects.equals(this.skillId, getCharactersCharacterIdSkills200Ok.skillId) &&
        Objects.equals(this.skillpointsInSkill, getCharactersCharacterIdSkills200Ok.skillpointsInSkill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentSkillLevel, skillId, skillpointsInSkill);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdSkills200Ok {\n");
    
    sb.append("    currentSkillLevel: ").append(toIndentedString(currentSkillLevel)).append("\n");
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    skillpointsInSkill: ").append(toIndentedString(skillpointsInSkill)).append("\n");
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

