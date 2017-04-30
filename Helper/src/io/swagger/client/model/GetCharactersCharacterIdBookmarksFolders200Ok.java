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
public class GetCharactersCharacterIdBookmarksFolders200Ok {
  @SerializedName("folder_id")
  private Integer folderId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner_id")
  private Integer ownerId = null;

  public GetCharactersCharacterIdBookmarksFolders200Ok folderId(Integer folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * folder_id integer
   * @return folderId
  **/
  @ApiModelProperty(value = "folder_id integer")
  public Integer getFolderId() {
    return folderId;
  }

  public void setFolderId(Integer folderId) {
    this.folderId = folderId;
  }

  public GetCharactersCharacterIdBookmarksFolders200Ok name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCharactersCharacterIdBookmarksFolders200Ok ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * owner_id integer
   * @return ownerId
  **/
  @ApiModelProperty(value = "owner_id integer")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdBookmarksFolders200Ok getCharactersCharacterIdBookmarksFolders200Ok = (GetCharactersCharacterIdBookmarksFolders200Ok) o;
    return Objects.equals(this.folderId, getCharactersCharacterIdBookmarksFolders200Ok.folderId) &&
        Objects.equals(this.name, getCharactersCharacterIdBookmarksFolders200Ok.name) &&
        Objects.equals(this.ownerId, getCharactersCharacterIdBookmarksFolders200Ok.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folderId, name, ownerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdBookmarksFolders200Ok {\n");
    
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

