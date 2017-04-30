package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 201 created object
 */
@ApiModel(description = "201 created object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class PostFleetsFleetIdWingsWingIdSquadsCreated {
  @SerializedName("squad_id")
  private Long squadId = null;

  public PostFleetsFleetIdWingsWingIdSquadsCreated squadId(Long squadId) {
    this.squadId = squadId;
    return this;
  }

   /**
   * The squad_id of the newly created squad
   * @return squadId
  **/
  @ApiModelProperty(required = true, value = "The squad_id of the newly created squad")
  public Long getSquadId() {
    return squadId;
  }

  public void setSquadId(Long squadId) {
    this.squadId = squadId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostFleetsFleetIdWingsWingIdSquadsCreated postFleetsFleetIdWingsWingIdSquadsCreated = (PostFleetsFleetIdWingsWingIdSquadsCreated) o;
    return Objects.equals(this.squadId, postFleetsFleetIdWingsWingIdSquadsCreated.squadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(squadId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFleetsFleetIdWingsWingIdSquadsCreated {\n");
    
    sb.append("    squadId: ").append(toIndentedString(squadId)).append("\n");
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

