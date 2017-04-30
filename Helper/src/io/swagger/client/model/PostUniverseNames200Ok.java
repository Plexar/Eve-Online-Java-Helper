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
public class PostUniverseNames200Ok {
  /**
   * category string
   */
  public enum CategoryEnum {
    @SerializedName("alliance")
    ALLIANCE("alliance"),
    
    @SerializedName("character")
    CHARACTER("character"),
    
    @SerializedName("constellation")
    CONSTELLATION("constellation"),
    
    @SerializedName("corporation")
    CORPORATION("corporation"),
    
    @SerializedName("inventory_type")
    INVENTORY_TYPE("inventory_type"),
    
    @SerializedName("region")
    REGION("region"),
    
    @SerializedName("solar_system")
    SOLAR_SYSTEM("solar_system"),
    
    @SerializedName("station")
    STATION("station");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  public PostUniverseNames200Ok category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * category string
   * @return category
  **/
  @ApiModelProperty(required = true, value = "category string")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public PostUniverseNames200Ok id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * id integer
   * @return id
  **/
  @ApiModelProperty(required = true, value = "id integer")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PostUniverseNames200Ok name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUniverseNames200Ok postUniverseNames200Ok = (PostUniverseNames200Ok) o;
    return Objects.equals(this.category, postUniverseNames200Ok.category) &&
        Objects.equals(this.id, postUniverseNames200Ok.id) &&
        Objects.equals(this.name, postUniverseNames200Ok.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUniverseNames200Ok {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

