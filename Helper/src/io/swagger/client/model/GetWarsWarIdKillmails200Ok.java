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
public class GetWarsWarIdKillmails200Ok {
  @SerializedName("killmail_hash")
  private String killmailHash = null;

  @SerializedName("killmail_id")
  private Integer killmailId = null;

  public GetWarsWarIdKillmails200Ok killmailHash(String killmailHash) {
    this.killmailHash = killmailHash;
    return this;
  }

   /**
   * A hash of this killmail
   * @return killmailHash
  **/
  @ApiModelProperty(required = true, value = "A hash of this killmail")
  public String getKillmailHash() {
    return killmailHash;
  }

  public void setKillmailHash(String killmailHash) {
    this.killmailHash = killmailHash;
  }

  public GetWarsWarIdKillmails200Ok killmailId(Integer killmailId) {
    this.killmailId = killmailId;
    return this;
  }

   /**
   * ID of this killmail
   * @return killmailId
  **/
  @ApiModelProperty(required = true, value = "ID of this killmail")
  public Integer getKillmailId() {
    return killmailId;
  }

  public void setKillmailId(Integer killmailId) {
    this.killmailId = killmailId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWarsWarIdKillmails200Ok getWarsWarIdKillmails200Ok = (GetWarsWarIdKillmails200Ok) o;
    return Objects.equals(this.killmailHash, getWarsWarIdKillmails200Ok.killmailHash) &&
        Objects.equals(this.killmailId, getWarsWarIdKillmails200Ok.killmailId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(killmailHash, killmailId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarsWarIdKillmails200Ok {\n");
    
    sb.append("    killmailHash: ").append(toIndentedString(killmailHash)).append("\n");
    sb.append("    killmailId: ").append(toIndentedString(killmailId)).append("\n");
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

