package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * blocked object
 */
@ApiModel(description = "blocked object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdChatChannelsBlocked {
  @SerializedName("accessor_id")
  private Integer accessorId = null;

  /**
   * accessor_type string
   */
  public enum AccessorTypeEnum {
    @SerializedName("character")
    CHARACTER("character"),
    
    @SerializedName("corporation")
    CORPORATION("corporation"),
    
    @SerializedName("alliance")
    ALLIANCE("alliance");

    private String value;

    AccessorTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("accessor_type")
  private AccessorTypeEnum accessorType = null;

  @SerializedName("end_at")
  private DateTime endAt = null;

  @SerializedName("reason")
  private String reason = null;

  public GetCharactersCharacterIdChatChannelsBlocked accessorId(Integer accessorId) {
    this.accessorId = accessorId;
    return this;
  }

   /**
   * ID of a blocked channel member
   * @return accessorId
  **/
  @ApiModelProperty(required = true, value = "ID of a blocked channel member")
  public Integer getAccessorId() {
    return accessorId;
  }

  public void setAccessorId(Integer accessorId) {
    this.accessorId = accessorId;
  }

  public GetCharactersCharacterIdChatChannelsBlocked accessorType(AccessorTypeEnum accessorType) {
    this.accessorType = accessorType;
    return this;
  }

   /**
   * accessor_type string
   * @return accessorType
  **/
  @ApiModelProperty(required = true, value = "accessor_type string")
  public AccessorTypeEnum getAccessorType() {
    return accessorType;
  }

  public void setAccessorType(AccessorTypeEnum accessorType) {
    this.accessorType = accessorType;
  }

  public GetCharactersCharacterIdChatChannelsBlocked endAt(DateTime endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * Time at which this accessor will no longer be blocked
   * @return endAt
  **/
  @ApiModelProperty(value = "Time at which this accessor will no longer be blocked")
  public DateTime getEndAt() {
    return endAt;
  }

  public void setEndAt(DateTime endAt) {
    this.endAt = endAt;
  }

  public GetCharactersCharacterIdChatChannelsBlocked reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason this accessor is blocked
   * @return reason
  **/
  @ApiModelProperty(value = "Reason this accessor is blocked")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdChatChannelsBlocked getCharactersCharacterIdChatChannelsBlocked = (GetCharactersCharacterIdChatChannelsBlocked) o;
    return Objects.equals(this.accessorId, getCharactersCharacterIdChatChannelsBlocked.accessorId) &&
        Objects.equals(this.accessorType, getCharactersCharacterIdChatChannelsBlocked.accessorType) &&
        Objects.equals(this.endAt, getCharactersCharacterIdChatChannelsBlocked.endAt) &&
        Objects.equals(this.reason, getCharactersCharacterIdChatChannelsBlocked.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorId, accessorType, endAt, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdChatChannelsBlocked {\n");
    
    sb.append("    accessorId: ").append(toIndentedString(accessorId)).append("\n");
    sb.append("    accessorType: ").append(toIndentedString(accessorType)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

