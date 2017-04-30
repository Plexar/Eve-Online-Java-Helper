package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetStatusOk {
  @SerializedName("players")
  private Integer players = null;

  @SerializedName("server_version")
  private String serverVersion = null;

  @SerializedName("start_time")
  private DateTime startTime = null;

  @SerializedName("vip")
  private Boolean vip = null;

  public GetStatusOk players(Integer players) {
    this.players = players;
    return this;
  }

   /**
   * Current online player count
   * @return players
  **/
  @ApiModelProperty(required = true, value = "Current online player count")
  public Integer getPlayers() {
    return players;
  }

  public void setPlayers(Integer players) {
    this.players = players;
  }

  public GetStatusOk serverVersion(String serverVersion) {
    this.serverVersion = serverVersion;
    return this;
  }

   /**
   * Running version as string
   * @return serverVersion
  **/
  @ApiModelProperty(required = true, value = "Running version as string")
  public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }

  public GetStatusOk startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Server start timestamp
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "Server start timestamp")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public GetStatusOk vip(Boolean vip) {
    this.vip = vip;
    return this;
  }

   /**
   * If the server is in VIP mode
   * @return vip
  **/
  @ApiModelProperty(value = "If the server is in VIP mode")
  public Boolean getVip() {
    return vip;
  }

  public void setVip(Boolean vip) {
    this.vip = vip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatusOk getStatusOk = (GetStatusOk) o;
    return Objects.equals(this.players, getStatusOk.players) &&
        Objects.equals(this.serverVersion, getStatusOk.serverVersion) &&
        Objects.equals(this.startTime, getStatusOk.startTime) &&
        Objects.equals(this.vip, getStatusOk.vip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(players, serverVersion, startTime, vip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatusOk {\n");
    
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
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

