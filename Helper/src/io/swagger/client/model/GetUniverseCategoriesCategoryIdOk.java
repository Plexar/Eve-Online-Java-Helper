package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetUniverseCategoriesCategoryIdOk {
  @SerializedName("category_id")
  private Integer categoryId = null;

  @SerializedName("groups")
  private List<Integer> groups = new ArrayList<Integer>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("published")
  private Boolean published = null;

  public GetUniverseCategoriesCategoryIdOk categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * category_id integer
   * @return categoryId
  **/
  @ApiModelProperty(required = true, value = "category_id integer")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public GetUniverseCategoriesCategoryIdOk groups(List<Integer> groups) {
    this.groups = groups;
    return this;
  }

  public GetUniverseCategoriesCategoryIdOk addGroupsItem(Integer groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * groups array
   * @return groups
  **/
  @ApiModelProperty(required = true, value = "groups array")
  public List<Integer> getGroups() {
    return groups;
  }

  public void setGroups(List<Integer> groups) {
    this.groups = groups;
  }

  public GetUniverseCategoriesCategoryIdOk name(String name) {
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

  public GetUniverseCategoriesCategoryIdOk published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * published boolean
   * @return published
  **/
  @ApiModelProperty(required = true, value = "published boolean")
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseCategoriesCategoryIdOk getUniverseCategoriesCategoryIdOk = (GetUniverseCategoriesCategoryIdOk) o;
    return Objects.equals(this.categoryId, getUniverseCategoriesCategoryIdOk.categoryId) &&
        Objects.equals(this.groups, getUniverseCategoriesCategoryIdOk.groups) &&
        Objects.equals(this.name, getUniverseCategoriesCategoryIdOk.name) &&
        Objects.equals(this.published, getUniverseCategoriesCategoryIdOk.published);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, groups, name, published);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseCategoriesCategoryIdOk {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
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

