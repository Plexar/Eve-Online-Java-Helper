package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * contents object
 */
@ApiModel(description = "contents object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class PutCharactersCharacterIdMailMailIdContents {
  @SerializedName("labels")
  private List<Long> labels = new ArrayList<Long>();

  @SerializedName("read")
  private Boolean read = null;

  public PutCharactersCharacterIdMailMailIdContents labels(List<Long> labels) {
    this.labels = labels;
    return this;
  }

  public PutCharactersCharacterIdMailMailIdContents addLabelsItem(Long labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Labels to assign to the mail. Pre-existing labels are unassigned.
   * @return labels
  **/
  @ApiModelProperty(value = "Labels to assign to the mail. Pre-existing labels are unassigned.")
  public List<Long> getLabels() {
    return labels;
  }

  public void setLabels(List<Long> labels) {
    this.labels = labels;
  }

  public PutCharactersCharacterIdMailMailIdContents read(Boolean read) {
    this.read = read;
    return this;
  }

   /**
   * Whether the mail is flagged as read
   * @return read
  **/
  @ApiModelProperty(value = "Whether the mail is flagged as read")
  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutCharactersCharacterIdMailMailIdContents putCharactersCharacterIdMailMailIdContents = (PutCharactersCharacterIdMailMailIdContents) o;
    return Objects.equals(this.labels, putCharactersCharacterIdMailMailIdContents.labels) &&
        Objects.equals(this.read, putCharactersCharacterIdMailMailIdContents.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, read);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutCharactersCharacterIdMailMailIdContents {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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

