package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetCharactersCharacterIdChatChannelsAllowed;
import io.swagger.client.model.GetCharactersCharacterIdChatChannelsBlocked;
import io.swagger.client.model.GetCharactersCharacterIdChatChannelsMuted;
import io.swagger.client.model.GetCharactersCharacterIdChatChannelsOperator;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdChatChannels200Ok {
  @SerializedName("allowed")
  private List<GetCharactersCharacterIdChatChannelsAllowed> allowed = new ArrayList<GetCharactersCharacterIdChatChannelsAllowed>();

  @SerializedName("blocked")
  private List<GetCharactersCharacterIdChatChannelsBlocked> blocked = new ArrayList<GetCharactersCharacterIdChatChannelsBlocked>();

  @SerializedName("channel_id")
  private Integer channelId = null;

  @SerializedName("comparison_key")
  private String comparisonKey = null;

  @SerializedName("has_password")
  private Boolean hasPassword = null;

  @SerializedName("motd")
  private String motd = null;

  @SerializedName("muted")
  private List<GetCharactersCharacterIdChatChannelsMuted> muted = new ArrayList<GetCharactersCharacterIdChatChannelsMuted>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("operators")
  private List<GetCharactersCharacterIdChatChannelsOperator> operators = new ArrayList<GetCharactersCharacterIdChatChannelsOperator>();

  @SerializedName("owner_id")
  private Integer ownerId = null;

  public GetCharactersCharacterIdChatChannels200Ok allowed(List<GetCharactersCharacterIdChatChannelsAllowed> allowed) {
    this.allowed = allowed;
    return this;
  }

  public GetCharactersCharacterIdChatChannels200Ok addAllowedItem(GetCharactersCharacterIdChatChannelsAllowed allowedItem) {
    this.allowed.add(allowedItem);
    return this;
  }

   /**
   * allowed array
   * @return allowed
  **/
  @ApiModelProperty(required = true, value = "allowed array")
  public List<GetCharactersCharacterIdChatChannelsAllowed> getAllowed() {
    return allowed;
  }

  public void setAllowed(List<GetCharactersCharacterIdChatChannelsAllowed> allowed) {
    this.allowed = allowed;
  }

  public GetCharactersCharacterIdChatChannels200Ok blocked(List<GetCharactersCharacterIdChatChannelsBlocked> blocked) {
    this.blocked = blocked;
    return this;
  }

  public GetCharactersCharacterIdChatChannels200Ok addBlockedItem(GetCharactersCharacterIdChatChannelsBlocked blockedItem) {
    this.blocked.add(blockedItem);
    return this;
  }

   /**
   * blocked array
   * @return blocked
  **/
  @ApiModelProperty(required = true, value = "blocked array")
  public List<GetCharactersCharacterIdChatChannelsBlocked> getBlocked() {
    return blocked;
  }

  public void setBlocked(List<GetCharactersCharacterIdChatChannelsBlocked> blocked) {
    this.blocked = blocked;
  }

  public GetCharactersCharacterIdChatChannels200Ok channelId(Integer channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Unique channel ID. Always negative for player-created channels. Permanent (CCP created) channels have a positive ID, but don't appear in the API
   * @return channelId
  **/
  @ApiModelProperty(required = true, value = "Unique channel ID. Always negative for player-created channels. Permanent (CCP created) channels have a positive ID, but don't appear in the API")
  public Integer getChannelId() {
    return channelId;
  }

  public void setChannelId(Integer channelId) {
    this.channelId = channelId;
  }

  public GetCharactersCharacterIdChatChannels200Ok comparisonKey(String comparisonKey) {
    this.comparisonKey = comparisonKey;
    return this;
  }

   /**
   * Normalized, unique string used to compare channel names
   * @return comparisonKey
  **/
  @ApiModelProperty(required = true, value = "Normalized, unique string used to compare channel names")
  public String getComparisonKey() {
    return comparisonKey;
  }

  public void setComparisonKey(String comparisonKey) {
    this.comparisonKey = comparisonKey;
  }

  public GetCharactersCharacterIdChatChannels200Ok hasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
    return this;
  }

   /**
   * Whether this is a password protected channel
   * @return hasPassword
  **/
  @ApiModelProperty(required = true, value = "Whether this is a password protected channel")
  public Boolean getHasPassword() {
    return hasPassword;
  }

  public void setHasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
  }

  public GetCharactersCharacterIdChatChannels200Ok motd(String motd) {
    this.motd = motd;
    return this;
  }

   /**
   * Message of the day for this channel
   * @return motd
  **/
  @ApiModelProperty(required = true, value = "Message of the day for this channel")
  public String getMotd() {
    return motd;
  }

  public void setMotd(String motd) {
    this.motd = motd;
  }

  public GetCharactersCharacterIdChatChannels200Ok muted(List<GetCharactersCharacterIdChatChannelsMuted> muted) {
    this.muted = muted;
    return this;
  }

  public GetCharactersCharacterIdChatChannels200Ok addMutedItem(GetCharactersCharacterIdChatChannelsMuted mutedItem) {
    this.muted.add(mutedItem);
    return this;
  }

   /**
   * muted array
   * @return muted
  **/
  @ApiModelProperty(required = true, value = "muted array")
  public List<GetCharactersCharacterIdChatChannelsMuted> getMuted() {
    return muted;
  }

  public void setMuted(List<GetCharactersCharacterIdChatChannelsMuted> muted) {
    this.muted = muted;
  }

  public GetCharactersCharacterIdChatChannels200Ok name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Displayed name of channel
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Displayed name of channel")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCharactersCharacterIdChatChannels200Ok operators(List<GetCharactersCharacterIdChatChannelsOperator> operators) {
    this.operators = operators;
    return this;
  }

  public GetCharactersCharacterIdChatChannels200Ok addOperatorsItem(GetCharactersCharacterIdChatChannelsOperator operatorsItem) {
    this.operators.add(operatorsItem);
    return this;
  }

   /**
   * operators array
   * @return operators
  **/
  @ApiModelProperty(required = true, value = "operators array")
  public List<GetCharactersCharacterIdChatChannelsOperator> getOperators() {
    return operators;
  }

  public void setOperators(List<GetCharactersCharacterIdChatChannelsOperator> operators) {
    this.operators = operators;
  }

  public GetCharactersCharacterIdChatChannels200Ok ownerId(Integer ownerId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdChatChannels200Ok getCharactersCharacterIdChatChannels200Ok = (GetCharactersCharacterIdChatChannels200Ok) o;
    return Objects.equals(this.allowed, getCharactersCharacterIdChatChannels200Ok.allowed) &&
        Objects.equals(this.blocked, getCharactersCharacterIdChatChannels200Ok.blocked) &&
        Objects.equals(this.channelId, getCharactersCharacterIdChatChannels200Ok.channelId) &&
        Objects.equals(this.comparisonKey, getCharactersCharacterIdChatChannels200Ok.comparisonKey) &&
        Objects.equals(this.hasPassword, getCharactersCharacterIdChatChannels200Ok.hasPassword) &&
        Objects.equals(this.motd, getCharactersCharacterIdChatChannels200Ok.motd) &&
        Objects.equals(this.muted, getCharactersCharacterIdChatChannels200Ok.muted) &&
        Objects.equals(this.name, getCharactersCharacterIdChatChannels200Ok.name) &&
        Objects.equals(this.operators, getCharactersCharacterIdChatChannels200Ok.operators) &&
        Objects.equals(this.ownerId, getCharactersCharacterIdChatChannels200Ok.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, blocked, channelId, comparisonKey, hasPassword, motd, muted, name, operators, ownerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdChatChannels200Ok {\n");
    
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    comparisonKey: ").append(toIndentedString(comparisonKey)).append("\n");
    sb.append("    hasPassword: ").append(toIndentedString(hasPassword)).append("\n");
    sb.append("    motd: ").append(toIndentedString(motd)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
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

