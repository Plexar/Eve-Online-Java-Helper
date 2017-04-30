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
public class PostCharactersCharacterIdCspaCreated {
  @SerializedName("cost")
  private Long cost = null;

  public PostCharactersCharacterIdCspaCreated cost(Long cost) {
    this.cost = cost;
    return this;
  }

   /**
   * cost integer
   * @return cost
  **/
  @ApiModelProperty(value = "cost integer")
  public Long getCost() {
    return cost;
  }

  public void setCost(Long cost) {
    this.cost = cost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdCspaCreated postCharactersCharacterIdCspaCreated = (PostCharactersCharacterIdCspaCreated) o;
    return Objects.equals(this.cost, postCharactersCharacterIdCspaCreated.cost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdCspaCreated {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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

