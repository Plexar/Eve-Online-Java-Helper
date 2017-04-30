package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetUniverseTypesTypeIdOk {
  @SerializedName("category_id")
  private Integer categoryId = null;

  @SerializedName("graphic_id")
  private Integer graphicId = null;

  @SerializedName("group_id")
  private Integer groupId = null;

  @SerializedName("icon_id")
  private Integer iconId = null;

  @SerializedName("type_description")
  private String typeDescription = null;

  @SerializedName("type_name")
  private String typeName = null;

  public GetUniverseTypesTypeIdOk categoryId(Integer categoryId) {
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

  public GetUniverseTypesTypeIdOk graphicId(Integer graphicId) {
    this.graphicId = graphicId;
    return this;
  }

   /**
   * graphic_id integer
   * @return graphicId
  **/
  @ApiModelProperty(value = "graphic_id integer")
  public Integer getGraphicId() {
    return graphicId;
  }

  public void setGraphicId(Integer graphicId) {
    this.graphicId = graphicId;
  }

  public GetUniverseTypesTypeIdOk groupId(Integer groupId) {
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

  public GetUniverseTypesTypeIdOk iconId(Integer iconId) {
    this.iconId = iconId;
    return this;
  }

   /**
   * icon_id integer
   * @return iconId
  **/
  @ApiModelProperty(value = "icon_id integer")
  public Integer getIconId() {
    return iconId;
  }

  public void setIconId(Integer iconId) {
    this.iconId = iconId;
  }

  public GetUniverseTypesTypeIdOk typeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
    return this;
  }

   /**
   * type_description string
   * @return typeDescription
  **/
  @ApiModelProperty(required = true, value = "type_description string")
  public String getTypeDescription() {
    return typeDescription;
  }

  public void setTypeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
  }

  public GetUniverseTypesTypeIdOk typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * type_name string
   * @return typeName
  **/
  @ApiModelProperty(required = true, value = "type_name string")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseTypesTypeIdOk getUniverseTypesTypeIdOk = (GetUniverseTypesTypeIdOk) o;
    return Objects.equals(this.categoryId, getUniverseTypesTypeIdOk.categoryId) &&
        Objects.equals(this.graphicId, getUniverseTypesTypeIdOk.graphicId) &&
        Objects.equals(this.groupId, getUniverseTypesTypeIdOk.groupId) &&
        Objects.equals(this.iconId, getUniverseTypesTypeIdOk.iconId) &&
        Objects.equals(this.typeDescription, getUniverseTypesTypeIdOk.typeDescription) &&
        Objects.equals(this.typeName, getUniverseTypesTypeIdOk.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, graphicId, groupId, iconId, typeDescription, typeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseTypesTypeIdOk {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    graphicId: ").append(toIndentedString(graphicId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    typeDescription: ").append(toIndentedString(typeDescription)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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

