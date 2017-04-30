package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * label object
 */
@ApiModel(description = "label object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class PostCharactersCharacterIdMailLabelsLabel {
  /**
   * Hexadecimal string representing label color, in RGB format 
   */
  public enum ColorEnum {
    @SerializedName("#ffffff")
    FFFFFF("#ffffff"),
    
    @SerializedName("#ffff01")
    FFFF01("#ffff01"),
    
    @SerializedName("#ff6600")
    FF6600("#ff6600"),
    
    @SerializedName("#fe0000")
    FE0000("#fe0000"),
    
    @SerializedName("#9a0000")
    _9A0000("#9a0000"),
    
    @SerializedName("#660066")
    _660066("#660066"),
    
    @SerializedName("#0000fe")
    _0000FE("#0000fe"),
    
    @SerializedName("#0099ff")
    _0099FF("#0099ff"),
    
    @SerializedName("#01ffff")
    _01FFFF("#01ffff"),
    
    @SerializedName("#00ff33")
    _00FF33("#00ff33"),
    
    @SerializedName("#349800")
    _349800("#349800"),
    
    @SerializedName("#006634")
    _006634("#006634"),
    
    @SerializedName("#666666")
    _666666("#666666"),
    
    @SerializedName("#999999")
    _999999("#999999"),
    
    @SerializedName("#e6e6e6")
    E6E6E6("#e6e6e6"),
    
    @SerializedName("#ffffcd")
    FFFFCD("#ffffcd"),
    
    @SerializedName("#99ffff")
    _99FFFF("#99ffff"),
    
    @SerializedName("#ccff9a")
    CCFF9A("#ccff9a");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("color")
  private ColorEnum color = ColorEnum.FFFFFF;

  @SerializedName("name")
  private String name = null;

  public PostCharactersCharacterIdMailLabelsLabel color(ColorEnum color) {
    this.color = color;
    return this;
  }

   /**
   * Hexadecimal string representing label color, in RGB format 
   * @return color
  **/
  @ApiModelProperty(value = "Hexadecimal string representing label color, in RGB format ")
  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }

  public PostCharactersCharacterIdMailLabelsLabel name(String name) {
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
    PostCharactersCharacterIdMailLabelsLabel postCharactersCharacterIdMailLabelsLabel = (PostCharactersCharacterIdMailLabelsLabel) o;
    return Objects.equals(this.color, postCharactersCharacterIdMailLabelsLabel.color) &&
        Objects.equals(this.name, postCharactersCharacterIdMailLabelsLabel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdMailLabelsLabel {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

