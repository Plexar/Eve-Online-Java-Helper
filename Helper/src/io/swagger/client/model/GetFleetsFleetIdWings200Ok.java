package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetFleetsFleetIdWingsSquad;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetFleetsFleetIdWings200Ok {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("squads")
  private List<GetFleetsFleetIdWingsSquad> squads = new ArrayList<GetFleetsFleetIdWingsSquad>();

  public GetFleetsFleetIdWings200Ok id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * id integer
   * @return id
  **/
  @ApiModelProperty(required = true, value = "id integer")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetFleetsFleetIdWings200Ok name(String name) {
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

  public GetFleetsFleetIdWings200Ok squads(List<GetFleetsFleetIdWingsSquad> squads) {
    this.squads = squads;
    return this;
  }

  public GetFleetsFleetIdWings200Ok addSquadsItem(GetFleetsFleetIdWingsSquad squadsItem) {
    this.squads.add(squadsItem);
    return this;
  }

   /**
   * squads array
   * @return squads
  **/
  @ApiModelProperty(required = true, value = "squads array")
  public List<GetFleetsFleetIdWingsSquad> getSquads() {
    return squads;
  }

  public void setSquads(List<GetFleetsFleetIdWingsSquad> squads) {
    this.squads = squads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFleetsFleetIdWings200Ok getFleetsFleetIdWings200Ok = (GetFleetsFleetIdWings200Ok) o;
    return Objects.equals(this.id, getFleetsFleetIdWings200Ok.id) &&
        Objects.equals(this.name, getFleetsFleetIdWings200Ok.name) &&
        Objects.equals(this.squads, getFleetsFleetIdWings200Ok.squads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, squads);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFleetsFleetIdWings200Ok {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    squads: ").append(toIndentedString(squads)).append("\n");
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

