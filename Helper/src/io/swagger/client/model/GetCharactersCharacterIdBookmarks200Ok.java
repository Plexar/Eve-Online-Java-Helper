package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetCharactersCharacterIdBookmarksTarget;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdBookmarks200Ok {
  @SerializedName("bookmark_id")
  private Long bookmarkId = null;

  @SerializedName("create_date")
  private DateTime createDate = null;

  @SerializedName("creator_id")
  private Integer creatorId = null;

  @SerializedName("folder_id")
  private Integer folderId = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("owner_id")
  private Integer ownerId = null;

  @SerializedName("target")
  private GetCharactersCharacterIdBookmarksTarget target = null;

  public GetCharactersCharacterIdBookmarks200Ok bookmarkId(Long bookmarkId) {
    this.bookmarkId = bookmarkId;
    return this;
  }

   /**
   * bookmark_id integer
   * @return bookmarkId
  **/
  @ApiModelProperty(required = true, value = "bookmark_id integer")
  public Long getBookmarkId() {
    return bookmarkId;
  }

  public void setBookmarkId(Long bookmarkId) {
    this.bookmarkId = bookmarkId;
  }

  public GetCharactersCharacterIdBookmarks200Ok createDate(DateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * create_date string
   * @return createDate
  **/
  @ApiModelProperty(required = true, value = "create_date string")
  public DateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(DateTime createDate) {
    this.createDate = createDate;
  }

  public GetCharactersCharacterIdBookmarks200Ok creatorId(Integer creatorId) {
    this.creatorId = creatorId;
    return this;
  }

   /**
   * creator_id integer
   * @return creatorId
  **/
  @ApiModelProperty(required = true, value = "creator_id integer")
  public Integer getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }

  public GetCharactersCharacterIdBookmarks200Ok folderId(Integer folderId) {
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

  public GetCharactersCharacterIdBookmarks200Ok memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * memo string
   * @return memo
  **/
  @ApiModelProperty(required = true, value = "memo string")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public GetCharactersCharacterIdBookmarks200Ok note(String note) {
    this.note = note;
    return this;
  }

   /**
   * note string
   * @return note
  **/
  @ApiModelProperty(required = true, value = "note string")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public GetCharactersCharacterIdBookmarks200Ok ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * owner_id integer
   * @return ownerId
  **/
  @ApiModelProperty(required = true, value = "owner_id integer")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public GetCharactersCharacterIdBookmarks200Ok target(GetCharactersCharacterIdBookmarksTarget target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")
  public GetCharactersCharacterIdBookmarksTarget getTarget() {
    return target;
  }

  public void setTarget(GetCharactersCharacterIdBookmarksTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdBookmarks200Ok getCharactersCharacterIdBookmarks200Ok = (GetCharactersCharacterIdBookmarks200Ok) o;
    return Objects.equals(this.bookmarkId, getCharactersCharacterIdBookmarks200Ok.bookmarkId) &&
        Objects.equals(this.createDate, getCharactersCharacterIdBookmarks200Ok.createDate) &&
        Objects.equals(this.creatorId, getCharactersCharacterIdBookmarks200Ok.creatorId) &&
        Objects.equals(this.folderId, getCharactersCharacterIdBookmarks200Ok.folderId) &&
        Objects.equals(this.memo, getCharactersCharacterIdBookmarks200Ok.memo) &&
        Objects.equals(this.note, getCharactersCharacterIdBookmarks200Ok.note) &&
        Objects.equals(this.ownerId, getCharactersCharacterIdBookmarks200Ok.ownerId) &&
        Objects.equals(this.target, getCharactersCharacterIdBookmarks200Ok.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarkId, createDate, creatorId, folderId, memo, note, ownerId, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdBookmarks200Ok {\n");
    
    sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

