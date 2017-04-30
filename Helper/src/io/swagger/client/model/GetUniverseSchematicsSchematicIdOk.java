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
public class GetUniverseSchematicsSchematicIdOk {
  @SerializedName("cycle_time")
  private Integer cycleTime = null;

  @SerializedName("schematic_name")
  private String schematicName = null;

  public GetUniverseSchematicsSchematicIdOk cycleTime(Integer cycleTime) {
    this.cycleTime = cycleTime;
    return this;
  }

   /**
   * Time in seconds to process a run
   * @return cycleTime
  **/
  @ApiModelProperty(required = true, value = "Time in seconds to process a run")
  public Integer getCycleTime() {
    return cycleTime;
  }

  public void setCycleTime(Integer cycleTime) {
    this.cycleTime = cycleTime;
  }

  public GetUniverseSchematicsSchematicIdOk schematicName(String schematicName) {
    this.schematicName = schematicName;
    return this;
  }

   /**
   * schematic_name string
   * @return schematicName
  **/
  @ApiModelProperty(required = true, value = "schematic_name string")
  public String getSchematicName() {
    return schematicName;
  }

  public void setSchematicName(String schematicName) {
    this.schematicName = schematicName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseSchematicsSchematicIdOk getUniverseSchematicsSchematicIdOk = (GetUniverseSchematicsSchematicIdOk) o;
    return Objects.equals(this.cycleTime, getUniverseSchematicsSchematicIdOk.cycleTime) &&
        Objects.equals(this.schematicName, getUniverseSchematicsSchematicIdOk.schematicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleTime, schematicName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseSchematicsSchematicIdOk {\n");
    
    sb.append("    cycleTime: ").append(toIndentedString(cycleTime)).append("\n");
    sb.append("    schematicName: ").append(toIndentedString(schematicName)).append("\n");
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

