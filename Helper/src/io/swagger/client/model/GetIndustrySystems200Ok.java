package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetIndustrySystemsCostIndice;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetIndustrySystems200Ok {
  @SerializedName("cost_indices")
  private List<GetIndustrySystemsCostIndice> costIndices = new ArrayList<GetIndustrySystemsCostIndice>();

  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  public GetIndustrySystems200Ok costIndices(List<GetIndustrySystemsCostIndice> costIndices) {
    this.costIndices = costIndices;
    return this;
  }

  public GetIndustrySystems200Ok addCostIndicesItem(GetIndustrySystemsCostIndice costIndicesItem) {
    this.costIndices.add(costIndicesItem);
    return this;
  }

   /**
   * cost_indices array
   * @return costIndices
  **/
  @ApiModelProperty(required = true, value = "cost_indices array")
  public List<GetIndustrySystemsCostIndice> getCostIndices() {
    return costIndices;
  }

  public void setCostIndices(List<GetIndustrySystemsCostIndice> costIndices) {
    this.costIndices = costIndices;
  }

  public GetIndustrySystems200Ok solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * solar_system_id integer
   * @return solarSystemId
  **/
  @ApiModelProperty(required = true, value = "solar_system_id integer")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIndustrySystems200Ok getIndustrySystems200Ok = (GetIndustrySystems200Ok) o;
    return Objects.equals(this.costIndices, getIndustrySystems200Ok.costIndices) &&
        Objects.equals(this.solarSystemId, getIndustrySystems200Ok.solarSystemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costIndices, solarSystemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIndustrySystems200Ok {\n");
    
    sb.append("    costIndices: ").append(toIndentedString(costIndices)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
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

