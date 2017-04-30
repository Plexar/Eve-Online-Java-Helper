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
public class GetCharactersCharacterIdStandings200Ok {
  @SerializedName("from_id")
  private Integer fromId = null;

  /**
   * from_type string
   */
  public enum FromTypeEnum {
    @SerializedName("agent")
    AGENT("agent"),
    
    @SerializedName("npc_corp")
    NPC_CORP("npc_corp"),
    
    @SerializedName("faction")
    FACTION("faction");

    private String value;

    FromTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("from_type")
  private FromTypeEnum fromType = null;

  @SerializedName("standing")
  private Float standing = null;

  public GetCharactersCharacterIdStandings200Ok fromId(Integer fromId) {
    this.fromId = fromId;
    return this;
  }

   /**
   * from_id integer
   * @return fromId
  **/
  @ApiModelProperty(required = true, value = "from_id integer")
  public Integer getFromId() {
    return fromId;
  }

  public void setFromId(Integer fromId) {
    this.fromId = fromId;
  }

  public GetCharactersCharacterIdStandings200Ok fromType(FromTypeEnum fromType) {
    this.fromType = fromType;
    return this;
  }

   /**
   * from_type string
   * @return fromType
  **/
  @ApiModelProperty(required = true, value = "from_type string")
  public FromTypeEnum getFromType() {
    return fromType;
  }

  public void setFromType(FromTypeEnum fromType) {
    this.fromType = fromType;
  }

  public GetCharactersCharacterIdStandings200Ok standing(Float standing) {
    this.standing = standing;
    return this;
  }

   /**
   * standing number
   * minimum: -10.0
   * maximum: 10.0
   * @return standing
  **/
  @ApiModelProperty(required = true, value = "standing number")
  public Float getStanding() {
    return standing;
  }

  public void setStanding(Float standing) {
    this.standing = standing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStandings200Ok getCharactersCharacterIdStandings200Ok = (GetCharactersCharacterIdStandings200Ok) o;
    return Objects.equals(this.fromId, getCharactersCharacterIdStandings200Ok.fromId) &&
        Objects.equals(this.fromType, getCharactersCharacterIdStandings200Ok.fromType) &&
        Objects.equals(this.standing, getCharactersCharacterIdStandings200Ok.standing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromId, fromType, standing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStandings200Ok {\n");
    
    sb.append("    fromId: ").append(toIndentedString(fromId)).append("\n");
    sb.append("    fromType: ").append(toIndentedString(fromType)).append("\n");
    sb.append("    standing: ").append(toIndentedString(standing)).append("\n");
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

