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
public class PostCharactersAffiliation200Ok {
  @SerializedName("alliance_id")
  private Integer allianceId = null;

  @SerializedName("character_id")
  private Integer characterId = null;

  @SerializedName("corporation_id")
  private Integer corporationId = null;

  @SerializedName("faction_id")
  private Integer factionId = null;

  public PostCharactersAffiliation200Ok allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

   /**
   * The character's alliance ID, if their corporation is in an alliance
   * @return allianceId
  **/
  @ApiModelProperty(value = "The character's alliance ID, if their corporation is in an alliance")
  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public PostCharactersAffiliation200Ok characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * The character's ID
   * @return characterId
  **/
  @ApiModelProperty(required = true, value = "The character's ID")
  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public PostCharactersAffiliation200Ok corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

   /**
   * The character's corporation ID
   * @return corporationId
  **/
  @ApiModelProperty(required = true, value = "The character's corporation ID")
  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public PostCharactersAffiliation200Ok factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

   /**
   * The character's faction ID, if their corporation is in a faction
   * @return factionId
  **/
  @ApiModelProperty(value = "The character's faction ID, if their corporation is in a faction")
  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersAffiliation200Ok postCharactersAffiliation200Ok = (PostCharactersAffiliation200Ok) o;
    return Objects.equals(this.allianceId, postCharactersAffiliation200Ok.allianceId) &&
        Objects.equals(this.characterId, postCharactersAffiliation200Ok.characterId) &&
        Objects.equals(this.corporationId, postCharactersAffiliation200Ok.corporationId) &&
        Objects.equals(this.factionId, postCharactersAffiliation200Ok.factionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, characterId, corporationId, factionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersAffiliation200Ok {\n");
    
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
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

