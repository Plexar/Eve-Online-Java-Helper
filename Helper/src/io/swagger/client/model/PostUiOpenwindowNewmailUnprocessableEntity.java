package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Unprocessable entity
 */
@ApiModel(description = "Unprocessable entity")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class PostUiOpenwindowNewmailUnprocessableEntity {
  @SerializedName("error")
  private String error = null;

  public PostUiOpenwindowNewmailUnprocessableEntity error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Unprocessable entity message
   * @return error
  **/
  @ApiModelProperty(value = "Unprocessable entity message")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUiOpenwindowNewmailUnprocessableEntity postUiOpenwindowNewmailUnprocessableEntity = (PostUiOpenwindowNewmailUnprocessableEntity) o;
    return Objects.equals(this.error, postUiOpenwindowNewmailUnprocessableEntity.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUiOpenwindowNewmailUnprocessableEntity {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

