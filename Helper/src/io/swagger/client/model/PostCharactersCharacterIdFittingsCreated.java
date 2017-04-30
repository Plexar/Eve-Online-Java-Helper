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
public class PostCharactersCharacterIdFittingsCreated {
  @SerializedName("fitting_id")
  private Integer fittingId = null;

  public PostCharactersCharacterIdFittingsCreated fittingId(Integer fittingId) {
    this.fittingId = fittingId;
    return this;
  }

   /**
   * fitting_id integer
   * @return fittingId
  **/
  @ApiModelProperty(required = true, value = "fitting_id integer")
  public Integer getFittingId() {
    return fittingId;
  }

  public void setFittingId(Integer fittingId) {
    this.fittingId = fittingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdFittingsCreated postCharactersCharacterIdFittingsCreated = (PostCharactersCharacterIdFittingsCreated) o;
    return Objects.equals(this.fittingId, postCharactersCharacterIdFittingsCreated.fittingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fittingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdFittingsCreated {\n");
    
    sb.append("    fittingId: ").append(toIndentedString(fittingId)).append("\n");
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

