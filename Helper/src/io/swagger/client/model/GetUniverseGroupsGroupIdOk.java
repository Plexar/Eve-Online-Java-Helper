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
public class GetUniverseGroupsGroupIdOk {
  @SerializedName("category_id")
  private Float categoryId = null;

  @SerializedName("group_id")
  private Integer groupId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("published")
  private Boolean published = null;

  @SerializedName("types")
  private List<Integer> types = new ArrayList<Integer>();

  public GetUniverseGroupsGroupIdOk categoryId(Float categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * category_id number
   * @return categoryId
  **/
  @ApiModelProperty(required = true, value = "category_id number")
  public Float getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Float categoryId) {
    this.categoryId = categoryId;
  }

  public GetUniverseGroupsGroupIdOk groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * group_id integer
   * @return groupId
  **/
  @ApiModelProperty(required = true, value = "group_id integer")
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public GetUniverseGroupsGroupIdOk name(String name) {
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

  public GetUniverseGroupsGroupIdOk published(Boolean published) {
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

  public GetUniverseGroupsGroupIdOk types(List<Integer> types) {
    this.types = types;
    return this;
  }

  public GetUniverseGroupsGroupIdOk addTypesItem(Integer typesItem) {
    this.types.add(typesItem);
    return this;
  }

   /**
   * types array
   * @return types
  **/
  @ApiModelProperty(required = true, value = "types array")
  public List<Integer> getTypes() {
    return types;
  }

  public void setTypes(List<Integer> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseGroupsGroupIdOk getUniverseGroupsGroupIdOk = (GetUniverseGroupsGroupIdOk) o;
    return Objects.equals(this.categoryId, getUniverseGroupsGroupIdOk.categoryId) &&
        Objects.equals(this.groupId, getUniverseGroupsGroupIdOk.groupId) &&
        Objects.equals(this.name, getUniverseGroupsGroupIdOk.name) &&
        Objects.equals(this.published, getUniverseGroupsGroupIdOk.published) &&
        Objects.equals(this.types, getUniverseGroupsGroupIdOk.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, groupId, name, published, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseGroupsGroupIdOk {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

