package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * new_schedule object
 */
@ApiModel(description = "new_schedule object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class PutCorporationsCorporationIdStructuresStructureIdNewSchedule {
  @SerializedName("day")
  private Integer day = null;

  @SerializedName("hour")
  private Integer hour = null;

  public PutCorporationsCorporationIdStructuresStructureIdNewSchedule day(Integer day) {
    this.day = day;
    return this;
  }

   /**
   * Day of the week, zero-indexed to Monday
   * minimum: 0
   * maximum: 6
   * @return day
  **/
  @ApiModelProperty(required = true, value = "Day of the week, zero-indexed to Monday")
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public PutCorporationsCorporationIdStructuresStructureIdNewSchedule hour(Integer hour) {
    this.hour = hour;
    return this;
  }

   /**
   * Hour of the day evetime, zero-indexed to midnight
   * minimum: 0
   * maximum: 23
   * @return hour
  **/
  @ApiModelProperty(required = true, value = "Hour of the day evetime, zero-indexed to midnight")
  public Integer getHour() {
    return hour;
  }

  public void setHour(Integer hour) {
    this.hour = hour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutCorporationsCorporationIdStructuresStructureIdNewSchedule putCorporationsCorporationIdStructuresStructureIdNewSchedule = (PutCorporationsCorporationIdStructuresStructureIdNewSchedule) o;
    return Objects.equals(this.day, putCorporationsCorporationIdStructuresStructureIdNewSchedule.day) &&
        Objects.equals(this.hour, putCorporationsCorporationIdStructuresStructureIdNewSchedule.hour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, hour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutCorporationsCorporationIdStructuresStructureIdNewSchedule {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
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

