package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * service object
 */
@ApiModel(description = "service object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCorporationsCorporationIdStructuresService {
  @SerializedName("name")
  private String name = null;

  /**
   * state string
   */
  public enum StateEnum {
    @SerializedName("online")
    ONLINE("online"),
    
    @SerializedName("offline")
    OFFLINE("offline"),
    
    @SerializedName("cleanup")
    CLEANUP("cleanup");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  public GetCorporationsCorporationIdStructuresService name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCorporationsCorporationIdStructuresService state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * state string
   * @return state
  **/
  @ApiModelProperty(required = true, value = "state string")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdStructuresService getCorporationsCorporationIdStructuresService = (GetCorporationsCorporationIdStructuresService) o;
    return Objects.equals(this.name, getCorporationsCorporationIdStructuresService.name) &&
        Objects.equals(this.state, getCorporationsCorporationIdStructuresService.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdStructuresService {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

