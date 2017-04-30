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
public class PostFleetsFleetIdWingsCreated {
  @SerializedName("wing_id")
  private Long wingId = null;

  public PostFleetsFleetIdWingsCreated wingId(Long wingId) {
    this.wingId = wingId;
    return this;
  }

   /**
   * The wing_id of the newly created wing
   * @return wingId
  **/
  @ApiModelProperty(required = true, value = "The wing_id of the newly created wing")
  public Long getWingId() {
    return wingId;
  }

  public void setWingId(Long wingId) {
    this.wingId = wingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostFleetsFleetIdWingsCreated postFleetsFleetIdWingsCreated = (PostFleetsFleetIdWingsCreated) o;
    return Objects.equals(this.wingId, postFleetsFleetIdWingsCreated.wingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFleetsFleetIdWingsCreated {\n");
    
    sb.append("    wingId: ").append(toIndentedString(wingId)).append("\n");
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

