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
public class GetCharactersCharacterIdContacts200Ok {
  @SerializedName("contact_id")
  private Integer contactId = null;

  /**
   * contact_type string
   */
  public enum ContactTypeEnum {
    @SerializedName("character")
    CHARACTER("character"),
    
    @SerializedName("corporation")
    CORPORATION("corporation"),
    
    @SerializedName("alliance")
    ALLIANCE("alliance"),
    
    @SerializedName("faction")
    FACTION("faction");

    private String value;

    ContactTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("contact_type")
  private ContactTypeEnum contactType = null;

  @SerializedName("is_blocked")
  private Boolean isBlocked = null;

  @SerializedName("is_watched")
  private Boolean isWatched = null;

  @SerializedName("label_id")
  private Long labelId = null;

  @SerializedName("standing")
  private Float standing = null;

  public GetCharactersCharacterIdContacts200Ok contactId(Integer contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * contact_id integer
   * @return contactId
  **/
  @ApiModelProperty(required = true, value = "contact_id integer")
  public Integer getContactId() {
    return contactId;
  }

  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }

  public GetCharactersCharacterIdContacts200Ok contactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
    return this;
  }

   /**
   * contact_type string
   * @return contactType
  **/
  @ApiModelProperty(required = true, value = "contact_type string")
  public ContactTypeEnum getContactType() {
    return contactType;
  }

  public void setContactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }

  public GetCharactersCharacterIdContacts200Ok isBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
    return this;
  }

   /**
   * Whether this contact is in the blocked list. Note a missing value denotes unknown, not true or false
   * @return isBlocked
  **/
  @ApiModelProperty(value = "Whether this contact is in the blocked list. Note a missing value denotes unknown, not true or false")
  public Boolean getIsBlocked() {
    return isBlocked;
  }

  public void setIsBlocked(Boolean isBlocked) {
    this.isBlocked = isBlocked;
  }

  public GetCharactersCharacterIdContacts200Ok isWatched(Boolean isWatched) {
    this.isWatched = isWatched;
    return this;
  }

   /**
   * Whether this contact is being watched
   * @return isWatched
  **/
  @ApiModelProperty(value = "Whether this contact is being watched")
  public Boolean getIsWatched() {
    return isWatched;
  }

  public void setIsWatched(Boolean isWatched) {
    this.isWatched = isWatched;
  }

  public GetCharactersCharacterIdContacts200Ok labelId(Long labelId) {
    this.labelId = labelId;
    return this;
  }

   /**
   * Custom label of the contact
   * @return labelId
  **/
  @ApiModelProperty(value = "Custom label of the contact")
  public Long getLabelId() {
    return labelId;
  }

  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }

  public GetCharactersCharacterIdContacts200Ok standing(Float standing) {
    this.standing = standing;
    return this;
  }

   /**
   * Standing of the contact
   * @return standing
  **/
  @ApiModelProperty(required = true, value = "Standing of the contact")
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
    GetCharactersCharacterIdContacts200Ok getCharactersCharacterIdContacts200Ok = (GetCharactersCharacterIdContacts200Ok) o;
    return Objects.equals(this.contactId, getCharactersCharacterIdContacts200Ok.contactId) &&
        Objects.equals(this.contactType, getCharactersCharacterIdContacts200Ok.contactType) &&
        Objects.equals(this.isBlocked, getCharactersCharacterIdContacts200Ok.isBlocked) &&
        Objects.equals(this.isWatched, getCharactersCharacterIdContacts200Ok.isWatched) &&
        Objects.equals(this.labelId, getCharactersCharacterIdContacts200Ok.labelId) &&
        Objects.equals(this.standing, getCharactersCharacterIdContacts200Ok.standing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactType, isBlocked, isWatched, labelId, standing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdContacts200Ok {\n");
    
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    isBlocked: ").append(toIndentedString(isBlocked)).append("\n");
    sb.append("    isWatched: ").append(toIndentedString(isWatched)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
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

