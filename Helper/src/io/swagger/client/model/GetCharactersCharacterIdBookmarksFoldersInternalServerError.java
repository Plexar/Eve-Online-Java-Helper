package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Internal server error
 */
@ApiModel(description = "Internal server error")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdBookmarksFoldersInternalServerError {
  @SerializedName("error")
  private String error = null;

  public GetCharactersCharacterIdBookmarksFoldersInternalServerError error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Internal server error message
   * @return error
  **/
  @ApiModelProperty(value = "Internal server error message")
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
    GetCharactersCharacterIdBookmarksFoldersInternalServerError getCharactersCharacterIdBookmarksFoldersInternalServerError = (GetCharactersCharacterIdBookmarksFoldersInternalServerError) o;
    return Objects.equals(this.error, getCharactersCharacterIdBookmarksFoldersInternalServerError.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdBookmarksFoldersInternalServerError {\n");
    
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

