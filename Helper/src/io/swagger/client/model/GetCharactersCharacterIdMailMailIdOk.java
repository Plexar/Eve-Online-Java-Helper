package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GetCharactersCharacterIdMailMailIdRecipient;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCharactersCharacterIdMailMailIdOk {
  @SerializedName("body")
  private String body = null;

  @SerializedName("from")
  private Integer from = null;

  @SerializedName("labels")
  private List<Long> labels = new ArrayList<Long>();

  @SerializedName("read")
  private Boolean read = null;

  @SerializedName("recipients")
  private List<GetCharactersCharacterIdMailMailIdRecipient> recipients = new ArrayList<GetCharactersCharacterIdMailMailIdRecipient>();

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("timestamp")
  private DateTime timestamp = null;

  public GetCharactersCharacterIdMailMailIdOk body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Mail's body
   * @return body
  **/
  @ApiModelProperty(value = "Mail's body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public GetCharactersCharacterIdMailMailIdOk from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * From whom the mail was sent
   * @return from
  **/
  @ApiModelProperty(value = "From whom the mail was sent")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public GetCharactersCharacterIdMailMailIdOk labels(List<Long> labels) {
    this.labels = labels;
    return this;
  }

  public GetCharactersCharacterIdMailMailIdOk addLabelsItem(Long labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Labels attached to the mail
   * @return labels
  **/
  @ApiModelProperty(value = "Labels attached to the mail")
  public List<Long> getLabels() {
    return labels;
  }

  public void setLabels(List<Long> labels) {
    this.labels = labels;
  }

  public GetCharactersCharacterIdMailMailIdOk read(Boolean read) {
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

  public GetCharactersCharacterIdMailMailIdOk recipients(List<GetCharactersCharacterIdMailMailIdRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public GetCharactersCharacterIdMailMailIdOk addRecipientsItem(GetCharactersCharacterIdMailMailIdRecipient recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Recipients of the mail
   * @return recipients
  **/
  @ApiModelProperty(value = "Recipients of the mail")
  public List<GetCharactersCharacterIdMailMailIdRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<GetCharactersCharacterIdMailMailIdRecipient> recipients) {
    this.recipients = recipients;
  }

  public GetCharactersCharacterIdMailMailIdOk subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Mail subject
   * @return subject
  **/
  @ApiModelProperty(value = "Mail subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public GetCharactersCharacterIdMailMailIdOk timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * When the mail was sent
   * @return timestamp
  **/
  @ApiModelProperty(value = "When the mail was sent")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdMailMailIdOk getCharactersCharacterIdMailMailIdOk = (GetCharactersCharacterIdMailMailIdOk) o;
    return Objects.equals(this.body, getCharactersCharacterIdMailMailIdOk.body) &&
        Objects.equals(this.from, getCharactersCharacterIdMailMailIdOk.from) &&
        Objects.equals(this.labels, getCharactersCharacterIdMailMailIdOk.labels) &&
        Objects.equals(this.read, getCharactersCharacterIdMailMailIdOk.read) &&
        Objects.equals(this.recipients, getCharactersCharacterIdMailMailIdOk.recipients) &&
        Objects.equals(this.subject, getCharactersCharacterIdMailMailIdOk.subject) &&
        Objects.equals(this.timestamp, getCharactersCharacterIdMailMailIdOk.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, from, labels, read, recipients, subject, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMailMailIdOk {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

