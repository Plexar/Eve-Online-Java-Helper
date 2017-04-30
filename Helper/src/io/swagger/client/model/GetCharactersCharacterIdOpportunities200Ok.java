package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdOpportunities200Ok {
  @SerializedName("completed_at")
  private DateTime completedAt = null;

  @SerializedName("task_id")
  private Integer taskId = null;

  public GetCharactersCharacterIdOpportunities200Ok completedAt(DateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * completed_at string
   * @return completedAt
  **/
  @ApiModelProperty(required = true, value = "completed_at string")
  public DateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(DateTime completedAt) {
    this.completedAt = completedAt;
  }

  public GetCharactersCharacterIdOpportunities200Ok taskId(Integer taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * task_id integer
   * @return taskId
  **/
  @ApiModelProperty(required = true, value = "task_id integer")
  public Integer getTaskId() {
    return taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdOpportunities200Ok getCharactersCharacterIdOpportunities200Ok = (GetCharactersCharacterIdOpportunities200Ok) o;
    return Objects.equals(this.completedAt, getCharactersCharacterIdOpportunities200Ok.completedAt) &&
        Objects.equals(this.taskId, getCharactersCharacterIdOpportunities200Ok.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedAt, taskId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdOpportunities200Ok {\n");
    
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

