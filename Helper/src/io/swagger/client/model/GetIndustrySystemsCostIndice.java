package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * cost_indice object
 */
@ApiModel(description = "cost_indice object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetIndustrySystemsCostIndice {
  /**
   * activity string
   */
  public enum ActivityEnum {
    @SerializedName("none")
    NONE("none"),
    
    @SerializedName("manufacturing")
    MANUFACTURING("manufacturing"),
    
    @SerializedName("researching_technology")
    RESEARCHING_TECHNOLOGY("researching_technology"),
    
    @SerializedName("researching_time_efficiency")
    RESEARCHING_TIME_EFFICIENCY("researching_time_efficiency"),
    
    @SerializedName("researching_material_efficiency")
    RESEARCHING_MATERIAL_EFFICIENCY("researching_material_efficiency"),
    
    @SerializedName("copying")
    COPYING("copying"),
    
    @SerializedName("duplicating")
    DUPLICATING("duplicating"),
    
    @SerializedName("invention")
    INVENTION("invention"),
    
    @SerializedName("reverse_engineering")
    REVERSE_ENGINEERING("reverse_engineering");

    private String value;

    ActivityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("activity")
  private ActivityEnum activity = null;

  @SerializedName("cost_index")
  private Float costIndex = null;

  public GetIndustrySystemsCostIndice activity(ActivityEnum activity) {
    this.activity = activity;
    return this;
  }

   /**
   * activity string
   * @return activity
  **/
  @ApiModelProperty(required = true, value = "activity string")
  public ActivityEnum getActivity() {
    return activity;
  }

  public void setActivity(ActivityEnum activity) {
    this.activity = activity;
  }

  public GetIndustrySystemsCostIndice costIndex(Float costIndex) {
    this.costIndex = costIndex;
    return this;
  }

   /**
   * cost_index number
   * @return costIndex
  **/
  @ApiModelProperty(required = true, value = "cost_index number")
  public Float getCostIndex() {
    return costIndex;
  }

  public void setCostIndex(Float costIndex) {
    this.costIndex = costIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIndustrySystemsCostIndice getIndustrySystemsCostIndice = (GetIndustrySystemsCostIndice) o;
    return Objects.equals(this.activity, getIndustrySystemsCostIndice.activity) &&
        Objects.equals(this.costIndex, getIndustrySystemsCostIndice.costIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, costIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIndustrySystemsCostIndice {\n");
    
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    costIndex: ").append(toIndentedString(costIndex)).append("\n");
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

