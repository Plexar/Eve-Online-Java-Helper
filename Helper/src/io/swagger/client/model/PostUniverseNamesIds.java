package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ids schema
 */
@ApiModel(description = "ids schema")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class PostUniverseNamesIds {
  @SerializedName("ids")
  private List<Integer> ids = new ArrayList<Integer>();

  public PostUniverseNamesIds ids(List<Integer> ids) {
    this.ids = ids;
    return this;
  }

  public PostUniverseNamesIds addIdsItem(Integer idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * ids array
   * @return ids
  **/
  @ApiModelProperty(required = true, value = "ids array")
  public List<Integer> getIds() {
    return ids;
  }

  public void setIds(List<Integer> ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUniverseNamesIds postUniverseNamesIds = (PostUniverseNamesIds) o;
    return Objects.equals(this.ids, postUniverseNamesIds.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUniverseNamesIds {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

