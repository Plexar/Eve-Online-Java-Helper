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
public class GetUniverseSystemsSystemIdOk {
  @SerializedName("solar_system_name")
  private String solarSystemName = null;

  public GetUniverseSystemsSystemIdOk solarSystemName(String solarSystemName) {
    this.solarSystemName = solarSystemName;
    return this;
  }

   /**
   * the full name of the system
   * @return solarSystemName
  **/
  @ApiModelProperty(value = "the full name of the system")
  public String getSolarSystemName() {
    return solarSystemName;
  }

  public void setSolarSystemName(String solarSystemName) {
    this.solarSystemName = solarSystemName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseSystemsSystemIdOk getUniverseSystemsSystemIdOk = (GetUniverseSystemsSystemIdOk) o;
    return Objects.equals(this.solarSystemName, getUniverseSystemsSystemIdOk.solarSystemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solarSystemName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseSystemsSystemIdOk {\n");
    
    sb.append("    solarSystemName: ").append(toIndentedString(solarSystemName)).append("\n");
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

